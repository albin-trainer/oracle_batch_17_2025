package com.oracle;

public class ArrayEx2 {
public static void main(String[] args) {
	//create 5 product objects
	//store in a array
	//iterate it 
	Product p1=new Product();
	//call setters
	Product p2=new Product();
	//call setters
	Product p3=new Product();
	//call setters
	Product p4=new Product();
	//call setters
	Product p5=new Product();
	//call setters
	Product myCart[]= new Product[5];
	myCart[0]=p1;// new Product();
	myCart[1]=p2;
	
	Product myCart2[]= {p1,p2,p3,p4,p5};
	for(Product p:myCart2) {
		System.out.println(p.getProdId()+" "+p.getProdName()+" "+p.getPrice());
	}
}
}
