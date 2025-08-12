package com.oracle.oop.polymorphism;
public abstract class Account {
private static int accNumCounter;
private int accNum;
private String accHolderName;
private float balAmt;
{
	accNumCounter++;
}
public Account() {
}
public Account( String accHolderName, float balAmt) {
	this.accHolderName = accHolderName;
	this.balAmt = balAmt;
	this.accNum=accNumCounter;
}
void deposit(float amt) {
	balAmt+=amt;
}
void fundTransfer(Account benAcc, float amtToTransfer) {
	if(balAmt>=amtToTransfer) {
		benAcc.balAmt+=amtToTransfer;
		balAmt-=amtToTransfer;
		System.out.println("Fund transfer Success...");
	}
	else
		System.out.println("Insufficient funds");
}
void info() {
	System.out.println("ACc no "+accNum);
	System.out.println("Name : "+accHolderName);
	System.out.println("Balance Amt "+balAmt);
}
public static int getAccNumCounter() {
	return accNumCounter;
}
public int getAccNum() {
	return accNum;
}
public String getAccHolderName() {
	return accHolderName;
}
public float getBalAmt() {
	return balAmt;
}
public void setAccNum(int accNum) {
	this.accNum = accNum;
}
public void setAccHolderName(String accHolderName) {
	this.accHolderName = accHolderName;
}
public void setBalAmt(float balAmt) {
	this.balAmt = balAmt;
}
}
