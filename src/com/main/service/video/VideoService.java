package com.main.service.video;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.entity.Message;
import com.main.entity.Video;



@Service
public interface VideoService {
	/**
	 * 查询有多少条视频记录
	 * @return
	 */
	public Integer loadVideoCount();
	
	/**
	 * 按分类查询视频
	 * @param _vAtegory
	 * @return
	 */
	public List<Video> loadVideoList(String _vAtegory);
	
	/**
	 * 按随机查询商品
	 * @return
	 */
	public List<Video> randomVideoList(Integer _randomNum);
	
	/**
	 * 根据商品ID查找meessage
	 * @param _videoid
	 * @return
	 */
	public List<Message> loadMessageListByVideoId(String _videoid);
}
