package com.oracle;
public class Main {
	public static void main(String[] args) {
		int x=10;
		//p1 is the ref variable, internally its pointer 
	  Product p1=new Product(); //new to allocate memory in heap
	  p1.setProdId(101);
	  p1.setProdName("Mobile");
	  p1.setPrice(9999.99f);
	//  syso + ctrl space
	  System.out.println("prod id is "+p1.getProdId());
	  System.out.println("prd name is "+p1.getProdName());
	  System.out.println("price is "+p1.getPrice());
	  update(p1);
	  System.out.println("price is "+p1.getPrice());
	}
	
	static void update(Product p) {
		p.setPrice(100);
	}
}
