package com.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.main.entity.Forumreply;
import com.main.entity.ForumreplyExample;

public interface ForumreplyMapper {
    int countByExample(ForumreplyExample example);

    int deleteByExample(ForumreplyExample example);

    int deleteByPrimaryKey(String replyid);

    int insert(Forumreply record);

    int insertSelective(Forumreply record);

    List<Forumreply> selectByExample(ForumreplyExample example);

    Forumreply selectByPrimaryKey(String replyid);

    int updateByExampleSelective(@Param("record") Forumreply record, @Param("example") ForumreplyExample example);

    int updateByExample(@Param("record") Forumreply record, @Param("example") ForumreplyExample example);

    int updateByPrimaryKeySelective(Forumreply record);

    int updateByPrimaryKey(Forumreply record);
}