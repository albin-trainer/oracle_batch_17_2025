package com.oracle.model;
import java.util.List;

import jakarta.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Product {
private int productId;
private String prodName;
private float price;
private List<Review> reviews;

public Product() {
	// TODO Auto-generated constructor stub
}

public Product(int productId, String prodName, float price) {
	super();
	this.productId = productId;
	this.prodName = prodName;
	this.price = price;
}



public Product(int productId, String prodName, float price, List<Review> reviews) {
	super();
	this.productId = productId;
	this.prodName = prodName;
	this.price = price;
	this.reviews = reviews;
}

public List<Review> getReviews() {
	return reviews;
}

public void setReviews(List<Review> reviews) {
	this.reviews = reviews;
}

public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}


}
