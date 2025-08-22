package com.oracle.collections;
//Assume its a legacy code .....
public class Product  implements Comparable<Product>{
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
@Override
public int compareTo(Product p) {
	if(this.price<p.price)
	return -1;
	else
		return 1;
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
