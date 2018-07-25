package com.main.service.shopp.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Grids;
import com.main.entity.GridsExample;
import com.main.entity.OrdertableExample.Criteria;
import com.main.mapper.GridsMapper;
import com.main.service.shopp.ShoppException;
import com.main.service.shopp.ShoppMangeService;

@Service
public class ShoppMangeServiceImpl implements ShoppMangeService {
	@Autowired
	private GridsMapper gridsMapper;
	
	private GridsExample _gridsExample = new GridsExample();
	/**
	 * �̵���Ʒ�б��ȡ
	 */
	@Override
	public List<Grids> loadGridList() throws ShoppException  {
		GridsExample.Criteria criteria = _gridsExample.createCriteria();
		List<Grids> gridsList = gridsMapper.selectByExample(_gridsExample);
		if(gridsList == null) {
			throw new ShoppException("��Ʒ�б�Ϊ��");
		}
		return gridsList;
	}
	
	/**
	 * ����һ����Ʒ��Ϣ
	 */
	@Override
	public Grids loadGrid(String _gridsid) throws ShoppException {
		return gridsMapper.selectByPrimaryKey(_gridsid);
	}

}
