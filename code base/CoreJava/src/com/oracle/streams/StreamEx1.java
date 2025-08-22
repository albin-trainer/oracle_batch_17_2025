package com.oracle.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamEx1 {
public static void main(String[] args) {
	Product p1=new Product(101, "Mobile", 25000, 4.5f);
	Product p2=new Product(102, "Chips", 50, 4.8f);
	Product p3=new Product(103, "Maggi", 25, 4.1f);
	Product p4=new Product(104, "Ice cream", 100, 4.2f);
	Product p5=new Product(105, "Pizza", 500, 4.6f);
	ArrayList<Product> products=new ArrayList<>();
	products.add(p1);products.add(p2);products.add(p3);products.add(p4);products.add(p5);
	Predicate<Product> predicate=(p)->p.getPrice()<=1000;
	Consumer<Product> consumer=(p)->System.out.println(p);
	
	products.stream().filter(predicate).forEach(consumer);
	//fint the costliest product  --> use max method of stream
	 Comparator<Product> findMax=(pr1,pr2)->pr1.getPrice()<pr2.getPrice()?-1:1;
	Product max=  products.stream().max(findMax).get();
	System.out.println( "Costiest Product :"+ max);
	
	//find the cheapest product--> use min method of stream
	//sort by ratings H to L using streams -->--> use sorted method of stream
	
	// Product maxProduct= products.stream().max(null).get();
	double totalPrice=	products.stream().mapToDouble(p->p.getPrice()).sum();
	System.out.println("Total price : "+totalPrice);
	double avgRatings=products.stream().mapToDouble(p->p.getRatings()).average().getAsDouble();
	System.out.println(avgRatings);
}
}
