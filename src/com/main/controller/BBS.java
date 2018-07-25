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
	
	//利用内部类加载定时任务
	private BBS.QuerryTimeTask _querryTimeTask = new BBS.QuerryTimeTask();
		
	@RequestMapping("forum.do") 
	public String forum(HttpServletRequest request) {
		//论坛信息包装类
		String newUser = (String) request.getServletContext().getAttribute("getUserName");
		request.setAttribute("newusername", newUser);//最新注册的用户
		request.setAttribute("usercount", CallingMethod._count);//用户总数
		request.setAttribute("meassageCount", CallingMethod._meassageCount);//帖子总数
		request.setAttribute("dailyCount", CallingMethod._dailyCount);//今日总帖子数量
		request.setAttribute("previousCount", CallingMethod._previousCount);//昨日总帖子数量
		request.setAttribute("weekcount", CallingMethod._weekCount);//7天总帖子数量
		return "bbs/forumindex";
	}
	
	@RequestMapping("forum") 
	public ModelAndView Forum(HttpServletRequest request) {
		
		//查询论坛分区
		List<Forum> forumList = forumService.findForumListById("1");
		Map<String, List<Forum>> model = new HashMap<>();
		model.put("list", forumList);
		return new ModelAndView("/bbs/forum", model);
	}
	
	/**
	 * 论坛用户登陆
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
		
		//如果存在增将用户放到session里
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
	 * 获取帖子信息
	 * @param request
	 * @param forumid
	 * @return
	 */
	@RequestMapping("forumReply.do") 
	public ModelAndView forumReply(HttpServletRequest request,String forumID) {
		Forum forum = forumService.findForumById(forumID);
		//帖子下的所有回复
		List<Forumreply> forumre = forumService.findForumreplyByID(forumID);
		Map model = new HashMap();
		model.put("user", forum);
		model.put("forumre", forumre);
		return new ModelAndView("/bbs/rorumreply", model);
	}
	
	//一分钟更新一次论坛数据
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
