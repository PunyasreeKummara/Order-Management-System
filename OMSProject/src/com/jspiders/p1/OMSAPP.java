package com.jspiders.p1;

public class OMSAPP {
	public static void main(String[] args) {
		System.out.println("---------------------------------");
		OrderCreation oc=new OrderCreation();
		Order e1=oc.createOrder("dress",5000.00,"hyd","flybard");
		Order e2=oc.createOrder("shirts",2500.00, "chennai","jacy");
		Order e3=oc.createOrder("bags",3000.00,  "atp","safari");
		Order e4=oc.createOrder("mobile",20000.00,  "bng","oppo");
		Order e5=oc.createOrder("laptop",40000.00,  "Atp","hp");

		//creating order database of capacity 10
		OrderDB oDB=new OrderDB(10);
		//storing order in database
				oDB.addOrder(e1);
				oDB.addOrder(e2);
				oDB.addOrder(e3);
				oDB.addOrder(e4);
				oDB.addOrder(e5);
				
				System.out.println("Total order:"+oDB.getOrderCount());
				
				oDB.viewFullDatabase();
				
				System.out.println();
				Order o=oDB.searchOrder(1005);
				System.out.println(o.getOrderno()+""+o.getName());
				oDB.updatePrice(1003,5000.00);
				oDB.viewFullDatabase();
				oDB.deleteOrder(1003);
				oDB.viewFullDatabase();
				System.out.println("Total order: "+oDB.getOrderCount());
				
				
				System.out.println("----------------------------------");
			
		
	}

}
