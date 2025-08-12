package com.oracle.oops.interfaces;
public class InterfaceEx {
	public static void main(String[] args) {
		Driveable driver=getCar("Alto");
		driver.gear(); //never minds abt which car ....
		System.out.println(driver.MAX_SPEED);
	}
	static Driveable getCar(String car) { ////this is a factory method, the method which returns obj
		if(car.equals("Honda")) return new Honda();
		else return new Alto();
	}
}
interface Driveable{
	int MAX_SPEED=200;//public static final int MAX_SPEED;
	void gear(); //public abstract void gear();
}
interface Diaganotics{

	void connectSensor();
}
class Vehicle{
	
}
class Honda  extends Vehicle implements Driveable,Diaganotics {
	public void connectSensor() {
		System.out.println("Connecting with honda car sensor");
	}
	public void gear() {
		System.out.println("Applying gear for honda car");
	}
}
class Alto implements Driveable,Diaganotics{
	public void connectSensor() {
		System.out.println("Connecting with Alto car sensor");
	}
	public void gear() {
		System.out.println("Applying Alto for honda car");
	}
}
interface DummyA{
	
}
interface DummyB extends DummyA{
	
}