package com.main.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.main.entity.User;
import com.main.service.RegisterService;

@Controller
public class RegisterRequest {
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping("register_form.do")
	public ModelAndView register(User user)throws Exception{
		User form = user;
		form.setUserid(UUID.randomUUID().toString().replace("-", ""));// 设置一个默认的用户ID UUID
		form.setUserstate("正常");// 设置用户注册时 默认状态
		form.setUserpaypassword("123456"); // 设置注册用户的默认支付密码; (一开始忘记了)
		form.setUserhand("/static/userHand_Top/upload/MyHand.png");// 设置注册用户的默认头像
		
		boolean regist = registerService.RegisterService(form);
		ModelAndView modelAndView = new ModelAndView();
		if(regist == false) {
			modelAndView.addObject("errors", "用户已注册");
			modelAndView.setViewName("entity/register");
		}else {
			modelAndView.setViewName("entity/login_user");
		}
		//暂时不写校验了，直接注册成功
		
		
		return modelAndView;
		

	}
}
