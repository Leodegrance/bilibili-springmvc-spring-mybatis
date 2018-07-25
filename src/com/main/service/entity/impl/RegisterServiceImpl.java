package com.main.service.entity.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.User;
import com.main.mapper.UserMapper;
import com.main.mapper.UserMapperCustom;
import com.main.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	private UserMapperCustom userMapperCustom;

	@Autowired
	private UserMapper userMapper;

	/**
	 * 用户注册相关
	 * 
	 * @throws Exception
	 */
	@Override
	public boolean RegisterService(User _form) throws Exception {
		User user = userMapperCustom.userlist(_form.getUsername());
		if (user != null) {			
			return false;
		}

		userMapper.insert(_form);
		return true;
	}

}
