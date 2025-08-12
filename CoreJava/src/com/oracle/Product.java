package com.oracle;
public class Product {
	//state/instance variable/ attributes
	private	int prodId; 
	private	String prodName;
	private	float price;
	
	
	public Product(int prodId, String prodName, float price) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}
	
	public Product() {
		
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		if(price>=0)
			this.price = price;
	}
	
}
