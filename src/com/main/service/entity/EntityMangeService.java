package com.main.service.entity;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.main.entity.Ordertable;
import com.main.entity.User;

/**
 * 用户信息相关
 * @author gyc
 *
 */
@Repository
public interface EntityMangeService {
	public String updateEntityPassword(String _username,String _password, String _newpassword, String _newpassword_two)throws EntityException;
	
	public String updateEntityEmail(String _username, String _email, String _newemail)throws EntityException;
	
	public String findEmailByEntityName(String _username)throws EntityException;

	public String updateEntityPhone(User _user)throws EntityException;
	
	public User findUserByUserid(String _userid)throws EntityException;
	
	public String updateEntityPayPassword(String _username, String _paypassword, String _newpaypassword, String _newpaypassword_two)throws EntityException;

	public String updateEntityAddress(String _username, String _usermingzi, String _userphone, String _useraddress)throws EntityException;

	public List<Ordertable> querryOrderList(String _username)throws EntityException;
	
	public Ordertable querryOrder(String _orderid)throws EntityException;
	
	public boolean deleteOrder(String _orderid)throws EntityException;
	
	public void cancelOrder(String _orderid)throws EntityException;
	
	public void confirmOrder(String _orderid)throws EntityException;
}
