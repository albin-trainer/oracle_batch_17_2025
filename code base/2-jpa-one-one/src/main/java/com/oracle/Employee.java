package com.oracle;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Employee {
	@Id
	@GeneratedValue
private int empId;
private String empName;
private String email;
@OneToOne //creates FK concatenate two fields
@JoinColumn(name="laptop_sno") //optional
private Laptop laptop;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Laptop getLaptop() {
	return laptop;
}
public void setLaptop(Laptop laptop) {
	this.laptop = laptop;
}


}
