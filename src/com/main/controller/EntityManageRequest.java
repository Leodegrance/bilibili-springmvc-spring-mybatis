package com.main.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.main.entity.Ordertable;
import com.main.entity.User;
import com.main.service.UserListService;
import com.main.service.entity.EntityException;
import com.main.service.entity.EntityMangeService;

/**
 * �޸��û���Ϣ
 * @author gyc
 *
 */
@Controller
public class EntityManageRequest {
	@Autowired
	private EntityMangeService entityMangeService;

	@Autowired
	private UserListService userListService;

	/**
	 * �޸�����
	 * 
	 * @return
	 * @throws EntityException
	 * @throws SQLException
	 */
	@RequestMapping("update_email.do")
	public String updateemail(HttpServletRequest request, String email, String newemail)
			throws SQLException, EntityException {
		String userName = (String) request.getSession().getAttribute("userName");
		if (userName != null && email != null && newemail != null) {
			String result = entityMangeService.updateEntityEmail(userName, email, newemail);
			if (!result.isEmpty()) {
				request.setAttribute("result", result);
			}
		}
		return "entity/update_email";
	}

	/**
	 * ������Ϣ����
	 * 
	 * @param _user
	 * @param request
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("information.do")
	public String information(User _user, HttpServletRequest request) throws Exception {
		String userName = (String) request.getSession().getAttribute("userName");
		try {
			User user = userListService.userlist(userName);
			if(user != null) {
				request.setAttribute("user", user);
			}
		} catch (EntityException e) {
			e.printStackTrace();
		}

		return "entity/information";

	}

	// �û����п�����
	@RequestMapping("bank_card.do")
	public String Bank_Card() {

		return "bank_card";

	}

	// �ջ���ַ
	@RequestMapping("delivery_address.do")
	public String Delivery_address(String usermingzi, String userPhone, String userAddress, HttpServletRequest request) {
		String userName = (String)request.getSession().getAttribute("userName");
		if(usermingzi != null && userPhone != null && userAddress != null)
		try {
			String result = entityMangeService.updateEntityAddress(userName, usermingzi, userPhone, userAddress);
			request.setAttribute("errors", result);
		} catch (EntityException e) {
			e.printStackTrace();
		}
		return "delivery_address";
	}

	/**
	 * �޸�����
	 * 
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws EntityException 
	 * @throws SQLException
	 */
	@RequestMapping("update_login_password.do")
	public ModelAndView update_login_password(String passWord, String newpassWord, String newpassWord2,
			HttpServletRequest request) throws IOException, EntityException {
		ModelAndView modelAndView = new ModelAndView("update_login_password");
		String userName = (String) request.getSession().getAttribute("userName");

		if (passWord != null && newpassWord != null && newpassWord2 != null) {
			String result = entityMangeService.updateEntityPassword(userName, passWord, newpassWord, newpassWord2);
			if (!result.isEmpty()) {
				modelAndView.addObject("errors", result);
			}
		}

		modelAndView.setViewName("entity/update_login_password");
		return modelAndView;
	}

	/**
	 * ��Ϣ�޸Ľ���
	 * 
	 * @param request
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("user_full_information.do")
	public String user_full_information(HttpServletRequest request) throws IOException {
		User user_session = (User) request.getSession().getAttribute("user_session");
		request.setAttribute("user", user_session);
		return "entity/user_full_information";
	}

	/**
	 * �޸��ֻ�����
	 * 
	 * @return
	 * @throws EntityException 
	 */
	@RequestMapping("update_phone.do")
	public String updatephone(String userPhone, String newuserPhone, HttpServletRequest request) throws EntityException {
		String userName = (String) request.getSession().getAttribute("userName");
		if (userPhone != null && newuserPhone != null) {
			User user = new User();
			user.setUserphone(newuserPhone);
			String result = entityMangeService.updateEntityPhone(user);
			request.setAttribute("errors", result);
			
		}
		return "update_phone";
	}

	/**
	 * ֧�������޸�
	 * 
	 * @return
	 */
	@RequestMapping("update_paypassword.do")
	public String updatepaypassword(String paypassword, String newpaypassword, String newpaypassword2,
			HttpServletRequest request) {
		String userName = (String) request.getSession().getAttribute("userName");
		if (paypassword != null && newpaypassword != null && newpaypassword2 != null) {
			try {
				String result = entityMangeService.updateEntityPayPassword(userName, paypassword, newpaypassword,
						newpaypassword2);
				request.setAttribute("errors", result);
			} catch (EntityException e) {
				e.printStackTrace();
			}
		}
		return "entity/update_paypassword";

	}
	
	/**
	 * �鿴������Ϣ
	 * @param request
	 * @return
	 */
	@RequestMapping("order.do")
	public String order(HttpServletRequest request) {
		String userName = (String) request.getSession().getAttribute("userName");
		
		try {
			List<Ordertable> orderTableList = entityMangeService.querryOrderList(userName);
			request.setAttribute("orderTable", orderTableList);
		} catch (EntityException e) {
		}
		
		return "entity/order";
	}
	
	/**
	 * ɾ������ 
	 * @param request
	 * @return
	 */
	@RequestMapping("deletorder.do")
	public String deletorder(String orderid, HttpServletRequest request) {
		if(orderid != null) {
			try {
				Ordertable ordertables = entityMangeService.querryOrder(orderid);
				entityMangeService.deleteOrder(orderid);
				request.setAttribute("ordertables", ordertables);
			} catch (EntityException e) {
				e.printStackTrace();
			}
		}
		return "entity/deletorder";
	}
	
	/**

	/**
	 * ȡ����Ʒ����
	 * @param request
	 * @return
	 */
	@RequestMapping("cancellationoforder.do")
	public String cancellationoforder(HttpServletRequest request) {
		String orderid = request.getParameter("orderid");
		try {
			entityMangeService.cancelOrder(orderid);
		} catch (EntityException e) {
			e.printStackTrace();
		}
		return "entity/order";
	}
}
