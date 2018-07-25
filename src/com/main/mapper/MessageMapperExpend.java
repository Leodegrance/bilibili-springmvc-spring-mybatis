package com.main.mapper;

import java.sql.SQLException;
import java.util.List;

import com.main.entity.Message;

public interface MessageMapperExpend {
	public List<Message> loadMessageListByVideoId(String _videoid)throws SQLException;
}
