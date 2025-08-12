package com.oracle.oops.abstractclass;
public class ContractEmp extends Employee {
private int workingDays;
private float wages;
public ContractEmp(int empId, String empName, int workingDays, float wages) {
	super(empId, empName);
	this.workingDays = workingDays;
	this.wages = wages;
}
void calculateSalary() {
	float totalSal=workingDays*wages;
	System.out.println("Total sal of contract emp is "+totalSal);
}
}
