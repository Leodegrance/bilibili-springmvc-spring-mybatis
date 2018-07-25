package com.main.service.video;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.entity.Message;
import com.main.entity.Video;



@Service
public interface VideoService {
	/**
	 * ��ѯ�ж�������Ƶ��¼
	 * @return
	 */
	public Integer loadVideoCount();
	
	/**
	 * �������ѯ��Ƶ
	 * @param _vAtegory
	 * @return
	 */
	public List<Video> loadVideoList(String _vAtegory);
	
	/**
	 * �������ѯ��Ʒ
	 * @return
	 */
	public List<Video> randomVideoList(Integer _randomNum);
	
	/**
	 * ������ƷID����meessage
	 * @param _videoid
	 * @return
	 */
	public List<Message> loadMessageListByVideoId(String _videoid);
}
