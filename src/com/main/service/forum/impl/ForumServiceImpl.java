package com.main.service.forum.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Forum;
import com.main.entity.ForumExample;
import com.main.entity.Forumreply;
import com.main.entity.ForumreplyExample;
import com.main.entity.Video;
import com.main.mapper.ForumMapper;
import com.main.mapper.ForumreplyMapper;
import com.main.service.forum.ForumService;

@Service
public class ForumServiceImpl implements ForumService{
	@Autowired
	ForumMapper forumMapper;
	
	@Autowired
	ForumreplyMapper forumreplyMapper;
	
	private ForumExample _forumExample = new ForumExample();
	
	private ForumreplyExample _forumreplyExample = new ForumreplyExample();
	
	public List<Forum> findForumListById(String _forumid) {
		ForumExample.Criteria criteria = _forumExample.createCriteria();
		criteria.andForumliebieEqualTo(_forumid);
		List<Forum> forumList = forumMapper.selectByExample(_forumExample);
		return forumList;
	}

	@Override
	public List<Forumreply> findForumreplyByID(String _forumreplyid) {
		ForumreplyExample.Criteria criteria = _forumreplyExample.createCriteria();
		criteria.andReplyidEqualTo(_forumreplyid);
		List<Forumreply> forumreplyList = forumreplyMapper.selectByExample(_forumreplyExample);
		return forumreplyList;
	}

	@Override
	public List<Video> loadVideoList(String _videocategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Forum findForumById(String _forumid) {
		return forumMapper.selectByPrimaryKey(_forumid);
	}

}
