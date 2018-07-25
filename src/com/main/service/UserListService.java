package com.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.entity.User;

@Service
public interface UserListService {
	
	/**
	 *  �����û������� ��ѯ���û���������Ϣ
	 * @return
	 * @throws Exception 
	 */
	public User userlist(String _username) throws Exception;
	
	/**
	 * ��ѯ�����û�
	 * @param userName
	 * @return
	 */
	public List<User> userlistUserName(String _username);

	public List<User> findAllUser() throws Exception;
}
