package com.oracle.wrapper;
public class NonGenericEx1 {
public static void main(String[] args) {
	MyData m1= new MyData();
	m1.setData("Bangalore");
	MyData m2= new MyData();
	m2.setData(100); //Auto boxing
	
	String city= (String) m1.getData(); //returns Object
	System.out.println(city);
	
	//ClassCastException @Runtime
	int num=(Integer)m1.getData(); 
	System.out.println(num);
}
}
class MyData{
	private Object data;
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}