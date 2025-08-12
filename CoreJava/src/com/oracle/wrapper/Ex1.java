package com.oracle.wrapper;

public class Ex1 {
public static void main(String[] args) {
	int x=99;
	Integer obj1=new Integer(x);//prior to 1.5 version
	
	Integer obj2=x; //Auto-boxing
	System.out.println(obj2);
	Object obj3=99; //Auto-boxing
	System.out.println(obj3);
}
}
