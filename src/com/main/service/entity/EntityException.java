package com.main.service.entity;

public class EntityException extends Exception {
	public EntityException(String _string) {
		super(_string);
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
