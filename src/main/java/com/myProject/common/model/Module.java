package com.myProject.common.model;

import java.util.Date;

/**
 *@Description:   实体类 
 *				mp_module
 *@Author:wangyanfei
 */
public class Module {

	
	private Integer mid;  //
	
	private String mname;  //
	
	public void setMid(Integer mid){
		this.mid=mid;
	}
	
	public Integer getMid(){
		return this.mid;
	}
	
	public void setMname(String mname){
		this.mname=mname;
	}
	
	public String getMname(){
		return this.mname;
	}
	
		
}