package com.main.mapper;

import java.sql.SQLException;
import java.util.List;

import com.main.entity.Grids;
import com.main.service.shopp.ShoppException;

public interface GridsMapperExpand {
	public List<Grids> selectGridList()throws SQLException;
	
	public Grids findGridById()throws SQLException;
}
