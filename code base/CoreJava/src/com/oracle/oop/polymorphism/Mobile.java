package com.oracle.oop.polymorphism;

public class Mobile extends Product {
private String ramMemory;
private String battery;

public String getRamMemory() {
	return ramMemory;
}
public void setRamMemory(String ramMemory) {
	this.ramMemory = ramMemory;
}
public String getBattery() {
	return battery;
}
public void setBattery(String battery) {
	this.battery = battery;
}

}
