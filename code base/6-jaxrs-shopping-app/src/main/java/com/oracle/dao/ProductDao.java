package com.oracle.dao;

import java.util.ArrayList;
import java.util.List;

import com.oracle.model.Product;
import com.oracle.model.Review;

public class ProductDao {
List<Product> list=new ArrayList<>();
public ProductDao() {
	Review r1=new Review(9001, "Chathur", "Excellent product", 4.9f);
	Review r2=new Review(9002, "Harshita", "Good !!!", 4.5f);
	Review r3=new Review(9003, "Tejas", "I like the product", 4.7f);
	Review r4=new Review(9004, "Ajaya", "Nice !!", 4.2f);
	Review r5=new Review(9005, "Saksham", "Good", 4.4f);
	ArrayList<Review> reviews1=new ArrayList<>();
	reviews1.add(r1);reviews1.add(r2);reviews1.add(r3);
	ArrayList<Review> reviews2=new ArrayList<>();
	reviews2.add(r4);reviews2.add(r5);
	list.add(new Product(101, "T Shirt", 999.99f,reviews1) );
	list.add(new Product(102, "Jeans", 2000,reviews2) );
	list.add(new Product(103, "Bottle", 200,reviews2) );
	list.add(new Product(104, "Shoes", 2500,reviews1) );
	list.add(new Product(105, "Bag", 1500,reviews1) );
}

public List<Product> allProducts(){
	return list;
}
}
