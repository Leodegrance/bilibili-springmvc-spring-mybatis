package com.main.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.main.entity.User;

public interface UserMapperCustom {
	public Integer findUserByUserNameAndPassword(User user)throws SQLException;
	
	public User userlist(String userName)throws SQLException;
	
	public void updatePassword(User _user)throws SQLException;
	
	public void updateEntityEmial(User _user)throws SQLException;
	
	public String findEmailByEntityName(String _username)throws SQLException;
	
	public String findPasswordByEntityName(String _username)throws SQLException;

	public void updateEntityPhone(User _user)throws SQLException;
	
	public void updateEntityPayPassword(User _user)throws SQLException;
	
	public String findPayPasswordByEntityName(String _username)throws SQLException;

	public void updateEntityAddress(User _user)throws SQLException;
}
