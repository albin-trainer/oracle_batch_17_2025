package com.oracle;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity //map the class with the table Its Mandatory
@Table(name="customer") //Optional ....to map the class with different table(default is class name)
@DynamicUpdate
public class Customer {
	@Id //Mandatory (PK)
private int custId;
	@Column(length = 40) //optional
private String customerName;
	@Column(name="custaddress",length = 50)//optional
private String address;
	@Column(length = 25,unique = true)
private String email;

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


}
