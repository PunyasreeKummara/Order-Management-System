package com.jspiders.p1;

public class OrderDB {
	private Order[] arr;
	private  int index=0;
	private  int ordercount=0;
	public OrderDB(int size) {
		arr=new Order[5];
	}
/**
 * this method is used to add order details into the database
 * @param o should be order type
 * @return returns true if added Successfully ,else returns false
 */
	public boolean addOrder(Order o) {
		if(index<arr.length) {
			arr[index++]=o;
			System.out.println("Order details to be DB");
			ordercount++;
			return true;
		}
		else {
			System.out.println("database is full");
			return false;
		}
	}
	/**
	 * this method prints all the  order details 
	 */
	public void viewFullDatabase() {
		System.out.println("----------------------------------");
		System.out.println("Orderno\tName\tPrice\tLoc\tloc");
		System.out.println("----------------------------------");
		for(Order ord:arr) {
			if(ord!=null) {
				System.out.println(ord.getOrderno()+"\t"+ord.getName()+"\t"+ord.getPrice()+"\t"+ord.getloc()+
						"\t"+ord.getBrand());
			}
		}
	}
	/**
	 * this method used to get total orders in database 
	 * @return return int value representing total orders
	 */
	public int getOrderCount(){
		return ordercount;
	}
	/**
	 * this method is used to search orders based on orderno,
	 * @param orderno of the order to be searched
	 * @return return reference to found employee otherwise returns null
	 */
	public Order searchOrder(int orderno) {
		Order o=null;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null&&arr[i].getOrderno()==orderno) {
				System.out.println("order is  found in database");
				o=arr[i];
			}
		}
		if(o==null) {
			System.out.println("order is not found in database");
		}
		return o;
	}
	/**
	 * this method is used to update the price . if order is found in
	 * database it will update price of the order by the specified amount
	 * @param orderno -employee orderno whose salary to be update
	 * @param amount to be added to price
	 * @return true-if update is success
	 *         false-if update is failed
	 */
	public boolean updatePrice(int orderno,double amount) {
		Order o=searchOrder(orderno);
		if(o!=null) {
			o.setPrice(o.getPrice()+amount);
			System.out.println("Price updated");
			return true;
		}
		else {
			System.out.println("unable to update,check your  orderno");
			return false;
		}
	}
	/**
	 * this method is used to delete order details from database.
	 * it deletes the complete order details is the record is found in database
	 * @param orderno of the employee to be deleted
	 * @return true-if order is success
	 *         false-if update is failed
	 */        
	public boolean deleteOrder(int orderno) {
		boolean isDeleted=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null&&arr[i].getOrderno()==orderno) {
				System.out.println("order found in database and deleted");
				arr[i]=null;
				isDeleted=true;
				ordercount--;
			}
		}
		if(isDeleted==false) {
			System.out.println("order is not found in database");
		}
		return isDeleted;
	}

}
