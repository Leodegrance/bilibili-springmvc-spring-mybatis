package com.main.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.main.entity.Grids;
import com.main.entity.Ordertable;
import com.main.service.shopp.ShoppException;
import com.main.service.shopp.ShoppMangeService;

import commons.walkman.commons.CommonUtils;

/**
 * �̵�
 * 
 * @author gyc
 *
 */
@Controller
public class Shopp {
	@Autowired
	private ShoppMangeService shoppMangeService;

	/**
	 * ��Ʒ�б�
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("shopping.do")
	public String shopping(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		try {
			List<Grids> gridslist = shoppMangeService.loadGridList();
			// ����Ʒ�б������map��
			Map<String, List<Grids>> maps = new HashMap<>();
			maps.put("gridslist", gridslist);
			request.setAttribute("gridslist", gridslist);
		} catch (ShoppException e) {
			e.printStackTrace();
		}
		return "shopping/shopping";
	}

	/**
	 * ��Ʒ����
	 * 
	 * @param request
	 * @param girdsID
	 * @return
	 */
	@RequestMapping("griddetail.do")
	public String griddetail(HttpServletRequest request, String girdsid) {
		try {
			Grids grids = shoppMangeService.loadGrid(girdsid);
			request.setAttribute("grids", grids);
		} catch (ShoppException e) {
			e.printStackTrace();
		}

		return "shopping/griddetail";

	}

	/**
	 * ȷ�϶���
	 * 
	 * @param request
	 * @param girdsID
	 * @param gridsName
	 * @param gridskucun
	 * @param gridsjiage
	 * @param gridsimg
	 * @return
	 */
	@RequestMapping("confirmorder.do")
	public String confirmorder(HttpServletRequest request, String gridsid, String gridsname, int gridskucun,
			String gridsjiage, String gridsimg) {
		// ��������
		try {
			gridsname = new String(gridsname.getBytes("ISO-8859-1"), "UTF-8");

		} catch (UnsupportedEncodingException e) {

			System.out.println("confirmorder.do" + "�����������ʧ��");
		}

		Grids grids = new Grids();
		grids.setGridsid(gridsid);
		grids.setGirdsname(gridsname);
		grids.setGirdskucun(gridskucun);
		grids.setGirdsimg(gridsimg);
		grids.setGirdsjiage(gridsjiage);
		request.setAttribute("grids", grids);
		return "shopping/confirmorder";
	}

	@RequestMapping("shoppingcart.do")
	public String shoppingcart(HttpServletRequest request) {
		return "shopping/shoppingcart";
	}
}
