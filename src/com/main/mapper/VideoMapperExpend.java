package com.main.mapper;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.main.entity.Message;
import com.main.entity.Video;

public interface VideoMapperExpend {
	public Integer loadVideoCount()throws SQLException;
	
	public List<Video> loadVideoList(String _vAtegory)throws SQLException;
	
	public List<Video> randomVideoList(Integer _randomNum)throws SQLException;
	
	
}
