package com.main.service.shopp;

/**
 * 商品异常类
 * @author gyc
 *
 */
public class ShoppException extends Exception{
	public ShoppException(String str) {
		super(str);
	}
	
	@Override
	public void printStackTrace() {
		super.printStackTrace();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
