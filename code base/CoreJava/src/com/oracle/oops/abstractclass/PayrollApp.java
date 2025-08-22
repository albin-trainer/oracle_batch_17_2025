package com.oracle.oops.abstractclass;
public class PayrollApp {
public static void main(String[] args) {
	PerEmp e1=new PerEmp(101, "A", 50000, 10000, 10000);
	ContractEmp e2=new ContractEmp(102, "B", 10, 10000);
	Employee emps[]= {e1,e2};
	processSalaryForAllEmps(emps);
}

//this method in a different module/class
static void processSalaryForAllEmps(Employee emps[]) {
	for(Employee e:emps) {
		//this developer have no idea abt the
		//implementation since its abstract
		//method
		e.calculateSalary();//pure polymorphism ..
	}
}
}
