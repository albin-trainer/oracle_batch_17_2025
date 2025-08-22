package com.oracle;

import jakarta.persistence.Entity;

@Entity
public class HomeLoan extends Loan {
private String address;
//setter and getter

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}


}
