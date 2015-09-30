package com.example;

import java.util.Observable;

public class Order extends Observable {
	static final String PUBLISH = "�ѷ���";
	static final String ACCEPTED = "�ѽ���";
	static final String DELIVERING = "������";
	static final String COMPLETED = "�����";
	
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
