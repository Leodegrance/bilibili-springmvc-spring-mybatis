package com.main.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Video {
	
	@RequestMapping("videoFileTop.do") 
	public String videofiletop(HttpServletRequest request) {
		return "videoFileTop";
	}
}
