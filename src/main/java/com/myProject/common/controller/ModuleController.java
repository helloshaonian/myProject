package com.myProject.common.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myProject.common.model.Module;
import com.myProject.common.service.ModuleService;


/**
 *@description  --控制器
 *@Author：wangyanfei
 *@Date:2017-12-11 15:10:44
 */
@Controller
@RequestMapping(value = "/v1/module")
public class ModuleController {

	@Autowired
	private ModuleService moduleService;
	

	
	
	
}
