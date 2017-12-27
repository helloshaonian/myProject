package com.myProject.firstT.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.myProject.configuration.shiro.ShiroUtiles;
import com.myProject.firstT.model.Schoole;
import com.myProject.firstT.service.SchooleService;


/**
 *@description  --控制器
 *@Author：wangyanfei
 *@Date:2017-12-04 15:31:55
 */
@Controller
@RequestMapping(value = "/v2/schoole")
public class SchooleController {

	@Autowired
	private SchooleService schooleService;
	
	@Value("${sitemesh.contentPath}")
	private String contentPath;

	/** 装饰器页面路径 */
	@Value("${sitemesh.decoratorPath}")
	private String decoratorPath;
	
	
	
	@RequestMapping("/add")
	//@RequiresPermissions("delete")
	public String test(Map<String, Object> map){
		PageHelper.startPage(1, 3);
		List<Schoole> list=schooleService.selectModelByExample(new Schoole());
		/*Schoole sc=new Schoole();
		sc.setAge(10);
		sc.setName("腌吖啊啊啊b4");
		sc.setScore(98);
		int i=schooleService.insert(sc);
		List<Schoole> slist=new ArrayList<Schoole>();
		slist.add(sc);
		Schoole sca=new Schoole();
		sca.setAge(10);
		sca.setName("古古怪怪b5");
		sca.setScore(98);
		slist.add(sca);
		schooleService.insertModels(slist);*/
		map.put("map", list);
		for (Schoole schoole : list) {
			System.out.println(schoole.getName());
		}
		return "view/home";
	}
	
	@RequestMapping("/clearCache")
	@ResponseBody
	public HashMap<String,String> clearCache(){
		System.out.println("清楚缓存");
		ShiroUtiles.clearCache();
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("statu", "1");
		return map;
	}
	
}
