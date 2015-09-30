package com.example;

public class DeliveringOrderHandler implements OrderHandler {

	public boolean handle(Order order) {
		// TODO Auto-generated method stub
		System.out.println("——————处理配送中的订单——————");
		System.out.println("1.配送员取货，并通过客户端修改订单状态");
		return false;
	}

}
