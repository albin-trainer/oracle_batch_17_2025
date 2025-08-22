package com.oracle.oops.problems;

public class Q1 {
public static void main(String[] args) {
	new Child1();
}
}
class Parent1{
	public Parent1() {
		hello();
	}
	 void hello() {
		System.out.println("Hello from Parent");
	}
}

class Child1 extends Parent1{
	@Override
	void hello() { //change the impl of Parent class
		System.out.println("Hello from Child");
	}
}
