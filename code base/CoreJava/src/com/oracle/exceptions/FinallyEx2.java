package com.oracle.exceptions;
public class FinallyEx2 {
public static void main(String[] args) {
	int x=login("Albin","1234");
	System.out.println(x);
	x=login("x","x");
	System.out.println(x);
}
static int login(String uname,String pwd) {
	try {
	if(uname.equals("Albin") && pwd.equals("1234"))
		return 1;
	else
		throw new AuthenticationFailedException(); //throw the exception
	}
	catch(AuthenticationFailedException ex) {
		System.out.println("In catch");
		return 2;
	}
	finally {
		System.out.println("In finally");
		//return 3;
	}
}
}
class AuthenticationFailedException extends RuntimeException{
}
