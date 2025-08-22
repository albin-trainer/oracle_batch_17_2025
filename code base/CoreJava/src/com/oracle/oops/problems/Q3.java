package com.oracle.oops.problems;

public class Q3 {
public static void main(String[] args) {
	Parent3 p=new Child3();
	System.out.println(p.x);//10
	System.out.println(p.getX());//99
}
}
class Parent3{
	int x=10;
	int getX() {
		return x;
	}
}
class Child3 extends Parent3{
	int x=99;
	int getX() {
		return x;
	}
}
