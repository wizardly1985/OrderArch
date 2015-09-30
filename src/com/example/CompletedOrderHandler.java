package com.example;

public class CompletedOrderHandler implements OrderHandler {

	public boolean handle(Order order) {
		// TODO Auto-generated method stub
		System.out.println("——————处理完成的订单——————");
		System.out.println("1.配送员把货交付给客户");
		System.out.println("2.客户支付完成订单");
		System.out.println("3.处理数据库中的信息");
		return false;
	}

}
