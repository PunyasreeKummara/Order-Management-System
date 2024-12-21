package com.jspiders.p1;

public class OrderCreation {
	private static int randum=1001;
	public Order createOrder(String name,double price,String loc,String brand) {
		Order o=new Order(randum++,name,price,loc,brand);
		return o;
	}
	

}
