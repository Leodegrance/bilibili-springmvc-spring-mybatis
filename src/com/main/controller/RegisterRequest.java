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
		form.setUserid(UUID.randomUUID().toString().replace("-", ""));// ����һ��Ĭ�ϵ��û�ID UUID
		form.setUserstate("����");// �����û�ע��ʱ Ĭ��״̬
		form.setUserpaypassword("123456"); // ����ע���û���Ĭ��֧������; (һ��ʼ������)
		form.setUserhand("/static/userHand_Top/upload/MyHand.png");// ����ע���û���Ĭ��ͷ��
		
		boolean regist = registerService.RegisterService(form);
		ModelAndView modelAndView = new ModelAndView();
		if(regist == false) {
			modelAndView.addObject("errors", "�û���ע��");
			modelAndView.setViewName("entity/register");
		}else {
			modelAndView.setViewName("entity/login_user");
		}
		//��ʱ��дУ���ˣ�ֱ��ע��ɹ�
		
		
		return modelAndView;
		

	}
}
