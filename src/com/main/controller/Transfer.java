package com.main.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.main.service.UserListService;
import com.main.service.entity.EntityMangeService;

@Controller
public class Transfer {
	@Autowired
	private EntityMangeService entityMangeService;
	
	@Autowired
	private UserListService userListService;
	
	@RequestMapping("index.do")
	public String index() {
		return "index"; // 首页
	}

	/**
	 * 登陆页面
	 * 
	 * @return
	 */
	@RequestMapping("login.do")
	public String login() {
		return "entity/login_user";
	}


	/**
	 * 切换账号
	 */
	@RequestMapping("exect.do")
	public String exect(HttpServletRequest request) throws IOException {
		request.getSession().removeAttribute("userName");
		return "index";
	}



	/**
	 * 注册
	 * @param request
	 * @return
	 */
	@RequestMapping("register.do")
	public ModelAndView register(HttpServletRequest request) {
		double str = Math.random();
		System.out.println("register view code" + String.valueOf(str).substring(3, 8));

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("entity/register");
		modelAndView.addObject("yanzhengma", String.valueOf(str).substring(3, 9));
		return modelAndView;
	}
	
	/**
	 * 订单物流后台管理
	 * @param request
	 * @return
	 */
	@RequestMapping("adminbL.do")
	public String AdminBL(HttpServletRequest request) {
		return "logistical/adminbL";
	}
}
