package com.myProject.common.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myProject.common.model.UserRole;
import com.myProject.common.service.UserRoleService;


/**
 *@description  --控制器
 *@Author：wangyanfei
 *@Date:2017-12-11 15:11:36
 */
@Controller
@RequestMapping(value = "/v1/userRole")
public class UserRoleController {

	@Autowired
	private UserRoleService userRoleService;
	

	
	
	
}
