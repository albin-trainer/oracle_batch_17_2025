package com.oracle;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="DEPT")
public class Department {
	@Id
private int deptId;
private String deptName;
@OneToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER)
@JoinColumn(name="DEPT_ID")
private List<Employee> emps;
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public List<Employee> getEmps() {
	return emps;
}
public void setEmps(List<Employee> emps) {
	this.emps = emps;
}


}
