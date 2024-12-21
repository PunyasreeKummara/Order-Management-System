package com.jspiders.p1;

public class Order {
		private  final int orderno;
		private String name;
		private double price;
		private String loc;
		private String brand;
		public Order(int orderno, String name, double price, String loc,String brand) {
			this.orderno = orderno;
			this.name = name;
			this.price = price;
			this.loc = loc;
			this.brand=brand;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getloc() {
			return loc;
		}
		public void setloc(String loc) {
			this.loc = loc;
		}
		public int getOrderno() {
			return orderno;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		
		
		
		
		
		
		

	}



