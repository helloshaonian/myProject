package com.myProject.common.controller;

import java.util.Set;

import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.InvalidSessionException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myProject.common.model.Role;
import com.myProject.common.model.User;
import com.myProject.common.service.UserService;


@Controller
@RequestMapping(value = "/v1")
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/login")
	public String login(){
		System.out.println("开始登陆");
		return "view/login";
	}
	
	@RequestMapping("/loginUser")
	public String loginAdmin(@Valid User user,BindingResult bindingResult,RedirectAttributes redirectAttributes){
		if(bindingResult.hasErrors()){
            return "view/login";
        }
		String username = user.getUsername();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        Subject currentUser = SecurityUtils.getSubject();
        try {
			currentUser.login(token);
		} catch(UnknownAccountException uae){  
			System.out.println("对用户[" + username + "]进行登录验证..验证未通过,未知账户");  
            redirectAttributes.addFlashAttribute("message", "未知账户");  
        }catch(IncorrectCredentialsException ice){  
        	System.out.println("对用户[" + username + "]进行登录验证..验证未通过,错误的凭证");  
            redirectAttributes.addFlashAttribute("message", "密码不正确");  
        }catch(LockedAccountException lae){  
        	System.out.println("对用户[" + username + "]进行登录验证..验证未通过,账户已锁定");  
            redirectAttributes.addFlashAttribute("message", "账户已锁定");  
        }catch(ExcessiveAttemptsException eae){  
        	System.out.println("对用户[" + username + "]进行登录验证..验证未通过,错误次数过多");  
            redirectAttributes.addFlashAttribute("message", "用户名或密码错误次数过多");  
        }catch(AuthenticationException ae){  
            //通过处理Shiro的运行时AuthenticationException就可以控制用户登录失败或密码错误时的情景  
        	System.out.println("对用户[" + username + "]进行登录验证..验证未通过,堆栈轨迹如下");  
            ae.printStackTrace();  
            redirectAttributes.addFlashAttribute("message", "用户名或密码不正确");  
        }  
        if(currentUser.isAuthenticated()){
        	Session session=currentUser.getSession();
        	session.setAttribute("username", user.getUsername());
        	session.setAttribute("roles", userService.findByUserName(username).getRoles());
        	return "redirect:/v1/home";
        }else{
        	return "redirect:/v1/login";
        }
	}
	
	@RequestMapping("/home")
	public String home(){
		return "view/home";
	}
	
	@RequestMapping("/logOut")
	public String logOut(){
		 try {
			Subject subject = SecurityUtils.getSubject();
			 subject.logout();
			 subject.getSession().removeAttribute("username");
		} catch (InvalidSessionException e) {
			e.printStackTrace();
			return "view/login";
		}
	     return "view/login";
	}
}
