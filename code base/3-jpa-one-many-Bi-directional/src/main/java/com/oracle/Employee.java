package com.oracle;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="EMP_INFO_2")
public class Employee {
	@Id
	@GeneratedValue
 private int empId;
 private String empName;
 private float salary;
 @ManyToOne //makes new col (FK)
 @JoinColumn(name="deptId") //optional
 private Department dept;
public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
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
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
 
 
}
