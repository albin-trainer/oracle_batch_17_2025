package com.oracle;

import jakarta.persistence.Entity;

@Entity
public class CarLoan extends Loan{
private String vehicleNum;
//setter and getter

public String getVehicleNum() {
	return vehicleNum;
}

public void setVehicleNum(String vehicleNum) {
	this.vehicleNum = vehicleNum;
}

}
