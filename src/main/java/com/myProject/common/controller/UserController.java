package com.myProject.common.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myProject.common.model.User;
import com.myProject.common.service.UserService;


/**
 *@description  --控制器
 *@Author：wangyanfei
 *@Date:2017-12-11 15:11:24
 */
@Controller
@RequestMapping(value = "/v1/user")
public class UserController {

	@Autowired
	private UserService userService;
	

	
	
	
}
