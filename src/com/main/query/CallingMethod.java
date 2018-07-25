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
 * ��ʱ��ѯ��̳��Ϣ
 * @author gyc
 *
 */
public class CallingMethod extends TimerTask{
	public static int _count = 0;//�ܹ����ٸ��û�
	public static int _meassageCount = 0;//�ܹ��ж�����������̳
	public static int _dailyCount = 0;//����һ���ж�������
	public static int _previousCount = 0;//����һ���ж�������
	public static int _weekCount = 0;//7����
	
	private static ApplicationContext ctx= null;
	private JdbcTemplate jdbcTemplate = null;

	static {
		ctx = new ClassPathXmlApplicationContext("/spring/applicationContext-dao.xml");
	}
	
	public void run() {	
		//�����û�����
		String querryUser = "select count(*) from user"; 
		jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		_count = jdbcTemplate.queryForObject(querryUser, Integer.class);
	
		//������������
		String querryForum = "select count(*) from forum"; 
		_meassageCount = jdbcTemplate.queryForObject(querryForum, Integer.class);

		
		//���շ����˶�������
		String querryCard = "select count(*) from forum where TO_DAYS(NOW()) - TO_DAYS(forumTime) <=1"; 
		_dailyCount = jdbcTemplate.queryForObject(querryCard, Integer.class);
		
		//���շ����˶�������
		String querryPrevious = "select count(*) from forum where TO_DAYS(forumTime)=TO_DAYS(NOW())";
		_previousCount =  jdbcTemplate.queryForObject(querryPrevious, Integer.class);
		
		//7���ڷ����˶�������
		String querryweekCard = "select count(*) from forum where DATE_SUB(CURDATE(),INTERVAL 7 DAY) <=(forumTime)"; 
		_weekCount =  jdbcTemplate.queryForObject(querryweekCard, Integer.class);
	}
}
