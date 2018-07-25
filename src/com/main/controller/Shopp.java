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
 * 商店
 * 
 * @author gyc
 *
 */
@Controller
public class Shopp {
	@Autowired
	private ShoppMangeService shoppMangeService;

	/**
	 * 商品列表
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("shopping.do")
	public String shopping(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		try {
			List<Grids> gridslist = shoppMangeService.loadGridList();
			// 将商品列表遍历到map里
			Map<String, List<Grids>> maps = new HashMap<>();
			maps.put("gridslist", gridslist);
			request.setAttribute("gridslist", gridslist);
		} catch (ShoppException e) {
			e.printStackTrace();
		}
		return "shopping/shopping";
	}

	/**
	 * 商品详情
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
	 * 确认订单
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
		// 乱码问题
		try {
			gridsname = new String(gridsname.getBytes("ISO-8859-1"), "UTF-8");

		} catch (UnsupportedEncodingException e) {

			System.out.println("confirmorder.do" + "这里的乱码解决失败");
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
