package com.oracle;
public class ShoppingApp {
public static void main(String[] args) {
	Product p1=new Product(101,"Mobile",10000);
	Product p2=new Product(102,"T shirt",1000);
	Product p3=new Product(103,"Java Book",500);
	Product p4=new Product(104,"TV",10000);
	Product p5=new Product(105,"Jeans",2000);
	Product products[]= {p1,p2,p3,p4,p5};
	Cart cart=new Cart();
	cart.setProducts(products);
	Customer c=new Customer();
	c.setCustId(1);
	c.setCustName("Sanjay");
	c.setAddress("Bangalore");
	c.setEmail("sanjay@oracle.com");
	c.setCustomerCart(cart);
	printDetails(c);
	//create products & store in the cart 
	//store cart in the customer obj
	//print all the details ...
}
static void printDetails(Customer c) {
	System.out.println("cname : "+c.getCustName());
	System.out.println("Address : "+c.getAddress());
	System.out.println("----Items in the  Cart----");
	for(Product p:c.getCustomerCart().getProducts()) {
		System.out.println(p.getProdName()+" "+p.getProdId()+" "+p.getPrice());
	}
	
}
}
