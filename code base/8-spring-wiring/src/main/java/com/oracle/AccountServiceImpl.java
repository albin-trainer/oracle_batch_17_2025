package com.oracle;
public class AccountServiceImpl implements AccountService {
	private AccountRep rep=null;
	public AccountServiceImpl() {
		System.out.println("service constructor");
	}
	public void setRep(AccountRep rep) {
		this.rep = rep;
		System.out.println("setter...");
	}
	public String creditService(float amt) {
		return rep.credit(amt);
	}

}
