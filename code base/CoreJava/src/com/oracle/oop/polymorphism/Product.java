package com.oracle.oop.polymorphism;
import java.time.LocalDate;
public class Product {
private int prodId;
private String prodName;
private LocalDate manufactureDate;
private float price;
void print() {
	System.out.println("Product Id "+prodId);
	System.out.println("Product name "+prodName);
	System.out.println("Price "+price);
	System.out.println("Date of manufacture "+manufactureDate);
}

public int getProdId() {
	return prodId;
}
public void setProdId(int prodId) {
	this.prodId = prodId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public LocalDate getManufactureDate() {
	return manufactureDate;
}
public void setManufactureDate(LocalDate manufactureDate) {
	this.manufactureDate = manufactureDate;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}


}
