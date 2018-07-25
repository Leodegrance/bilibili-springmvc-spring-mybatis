package com.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.main.entity.Grids;
import com.main.entity.GridsExample;

public interface GridsMapper {
    int countByExample(GridsExample example);

    int deleteByExample(GridsExample example);

    int deleteByPrimaryKey(String gridsid);

    int insert(Grids record);

    int insertSelective(Grids record);

    List<Grids> selectByExample(GridsExample example);

    Grids selectByPrimaryKey(String gridsid);

    int updateByExampleSelective(@Param("record") Grids record, @Param("example") GridsExample example);

    int updateByExample(@Param("record") Grids record, @Param("example") GridsExample example);

    int updateByPrimaryKeySelective(Grids record);

    int updateByPrimaryKey(Grids record);
}