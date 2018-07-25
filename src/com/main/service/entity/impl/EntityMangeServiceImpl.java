package com.main.service.entity.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Ordertable;
import com.main.entity.OrdertableExample;
import com.main.entity.User;
import com.main.mapper.OrdertableMapper;
import com.main.mapper.UserMapper;
import com.main.mapper.UserMapperCustom;
import com.main.service.ErrorCode;
import com.main.service.entity.EntityException;
import com.main.service.entity.EntityMangeService;

/**
 * �޸��û���Ϣʵ����
 * @author gyc
 *
 */
@Service("entityMangeService")
public class EntityMangeServiceImpl implements EntityMangeService{
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserMapperCustom userMapperCustom;
	
	@Autowired
	private OrdertableMapper orderTableMapper;
	
	private OrdertableExample _orderTableExample = new OrdertableExample();
	/**
	 * �޸�����
	 * @throws EntityException 
	 */
	public String updateEntityPassword(String _username,String _password, String _newpassword, String _newpassword2) {
		User user = new User();
		user.setUsername(_username);
		user.setPassword(_password);
		
		if(!_username.isEmpty() && !_password.isEmpty() && !_newpassword.isEmpty()) {
			
			try {
				String userPassword = userMapperCustom.findPasswordByEntityName(_username);
				if(_password.trim().length() < 0 || _password.trim().length() > 48) {
					return ErrorCode.Length_Inputerror;
				}
				
				if(_newpassword.trim().length() < 0 || _newpassword.trim().length() > 48) {
					return ErrorCode.Length_Inputerror;
				}
				
				if(userPassword.equals(_password)) {
					return ErrorCode.Password_Identical;
				}
				
				if(!_newpassword.equals(_newpassword2)) {
					return ErrorCode.InputInconsistency;
				}
				
				if(_password.equals(_newpassword2)) {
					return ErrorCode.Oldpwd_Newpwd;
				}
				
				//���Ƿ���ڵ�ǰ�û�
				int num = userMapperCustom.findUserByUserNameAndPassword(user);
				if(num > 1) {
					//�޸�����
					user.setPassword(_newpassword);
					userMapperCustom.updatePassword(user);
					return ErrorCode.AmendTheSuccess;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}
		return ErrorCode.UnInput;
	}

	/**
	 * �޸�����
	 */
	@Override
	public String updateEntityEmail(String _username, String _email, String _newemail){
		User user = new User();
		user.setUsername(_username);
		if(!_email.isEmpty()&& !_newemail.isEmpty()) {
			String userEmail = findEmailByEntityName(_username);
		
			if(!userEmail.equals(_email)) {
				return ErrorCode.User_Email_Identical;
			}
			
			if(userEmail.equals(_newemail)) {
				return ErrorCode.User_Email_Error;
			}
			
			if(_email.trim().length() < 0 || _email.trim().length() > 16) {
				return ErrorCode.Email_Length_Error;
			}
			
			if(_newemail.trim().length() < 0 || _newemail.trim().length() > 32) {
				return ErrorCode.Email_Length_Error;
			}
			
			if(!_newemail.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$")) {
				return ErrorCode.Email_Foramt_Error;
			}
			
			try {
				user.setUseremail(_newemail);
				userMapperCustom.updateEntityEmial(user);
				return ErrorCode.AmendTheSuccess;
			} catch (SQLException e) {
				throw new RuntimeException();
			}
			
			
		}else {
			return ErrorCode.UnInput;
		}
		
		
	}

	/**
	 * ����������������
	 */
	@Override
	public String findEmailByEntityName(String _username) {
		try {
			return userMapperCustom.findEmailByEntityName(_username);
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}

	/**
	 * �ֻ������޸�
	 * ֱ���޸ģ������߼��Ȳ�д��
	 */
	@Override
	public String updateEntityPhone(User _user) throws EntityException {
		if(_user != null) {
			try {
				userMapperCustom.updateEntityPhone(_user);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return ErrorCode.AmendTheSuccess;
		}
		return null;
	}

	
	/**
	 * ����userid �����û�������Ϣ
	 */
	@Override
	public User findUserByUserid(String _userid) throws EntityException {
		User user = userMapper.selectByPrimaryKey(_userid);
		return user;
	}

	/**
	 * @param _username �û���
	 * @param _paypassword ��֧������
	 * @param _newpaypassword ��֧������
	 * @param _newpaypassword_two ȷ��֧������
	 */
	@Override
	public String updateEntityPayPassword(String _username, String _paypassword, String _newpaypassword,
			String _newpaypassword_two) throws EntityException {
		User user = new User();
		
		if(!_username.isEmpty() || !_paypassword.isEmpty() || !_newpaypassword.isEmpty()) {
			try {
				String paypassword = userMapperCustom.findPayPasswordByEntityName(_username);
				if(paypassword.equals(_newpaypassword) || paypassword.equals(_newpaypassword_two)) {
					return ErrorCode.Oldpwd_Newpwd;
				}
				
				if(!paypassword.equals(_paypassword)) {
					return ErrorCode.Password_Identical;
				}
				
				if(!_newpaypassword.equals(_newpaypassword_two)) {
					return ErrorCode.InputInconsistency;
				}
				
				user.setUsername(_username);
				user.setUserpaypassword(_newpaypassword_two);
				userMapperCustom.updateEntityPayPassword(user);
			
				return ErrorCode.AmendTheSuccess;		
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}else {
			return ErrorCode.UnInput;
		}
		
	}

	/**
	 * �����ջ���ַ
	 */
	@Override
	public String updateEntityAddress(String _username, String _usermingzi, String _userphone, String _useraddress) throws EntityException {
		try {
			User user = userMapperCustom.userlist(_username);
			if(user != null) {
				if(!_usermingzi.isEmpty()) {
					user.setUsermingzi(_usermingzi);
				}
				
				if(!_userphone.isEmpty()) {
					user.setUserphone(_userphone);
				}
				
				if(!_useraddress.isEmpty()) {
					user.setUseraddress(_useraddress);
				}
				
				userMapperCustom.updateEntityAddress(user);
				return ErrorCode.AmendTheSuccess;
				
			}
			
			return ErrorCode.Unknow; //�û�δ��½�����
			
		} catch (SQLException e) {
			throw new EntityException("�޸��ջ���ַʧ��");
		}
	}

	/**
	 * �����û������Ҷ�����Ϣ
	 */
	public List<Ordertable> querryOrderList(String _username) throws EntityException {
		OrdertableExample.Criteria criteria = _orderTableExample.createCriteria();
		criteria.andOrderusernameEqualTo(_username);
		List<Ordertable> userList = orderTableMapper.selectByExample(_orderTableExample);
		return userList;
	}

	/**
	 * ��ѯ������Ϣ
	 */
	public Ordertable querryOrder(String _orderid) throws EntityException {
		OrdertableExample.Criteria criteria = _orderTableExample.createCriteria();
		criteria.andOrderidEqualTo(_orderid);
		Ordertable ordertable = orderTableMapper.selectByPrimaryKey(_orderid);
		return ordertable;
	}

	/**
	 * ɾ������
	 * 0״̬��ʾ������ɾ��״̬
	 */
	public boolean deleteOrder(String _orderid) throws EntityException {
		Ordertable ordertable = orderTableMapper.selectByPrimaryKey(_orderid);
		ordertable.setOrderstate("0");
		int num = orderTableMapper.updateByPrimaryKey(ordertable);
		return true;
	}

	/**
	 * ȡ������
	 */
	public void cancelOrder(String _orderid) throws EntityException {
		Ordertable ordertable = orderTableMapper.selectByPrimaryKey(_orderid);
		ordertable.setOrderstate("1");
		orderTableMapper.updateByPrimaryKey(ordertable);
	}

	/**
	 * ȷ�϶���
	 */
	public void confirmOrder(String _orderid) throws EntityException {
		Ordertable ordertable = orderTableMapper.selectByPrimaryKey(_orderid);
		ordertable.setOrderstate("0");
		orderTableMapper.updateByPrimaryKey(ordertable);
	}
}
	
