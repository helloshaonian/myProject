package com.myProject.configuration.shiro;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.myProject.common.model.Module;
import com.myProject.common.model.Role;
import com.myProject.common.model.User;
import com.myProject.common.service.UserService;


public class AuthRealm extends AuthorizingRealm {

	@Autowired
    private UserService userService;
    
    //认证.登录
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken utoken=(UsernamePasswordToken) token;//获取用户输入的token
        String username = utoken.getUsername();
        User user = userService.findByUserName(username);
        System.out.println(user.getPassword());
        return new SimpleAuthenticationInfo(user, user.getPassword(),this.getClass().getName());//放入shiro.调用CredentialsMatcher检验密码
    }
    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        User user=(User) principal.fromRealm(this.getClass().getName()).iterator().next();//获取session中的用户
    	user = userService.findByUserName(user.getUsername());//清楚缓存重新授权时需要从数据库中重新查询
        List<String> permissions=new ArrayList<String>();
        List<String> roleNames=new ArrayList<String>();
        Set<Role> roles = user.getRoles();
        if(roles.size()>0) {
            for(Role role : roles) {
            	roleNames.add(role.getRname());
                Set<Module> modules = role.getModules();
                if(modules.size()>0) {
                    for(Module module : modules) {
                        permissions.add(module.getMname());
                    }
                }
            }
        }
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        info.addStringPermissions(permissions);//将权限放入shiro中.
        info.addRoles(roleNames);
        System.out.println("shiro授权结束");
        return info;
    }
    
    /**
     * 手动清除缓存
     */
    public void clearCache(){
    	PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
    	this.clearCache(principals);
    }
}
