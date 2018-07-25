package com.main.service.entity;

import org.springframework.beans.factory.annotation.Autowired;

import com.main.entity.User;
import com.main.mapper.UserMapperCustom;

public interface RegisterService {	
	public boolean RegisterService(User _form)throws RuntimeException, Exception;
}
