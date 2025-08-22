package com.oracle.lambdas;
//Assume its a legacy code .....
public class Product{
private int prodId;
private String prodName;
private float price;
private float ratings;
public Product(int prodId, String prodName, float price, float ratings) {
	super();
	this.prodId = prodId;
	this.prodName = prodName;
	this.price = price;
	this.ratings = ratings;
}
//@Override
public String toString() {
	return "Product [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + ", ratings=" + ratings + "]\n";
}

public int getProdId() {
	return prodId;
}
public String getProdName() {
	return prodName;
}
public float getPrice() {
	return price;
}
public float getRatings() {
	return ratings;
}


}
