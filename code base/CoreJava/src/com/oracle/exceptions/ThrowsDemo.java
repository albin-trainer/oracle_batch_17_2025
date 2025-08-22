package com.oracle.exceptions;

import java.io.IOException;

public class ThrowsDemo {
public static void main(String[] args) {
	try {
		myMethod();//try catch is must, otherwise it wont compile .....
	} catch (IOException e) {
		e.printStackTrace();
	} 
}
static void myMethod()   throws IOException{
	
}
}
