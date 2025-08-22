package com.oracle.oop.polymorphism;

public class BankApp {
	public static void main(String[] args) {
		//new Account();
Account a1=new SavingsAccount("A",10000);
Account a2=new CurrentAccount("B", 1000, 500);
a1.info();
System.out.println("-------------");
a2.info();
a1.fundTransfer(a2, 500);
System.out.println("--After transaction--");
a1.info();
System.out.println("-------------");
a2.info();
a2.fundTransfer(a1, 2001);
System.out.println("--After transaction--");
a2.info();
	}
}
