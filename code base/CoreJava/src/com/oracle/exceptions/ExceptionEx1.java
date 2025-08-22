package com.oracle.exceptions;

public class ExceptionEx1 {
public static void main(String[] args) {
	System.out.println("Welcome ...");
	int a=10;
	int b=5;
	try {
		int arr[]= {1,2,3,4,5};
		System.out.println(arr[5]);
		int c=a/(b*2-a); //program stops here .... /0
		System.out.println("C : "+c);
	}
	catch(Exception e) {
		System.out.println("In catch");
	}
	System.out.println("End");
}
}
