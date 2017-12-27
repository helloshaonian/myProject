package com.myProject.common.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myProject.common.service.ModuleService;
import com.myProject.common.model.Module;
import com.myProject.common.dao.ModuleMapper;


/**
 *@Description： Servcie实现类
 *@Author：wangyanfei
 */
@Service
@Transactional
public class ModuleServiceImpl implements ModuleService{

	@Autowired
	private ModuleMapper ModuleMapper;//
	
	
	@Override
	public List<HashMap<String, Object>> selectByExample(Module vo) {
		return ModuleMapper.selectByExample(vo);
	}

	@Override
	public List<Module> selectModelByExample(Module vo) {
		return ModuleMapper.selectModelByExample(vo);
	}
	
	
	@Override
	public Module selectByPrimaryKey(Long id) {
		return ModuleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(Module vo)  {
		return ModuleMapper.update(vo);
	}

	@Override
	public int insert(Module vo) {
		
		 ModuleMapper.insert(vo);
		 throw new RuntimeException();
	}
	
	@Override
	public void insertModels(List<Module> list){
			ModuleMapper.insertModels(list);
	}
	
	
	@Override
	public int deleteByPrimaryKey(Long id){
		return  ModuleMapper.deleteByPrimaryKey(id);
	}
	
}
