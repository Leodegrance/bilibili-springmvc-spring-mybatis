package com.main.service.forum;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.entity.Forum;
import com.main.entity.Forumreply;
import com.main.entity.Video;

@Service
public interface ForumService {
	
	/**
	 * ������̳���Ͳ�ѯ��������������̳
	 * @param forumliebie
	 * @return
	 */
	public List<Forum> findForumListById(String _forumid);
	
	
	/**
	 * ����ID��ѯ����ǰ���ӵ���������
	 * @return
	 */
	public List<Forumreply> findForumreplyByID(String _forumreplyid);
	
	/**
	 *  ��video ȫ����Ϣȫ����ѯ����
	 * 
	 */
	public List<Video> loadVideoList(String _videocategory);

	/**
	 * ��ѯ������Ϣ
	 * @param _forumid
	 * @return
	 */
	public Forum findForumById(String _forumid);
	
	
	
}
