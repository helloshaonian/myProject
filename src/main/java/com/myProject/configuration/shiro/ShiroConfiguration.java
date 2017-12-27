package com.myProject.configuration.shiro;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
@Configuration
public class ShiroConfiguration {
	
	
	
	@Bean(name="shiroFilter")
    public ShiroFilterFactoryBean shiroFilter(@Qualifier("securityManager") SecurityManager manager) {
        ShiroFilterFactoryBean bean=new ShiroFilterFactoryBean();
        bean.setSecurityManager(manager);
        //配置登录的url和登录成功的url
        bean.setLoginUrl("/v1/login");
        bean.setSuccessUrl("/v1/home");
        bean.setUnauthorizedUrl("/v1/login");
        Map<String, Filter> filtersMap=new LinkedHashMap<String, Filter>();
        filtersMap.put("authc", new ShiroLoginFilter());
        
        bean.setFilters(filtersMap);
        //配置访问权限
        LinkedHashMap<String, String> filterChainDefinitionMap=new LinkedHashMap<String, String>();
        filterChainDefinitionMap.put("/v1/loginUser", "anon"); //表示可以匿名访问
        filterChainDefinitionMap.put("/v1/login", "anon"); 
        filterChainDefinitionMap.put("/logout*","anon");
        filterChainDefinitionMap.put("/view/login.jsp","anon");
        filterChainDefinitionMap.put("/decorators/header.jsp","anon");
        filterChainDefinitionMap.put("/decorators/index.jsp","anon");
        filterChainDefinitionMap.put("/jsp/error.jsp*","anon");
        filterChainDefinitionMap.put("/static/**","anon");
        filterChainDefinitionMap.put("/v1/**","authc");//表示需要认证才可以访问
        //filterChainDefinitionMap.put("/v1/**", "authc");//表示需要认证才可以访问
       
        /*filterChainDefinitionMap.put("/**", "authc");//表示需要认证才可以访问
        filterChainDefinitionMap.put("/*.*", "authc");*/
        bean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return bean;
    }
	
	 @Bean(name="cacheManager")
	 public EhCacheManager ehCacheManager(){
	       System.out.println("ShiroConfiguration.getEhCacheManager()");
	       EhCacheManager cacheManager = new EhCacheManager();
	       cacheManager.setCacheManagerConfigFile("classpath:ehcache-shiro.xml");
	       return cacheManager;
	    }
	 
    //配置核心安全事务管理器
    @Bean(name="securityManager")
    public SecurityManager securityManager(@Qualifier("authRealm") AuthRealm authRealm,@Qualifier("cacheManager")EhCacheManager cacheManager) {
        System.err.println("--------------shiro已经加载----------------");
        DefaultWebSecurityManager manager=new DefaultWebSecurityManager();
        manager.setRealm(authRealm);
        //注入缓存管理器;
        manager.setCacheManager(cacheManager);//这个如果执行多次，也是同样的一个对象;
        return manager;
    }
    //配置自定义的权限登录器
    @Bean(name="authRealm")
    public AuthRealm authRealm(@Qualifier("credentialsMatcher") CredentialsMatcher matcher) {
        AuthRealm authRealm=new AuthRealm();
        authRealm.setCredentialsMatcher(matcher);
        return authRealm;
    }
    //配置自定义的密码比较器
    @Bean(name="credentialsMatcher")
    public CredentialsMatcher credentialsMatcher() {
        return new CredentialsMatcher();
    }
    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor(){
        return new LifecycleBeanPostProcessor();
    }
    @Bean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator creator=new DefaultAdvisorAutoProxyCreator();
        creator.setProxyTargetClass(true);
        return creator;
    }
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(@Qualifier("securityManager") SecurityManager manager) {
        AuthorizationAttributeSourceAdvisor advisor=new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(manager);
        return advisor;
    }
    
    //thyemeleaf使用shiro
    @Bean
    public ShiroDialect shiroDialect(){
    	return new ShiroDialect();
    }
}
