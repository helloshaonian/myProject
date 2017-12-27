package com.myProject.configuration;


import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.github.pagehelper.PageHelper;

@Configuration
public class DatasourceConfiguration {
	
	@Value("${mybatis.mapperLocations}")
	private String mapperLocations;
	
	@Bean(name = "dataSource")
	@Qualifier(value = "dataSource")
	@Primary
	@ConfigurationProperties(prefix = "c3p0")
	 public DataSource dataSource(){
		return DataSourceBuilder.create().
				type(com.mchange.v2.c3p0.ComboPooledDataSource.class).build();
	}
	
	@Bean
    @Primary
    @Autowired
	 public SqlSessionFactory sqlSessionFactoryBean(@Qualifier(value = "dataSource")DataSource dataSource) {
	        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
	        bean.setDataSource(dataSource);
	        //分页插件
	        PageHelper pageHelper = new PageHelper();
	        Properties props = new Properties();
	        props.setProperty("reasonable", "true");
	        props.setProperty("supportMethodsArguments", "true");
	        props.setProperty("returnPageInfo", "check");
	        props.setProperty("params", "count=countSql");
	        pageHelper.setProperties(props);
	        //添加插件
	        bean.setPlugins(new Interceptor[]{pageHelper});
	        try {
	            bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapperLocations));
	            return bean.getObject();
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
}
