package com.oracle.oops.problems;

public class Q2 {
public static void main(String[] args) {
	Parent2 p=new Child2();
	p.f1();
	p.f2();
}
}

class Parent2{
	void f1() {
		System.out.println("I m instance methd from Parent");
	}
	static void f2() {
		System.out.println("I m static methd from Parent");
	}
}
class Child2 extends Parent2{
	void f1() {
		System.out.println("I m instance methd from Child");
	}
	static void f2() {
		System.out.println("I m static methd from Child");
	}
}