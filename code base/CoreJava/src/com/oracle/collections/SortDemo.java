package com.oracle.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class SortDemo {
public static void main(String[] args) {
	ArrayList<String> names=new ArrayList<>();
	names.add("Rajesh");
	names.add("Harshitha");
	names.add("Tejas");
	names.add("Chathur");
	names.add("Akash");
	System.out.println(names);
	
	Collections.sort(names);
	
	System.out.println(names);
	Product p1=new Product(101, "Laptop", 70000, 4.2f);
	Product p2=new Product(102, "Mobile", 20000, 4.8f);
	Product p3=new Product(103, "Cookies", 10, 4.4f);
	Product p4=new Product(104, "TV", 80000, 4.1f);
	Product p5=new Product(105, "WashingMachine", 30000, 4.6f);
	ArrayList<Product> products=new ArrayList<>();
	products.add(p1);
	products.add(p2);
	products.add(p3);
	products.add(p4);
	products.add(p5);
	System.out.println(products);
	//v hv no idea based on which field
	Collections.sort(products);
	System.out.println("-----After sorting-----");
	System.out.println(products);
	System.out.println("****sort by price*******");
	//Collections.sort(products, new SortByRatings());
//	Comparator<Product> compare=(Product pr1, Product pr2)-> {
//		return pr1.getRatings()<pr2.getRatings()?1:-1;
//	};
//	Collections.sort(products, compare);
	Comparator<Product> compareByName=(pr1,pr2)->pr1.getProdName().compareTo(pr2.getProdName());
	Collections.sort(products,compareByName);
	System.out.println("-----sorted by name ------");
	System.out.println(products);
}
}
class SortByRatings implements Comparator<Product>{
	public int compare(Product p1, Product p2)  {
		return p1.getRatings()<p2.getRatings()?1:-1;
	}
}
