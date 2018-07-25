package com.main.query;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TimerTask;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.main.entity.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import commons.walkman.jdbc.TxQueryRunner;

/**
 * 定时查询论坛信息
 * @author gyc
 *
 */
public class CallingMethod extends TimerTask{
	public static int _count = 0;//总共多少个用户
	public static int _meassageCount = 0;//总共有多少条帖子论坛
	public static int _dailyCount = 0;//今天一共有多少帖子
	public static int _previousCount = 0;//昨日一共有多少帖子
	public static int _weekCount = 0;//7天内
	
	private static ApplicationContext ctx= null;
	private JdbcTemplate jdbcTemplate = null;

	static {
		ctx = new ClassPathXmlApplicationContext("/spring/applicationContext-dao.xml");
	}
	
	public void run() {	
		//设置用户数量
		String querryUser = "select count(*) from user"; 
		jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		_count = jdbcTemplate.queryForObject(querryUser, Integer.class);
	
		//设置帖子数量
		String querryForum = "select count(*) from forum"; 
		_meassageCount = jdbcTemplate.queryForObject(querryForum, Integer.class);

		
		//今日发布了多少帖子
		String querryCard = "select count(*) from forum where TO_DAYS(NOW()) - TO_DAYS(forumTime) <=1"; 
		_dailyCount = jdbcTemplate.queryForObject(querryCard, Integer.class);
		
		//昨日发布了多少帖子
		String querryPrevious = "select count(*) from forum where TO_DAYS(forumTime)=TO_DAYS(NOW())";
		_previousCount =  jdbcTemplate.queryForObject(querryPrevious, Integer.class);
		
		//7天内发布了多少帖子
		String querryweekCard = "select count(*) from forum where DATE_SUB(CURDATE(),INTERVAL 7 DAY) <=(forumTime)"; 
		_weekCount =  jdbcTemplate.queryForObject(querryweekCard, Integer.class);
	}
}
