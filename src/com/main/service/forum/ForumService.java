package com.main.service.forum;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.entity.Forum;
import com.main.entity.Forumreply;
import com.main.entity.Video;

@Service
public interface ForumService {
	
	/**
	 * 根据论坛类型查询出符合条件的论坛
	 * @param forumliebie
	 * @return
	 */
	public List<Forum> findForumListById(String _forumid);
	
	
	/**
	 * 根据ID查询出当前帖子的所有留言
	 * @return
	 */
	public List<Forumreply> findForumreplyByID(String _forumreplyid);
	
	/**
	 *  将video 全部信息全部查询出来
	 * 
	 */
	public List<Video> loadVideoList(String _videocategory);

	/**
	 * 查询帖子信息
	 * @param _forumid
	 * @return
	 */
	public Forum findForumById(String _forumid);
	
	
	
}
