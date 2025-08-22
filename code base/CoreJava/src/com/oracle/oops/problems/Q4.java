package com.oracle.oops.problems;

public class Q4 {
public static void main(String[] args) {
	Parent4 p=new Child4();
	System.out.println(p.a);
	
	Object obj=new Child4();
}
}

class Parent4{
	int a=getVal();
	int b=99;
	int getVal() {
		return b+2;
	}
}

class Child4 extends Parent4{
	int getVal() {
		
		return b*2;
	}
}
