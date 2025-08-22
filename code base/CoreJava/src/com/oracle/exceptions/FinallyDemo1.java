package com.oracle.exceptions;
public class FinallyDemo1 {
public static void main(String[] args) {
	try {
		int a=10;
		System.out.println("opened a resource ");
		if(a>1) {
			System.out.println("bye bye");
			return;
		}
	}
	finally {
		System.out.println("wait .... will close the res In finally .....");
	}
	System.out.println("Main ends .....");
}
}
