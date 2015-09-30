package com.example;

public class Test {
	public static void main(String[] args) {
		Order order = new Order();
		OrderObserver observer = new OrderObserver();
		order.addObserver(observer);
		
		observer.setHandler(PublishOrderHandler.class);
		order.setStatus(Order.PUBLISH);
		
		observer.setHandler(AcceptedOrderHandler.class);
		order.setStatus(Order.ACCEPTED);
		
		observer.setHandler(DeliveringOrderHandler.class);
		order.setStatus(Order.DELIVERING);
		
		observer.setHandler(CompletedOrderHandler.class);
		order.setStatus(Order.COMPLETED);
	}
}
