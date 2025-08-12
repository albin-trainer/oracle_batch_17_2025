package com.oracle.lambdas;
import java.util.ArrayList;
import java.util.List;
public class LombdaMotivation {
public static void main(String[] args) {
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
	filterAndDisplay(products, new FilterByPrice());
	filterAndDisplay(products, p->p.getRatings()>=4.5);
}
static void filterAndDisplay(List<Product> plist, ProductFilter filter) {
	for(Product p:plist) {
		if(filter.test(p)) {
			System.out.println(p);
		}
	}
}
}
class FilterByPrice implements ProductFilter{
	public boolean test(Product p) {
		return p.getPrice()<=50000;
	}
}
