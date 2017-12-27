package com.myProject.firstT.model;

import java.util.Date;

/**
 *@Description:   实体类 
 *				schoole
 *@Author:wangyanfei
 */
public class Schoole {

	
	private Long id;  //
	
	private String name;  //
	
	private Integer age;
	
	private Integer score;
	
	
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public void setId(Long id){
		this.id=id;
	}
	
	public Long getId(){
		return this.id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
	
	
	
		
}