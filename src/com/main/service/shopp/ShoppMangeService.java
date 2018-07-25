package com.main.service.shopp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.entity.Grids;



/**
 * …Ã∆∑÷‹±ﬂ
 * @author gyc
 *
 */
@Service
public interface ShoppMangeService {
	public List<Grids> loadGridList()throws ShoppException;
	
	public Grids loadGrid(String _gridsid)throws ShoppException;
}
