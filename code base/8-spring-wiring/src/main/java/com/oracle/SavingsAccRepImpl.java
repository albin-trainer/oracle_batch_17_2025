package com.oracle;
public class SavingsAccRepImpl implements AccountRep {
	public SavingsAccRepImpl() {
		System.out.println("saving constructor");
	}
	public String credit(float amt) {
		return "Hi the salary of "+amt+" credited in ur savings acc";
	}
}
