package com.oracle;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Laptop {
	@Id
private String serialNum;
private String brand;
private String os;

public String getSerialNum() {
	return serialNum;
}
public void setSerialNum(String serialNum) {
	this.serialNum = serialNum;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getOs() {
	return os;
}
public void setOs(String os) {
	this.os = os;
}




}
