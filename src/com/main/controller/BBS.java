package com.main.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.main.entity.Forum;
import com.main.entity.Forumreply;
import com.main.entity.User;
import com.main.query.CallingMethod;
import com.main.query.ForumEntity;
import com.main.service.entity.impl.LoginServiceImpl;
import com.main.service.entity.impl.UserListServiceImpl;
import com.main.service.forum.ForumService;

@Controller
public class BBS {
	@Autowired
	ForumService forumService;
	
	@Autowired
	private UserListServiceImpl userListServiceImpl;
	
	@Autowired
	private LoginServiceImpl loginServiceImpl;
	
	//�����ڲ�����ض�ʱ����
	private BBS.QuerryTimeTask _querryTimeTask = new BBS.QuerryTimeTask();
		
	@RequestMapping("forum.do") 
	public String forum(HttpServletRequest request) {
		//��̳��Ϣ��װ��
		String newUser = (String) request.getServletContext().getAttribute("getUserName");
		request.setAttribute("newusername", newUser);//����ע����û�
		request.setAttribute("usercount", CallingMethod._count);//�û�����
		request.setAttribute("meassageCount", CallingMethod._meassageCount);//��������
		request.setAttribute("dailyCount", CallingMethod._dailyCount);//��������������
		request.setAttribute("previousCount", CallingMethod._previousCount);//��������������
		request.setAttribute("weekcount", CallingMethod._weekCount);//7������������
		return "bbs/forumindex";
	}
	
	@RequestMapping("forum") 
	public ModelAndView Forum(HttpServletRequest request) {
		
		//��ѯ��̳����
		List<Forum> forumList = forumService.findForumListById("1");
		Map<String, List<Forum>> model = new HashMap<>();
		model.put("list", forumList);
		return new ModelAndView("/bbs/forum", model);
	}
	
	/**
	 * ��̳�û���½
	 * @param username
	 * @param password
	 * @param request
	 * @return
	 */
	@RequestMapping("loginforum.do")
	public String loginforum(String username,String password,HttpServletRequest request){
		User from = new User();
		if(username != null && !username.equals("") &&
				password != null && !password.equals("")) {
			from.setUsername(username);
			from.setPassword(username);
		}
		
		//������������û��ŵ�session��
		boolean isExist;
		try {
			isExist = loginServiceImpl.loginuser(from);
			if(isExist) {
				User user = (User) userListServiceImpl.userlist(username);
				if(user !=null ) {
					request.getSession().setAttribute("user_session", user);
					request.getSession().setAttribute("userID", user.getUserid());
					request.getSession().setAttribute("userName", user.getUsername());
					request.getSession().setAttribute("userHand", user.getUserhand());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

				
		return "/bbs/forumindex";
	}
	
	/**
	 * ��ȡ������Ϣ
	 * @param request
	 * @param forumid
	 * @return
	 */
	@RequestMapping("forumReply.do") 
	public ModelAndView forumReply(HttpServletRequest request,String forumID) {
		Forum forum = forumService.findForumById(forumID);
		//�����µ����лظ�
		List<Forumreply> forumre = forumService.findForumreplyByID(forumID);
		Map model = new HashMap();
		model.put("user", forum);
		model.put("forumre", forumre);
		return new ModelAndView("/bbs/rorumreply", model);
	}
	
	//һ���Ӹ���һ����̳����
	public class QuerryTimeTask{
		private final long _period = 1000 * 60;
		private final Timer timer = new Timer();
		private final Calendar  calendar= Calendar.getInstance();
		private TimerTask task = new CallingMethod(); 
		public QuerryTimeTask(){
			 Date firstTime = calendar.getTime();  
		     timer.schedule(task, firstTime, _period);
		     task.run();
		}
	}
}
