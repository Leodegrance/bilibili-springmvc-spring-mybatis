package com.main.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.main.entity.Message;
import com.main.service.video.VideoService;

@Controller
public class VideoTransfer {
	@Autowired
	VideoService videoService;
	
	@RequestMapping("videoFileTop.do") 
	public String videofiletop(HttpServletRequest request) {
		return "videoFileTop";
	}
	
	/**
	 * �����ݿ��������е���Ƶ��ѯ���� ���͵���ҳ��
	 * @param request
	 * @return
	 */
	@RequestMapping("loadvideo.do")
	public String loadvideo(HttpServletRequest request) {
		int videoCnt = videoService.loadVideoCount();
		request.setAttribute("tag1", videoCnt);
		
		int tag4 = 12;
		// ÿҳ��ʾ����
		request.setAttribute("tag4", tag4);
		
		return "DisplayVideo";

	}
	
	/**
	 * ��Ƶ����
	 * @param url
	 * @param request
	 * @param videoid
	 * @return
	 */
	@RequestMapping("video.do")
	public ModelAndView video(String url, HttpServletRequest request, String videoid) {
		request.setAttribute("url", url);
		List<Message> messagelist = videoService.loadMessageListByVideoId(videoid);
		Map<String, List<Message>> model = new HashMap<>();
		model.put("messagelist", messagelist);
		return new ModelAndView("Video", model);
	}
}
