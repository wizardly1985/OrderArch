package com.example;

import java.util.Observable;

public class Order extends Observable {
	static final String PUBLISH = "已发布";
	static final String ACCEPTED = "已接受";
	static final String DELIVERING = "配送中";
	static final String COMPLETED = "已完成";
	
	String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
		this.setChanged();
		this.notifyObservers();
	}

}
