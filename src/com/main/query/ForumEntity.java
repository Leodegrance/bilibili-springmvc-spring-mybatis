package com.main.query;

/**
 * 论坛信息总计类
 * @author gyc
 *
 */
public class ForumEntity {
	private ForumEntity() {}
	private static ForumEntity forumEntity;
	
	public static synchronized ForumEntity getInstance() {
		if(forumEntity == null) {
			return new ForumEntity();
		}
		return forumEntity;
	}
	
	private int _count = 0;//总共多少个用户
	private int _meassageCount = 0;//总共有多少条帖子论坛
	private int _dailyCount = 0;//今天一共有多少帖子
	private  int _previousCount = 0;//昨日一共有多少帖子
	private  int _weekCount = 0;//7天内
	
	public int get_count() {
		return _count;
	}
	public void set_count(int _count) {
		this._count = _count;
	}
	public int get_meassageCount() {
		return _meassageCount;
	}
	public void set_meassageCount(int _meassageCount) {
		this._meassageCount = _meassageCount;
	}
	public int get_dailyCount() {
		return _dailyCount;
	}
	public void set_dailyCount(int _dailyCount) {
		this._dailyCount = _dailyCount;
	}
	public int get_previousCount() {
		return _previousCount;
	}
	public void set_previousCount(int _previousCount) {
		this._previousCount = _previousCount;
	}
	public int get_weekCount() {
		return _weekCount;
	}
	public void set_weekCount(int _weekCount) {
		this._weekCount = _weekCount;
	}
		
}
