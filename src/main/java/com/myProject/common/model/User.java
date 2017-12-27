package com.myProject.common.model;

import java.util.Date;
import java.util.Set;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 *@Description:   实体类 
 *				mp_user
 *@Author:wangyanfei
 */
public class User {

	
	private Integer uid;  //
	
	@NotEmpty(message="用户名不能为空")
	private String username;  //
	
	@Size(min=1,max=10,message="密码的长度应该在1和10之间") 
	private String password;  //
	
	private Set<Role> roles;
	
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public void setUid(Integer uid){
		this.uid=uid;
	}
	
	public Integer getUid(){
		return this.uid;
	}
	
	public void setUsername(String username){
		this.username=username;
	}
	
	public String getUsername(){
		return this.username;
	}
	
	public void setPassword(String password){
		this.password=password;
	}
	
	public String getPassword(){
		return this.password;
	}
	
		
}