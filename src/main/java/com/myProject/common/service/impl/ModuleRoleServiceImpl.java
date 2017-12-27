package com.myProject.common.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myProject.common.service.ModuleRoleService;
import com.myProject.common.model.ModuleRole;
import com.myProject.common.dao.ModuleRoleMapper;


/**
 *@Description： Servcie实现类
 *@Author：wangyanfei
 */
@Service
@Transactional
public class ModuleRoleServiceImpl implements ModuleRoleService{

	@Autowired
	private ModuleRoleMapper ModuleRoleMapper;//
	
	
	@Override
	public List<HashMap<String, Object>> selectByExample(ModuleRole vo) {
		return ModuleRoleMapper.selectByExample(vo);
	}

	@Override
	public List<ModuleRole> selectModelByExample(ModuleRole vo) {
		return ModuleRoleMapper.selectModelByExample(vo);
	}
	
	
	@Override
	public ModuleRole selectByPrimaryKey(Long id) {
		return ModuleRoleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(ModuleRole vo)  {
		return ModuleRoleMapper.update(vo);
	}

	@Override
	public int insert(ModuleRole vo) {
		return ModuleRoleMapper.insert(vo);
	}
	
	@Override
	public void insertModels(List<ModuleRole> list){
			ModuleRoleMapper.insertModels(list);
	}
	
	
	@Override
	public int deleteByPrimaryKey(Long id){
		return  ModuleRoleMapper.deleteByPrimaryKey(id);
	}
	
}
