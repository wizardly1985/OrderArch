package com.example;

public class AcceptedOrderHandler implements OrderHandler {

	public boolean handle(Order order) {
		// TODO Auto-generated method stub
		System.out.println("————————处理接受的订单————————");
		System.out.println("1.接受客户端的信息，查询数据库，修改订单的状态");
		System.out.println("2.系统分配配送员，并推送消息给配送员");
		return false;
	}

}
