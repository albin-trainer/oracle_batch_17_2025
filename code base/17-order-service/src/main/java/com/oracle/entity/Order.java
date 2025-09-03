package com.oracle.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
public class Order {

private int productId;
private String prodName;
private float price;
private String portNo;
private int quantity;
public Order() {
	// TODO Auto-generated constructor stub
}
public Order(int productId, String prodName, float price, String portNo, int quantity) {
	super();
	this.productId = productId;
	this.prodName = prodName;
	this.price = price;
	this.portNo = portNo;
	this.quantity = quantity;
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
public String getPortNo() {
	return portNo;
}
public void setPortNo(String portNo) {
	this.portNo = portNo;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

}
