package com.oracle.oop.polymorphism;

public class CurrentAccount extends Account {
private float overDraftAmt;
public CurrentAccount( String accHolderName, float balAmt,float overDraftAmt) {
	super(accHolderName,balAmt);
	this.overDraftAmt = overDraftAmt;
}
void fundTransfer(Account benAcc, float amtToTransfer) {
	if(getBalAmt()+overDraftAmt>=amtToTransfer) {
		benAcc.setBalAmt(benAcc.getBalAmt()+amtToTransfer);
		setBalAmt(getBalAmt()-amtToTransfer);
		System.out.println("Fund transfer Success...");
	}
	else
		System.out.println("Insufficient funds");
}
}
