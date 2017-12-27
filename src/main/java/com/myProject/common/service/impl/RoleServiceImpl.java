package com.myProject.common.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myProject.common.service.ModuleService;
import com.myProject.common.service.RoleService;
import com.myProject.common.service.UserService;
import com.myProject.common.model.Module;
import com.myProject.common.model.Role;
import com.myProject.common.model.User;
import com.myProject.common.dao.RoleMapper;
import com.myProject.firstT.service.SchooleService;


/**
 *@Description： Servcie实现类
 *@Author：wangyanfei
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleMapper RoleMapper;//
	
	@Autowired
	SchooleService schooleService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	ModuleService moduleService;
	@Override
	public List<HashMap<String, Object>> selectByExample(Role vo) {
		return RoleMapper.selectByExample(vo);
	}

	@Override
	public List<Role> selectModelByExample(Role vo) {
		return RoleMapper.selectModelByExample(vo);
	}
	
	
	@Override
	public Role selectByPrimaryKey(Long id) {
		return RoleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(Role vo)  {
		return RoleMapper.update(vo);
	}

	@Override
	public int insert(Role vo) {
		return RoleMapper.insert(vo);
	}
	
	@Override
	public void insertModels(List<Role> list){
			RoleMapper.insertModels(list);
	}
	
	
	@Override
	public int deleteByPrimaryKey(Long id){
		return  RoleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void test() {
		
		/*Module m=new Module();
		m.setMname("diyi");
		moduleService.insert(m);*/
		Role r=new Role();
		r.setRname("aaaaaa");
		RoleMapper.insert(r);
		
				schooleService.test();
		
		
	}
	
}
