package com.main.service.entity.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.User;
import com.main.mapper.UserMapper;
import com.main.mapper.UserMapperCustom;
import com.main.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserMapperCustom userMapperCustom;
	
	@Override
	public boolean loginuser(User _user) throws Exception {
		Integer count = userMapperCustom.findUserByUserNameAndPassword(_user);
		if(count < 1) {
			return false;
		}
		return true;
	}
	
}
