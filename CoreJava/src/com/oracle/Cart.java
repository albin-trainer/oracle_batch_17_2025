package com.oracle;
public class Cart {
private Product products[];
private float totalPrice;
//setter and getter
public Product[] getProducts() {
	return products;
}
public void setProducts(Product[] products) {
	this.products = products;
}
public float getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(float totalPrice) {
	this.totalPrice = totalPrice;
}

}
