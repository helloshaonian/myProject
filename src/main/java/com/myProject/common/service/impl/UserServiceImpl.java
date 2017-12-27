package com.myProject.common.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myProject.common.service.ModuleService;
import com.myProject.common.service.UserService;
import com.myProject.common.model.Module;
import com.myProject.common.model.User;
import com.myProject.common.dao.UserMapper;


/**
 *@Description： Servcie实现类
 *@Author：wangyanfei
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper UserMapper;//
	@Autowired
	ModuleService moduleService;
	@Override
	public List<HashMap<String, Object>> selectByExample(User vo) {
		return UserMapper.selectByExample(vo);
	}

	@Override
	public List<User> selectModelByExample(User vo) {
		return UserMapper.selectModelByExample(vo);
	}
	
	
	@Override
	public User selectByPrimaryKey(Long id) {
		return UserMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(User vo)  {
		return UserMapper.update(vo);
	}

	@Override
	public int insert(User vo) {
		//UserMapper.insert(vo);
		Module m=new Module();
		m.setMname("ai");
		try {
			moduleService.insert(m);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 1;
	}
	
	@Override
	public void insertModels(List<User> list){
			UserMapper.insertModels(list);
	}
	
	
	@Override
	public int deleteByPrimaryKey(Long id){
		return  UserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public User findByUserName(String username) {
		return UserMapper.findByUserName(username);
	}
	
}
