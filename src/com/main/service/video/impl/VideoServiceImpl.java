package com.main.service.video.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Message;
import com.main.entity.Video;
import com.main.mapper.MessageMapperExpend;
import com.main.mapper.VideoMapper;
import com.main.mapper.VideoMapperExpend;
import com.main.service.video.VideoService;

@Service
public class VideoServiceImpl implements VideoService{
	@Autowired
	VideoMapper videoMapper;

	@Autowired
	VideoMapperExpend videoMapperExpend;
	
	@Autowired
	MessageMapperExpend messageMapperExpend;
	
	@Override
	public Integer loadVideoCount() {
		try {
			return videoMapperExpend.loadVideoCount();
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}

	@Override
	public List<Video> loadVideoList(String _vAtegory) {
		try {
			return videoMapperExpend.loadVideoList(_vAtegory);
		} catch (SQLException e) {
			throw new RuntimeException();
		}
		
	}

	@Override
	public List<Video> randomVideoList(Integer _randomNum) {
		try {
			return videoMapperExpend.randomVideoList(_randomNum);
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}

	@Override
	public List<Message> loadMessageListByVideoId(String _videoid) {
		try {
			return messageMapperExpend.loadMessageListByVideoId(_videoid);
		} catch (SQLException e) {
			throw new RuntimeException();
		}
		
	}
	

	
}
