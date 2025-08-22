package com.oracle.oops.abstractclass;
public class PerEmp extends Employee{
private float basic; 
private float pf;
private float hra;
public PerEmp(int empId, String empName, float basic, float pf, float hra) {
	super(empId, empName);
	this.basic = basic;
	this.pf = pf;
	this.hra = hra;
}
void calculateSalary() {
	float totalSal=basic+pf+hra;
	System.out.println("Total salary for Per Emp is "+totalSal);
}
}
