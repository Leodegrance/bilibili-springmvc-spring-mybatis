package com.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.entity.User;

@Service
public interface UserListService {
	
	/**
	 *  根据用户的名字 查询出用户的所有信息
	 * @return
	 * @throws Exception 
	 */
	public User userlist(String _username) throws Exception;
	
	/**
	 * 查询所有用户
	 * @param userName
	 * @return
	 */
	public List<User> userlistUserName(String _username);

	public List<User> findAllUser() throws Exception;
}
