package com.example;

import java.util.Observable;
import java.util.Observer;

public class OrderObserver implements Observer {
	private OrderHandler handler;
	
	public void setHandler(Class handlerClass) {
		try {
			handler = (OrderHandler) handlerClass.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		System.out.println("�����������������۲��ߴ�����������������");
		Order order = (Order)arg0;
		System.out.println("������״̬����>"+order.getStatus());
		handler.handle(order);
	}

}
