package com.main.service.entity.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.User;
import com.main.mapper.UserMapper;
import com.main.mapper.UserMapperCustom;
import com.main.service.UserListService;

@Service
public class UserListServiceImpl implements UserListService{
	@Autowired
	private UserMapperCustom userMapperCustom;
	
	@Override
	public User userlist(String _username) throws Exception {
		return userMapperCustom.userlist(_username);
	}

	
	
	@Override
	public List<User> userlistUserName(String _username) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<User> findAllUser() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
