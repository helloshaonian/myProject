package com.myProject.common.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myProject.common.service.UserRoleService;
import com.myProject.common.model.UserRole;
import com.myProject.common.dao.UserRoleMapper;


/**
 *@Description： Servcie实现类
 *@Author：wangyanfei
 */
@Service
@Transactional
public class UserRoleServiceImpl implements UserRoleService{

	@Autowired
	private UserRoleMapper UserRoleMapper;//
	
	
	@Override
	public List<HashMap<String, Object>> selectByExample(UserRole vo) {
		return UserRoleMapper.selectByExample(vo);
	}

	@Override
	public List<UserRole> selectModelByExample(UserRole vo) {
		return UserRoleMapper.selectModelByExample(vo);
	}
	
	
	@Override
	public UserRole selectByPrimaryKey(Long id) {
		return UserRoleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(UserRole vo)  {
		return UserRoleMapper.update(vo);
	}

	@Override
	public int insert(UserRole vo) {
		return UserRoleMapper.insert(vo);
	}
	
	@Override
	public void insertModels(List<UserRole> list){
			UserRoleMapper.insertModels(list);
	}
	
	
	@Override
	public int deleteByPrimaryKey(Long id){
		return  UserRoleMapper.deleteByPrimaryKey(id);
	}
	
}
