package com.myProject.common.model;

import java.util.Date;
import java.util.Set;

/**
 *@Description:   实体类 
 *				mp_role
 *@Author:wangyanfei
 */
public class Role {

	
	private Integer rid;  //
	
	private String rname;  //
	
	private Set<Module> modules;
	
	
	
	public Set<Module> getModules() {
		return modules;
	}

	public void setModules(Set<Module> modules) {
		this.modules = modules;
	}

	public void setRid(Integer rid){
		this.rid=rid;
	}
	
	public Integer getRid(){
		return this.rid;
	}
	
	public void setRname(String rname){
		this.rname=rname;
	}
	
	public String getRname(){
		return this.rname;
	}
	
		
}