package com.main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.main.entity.User;
import com.main.service.entity.impl.LoginServiceImpl;
import com.main.service.entity.impl.UserListServiceImpl;

/**
 * 账号登陆
 * @author gyc
 *
 */
@Controller
public class LoginRequest {
	
	@Autowired
	private UserListServiceImpl userListServiceImpl;
	@Autowired
	private LoginServiceImpl loginServiceImpl;
	
	@RequestMapping("loginservice.do")
	public String loginservice(String userName, String passWord, HttpServletRequest request, HttpServletResponse response) throws Exception{
		User from = new User();
		if(userName != null && !userName.equals("") &&
				passWord != null && !passWord.equals("")) {
			from.setUsername(userName);
			from.setPassword(passWord);
		}
		
		//如果存在增将用户放到session里
		boolean isExist = loginServiceImpl.loginuser(from);
		if(isExist) {
			User user = (User) userListServiceImpl.userlist(userName);
			if(user !=null ) {
				request.getSession().setAttribute("user_session", user);
				request.getSession().setAttribute("userID", user.getUserid());
				request.getSession().setAttribute("userName", user.getUsername());
				request.getSession().setAttribute("userHand", user.getUserhand());
			}
		}
		String mamaipi = "index.do";
		if(request.getSession().getAttribute("jiequ")!=null){
			String ceshidizhi=(String) request.getSession().getAttribute("jiequ");
			String jiequ = "";
	 		request.getSession().setAttribute("jiequ", jiequ);
	 		mamaipi = ceshidizhi;
	 		return "redirect:/"+mamaipi;
		}else {
			//失败
			 request.setAttribute("PHO", "用户名或密码错误!");
		}
		return "index";
	}
}
