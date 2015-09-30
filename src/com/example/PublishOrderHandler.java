package com.example;

public class PublishOrderHandler implements OrderHandler {

	public boolean handle(Order order) {
		// TODO Auto-generated method stub
		System.out.println("——————处理发布的订单———————");
		System.out.println("1.接受从客户端传来的订单信息，生成Order对象");
		System.out.println("2.填写数据库中的CurrentOrder表，并设置相应的状态");
		return true;
	}

}
