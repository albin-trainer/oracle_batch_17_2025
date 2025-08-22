package com.oracle;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//Apply other required JPA Annotations ....
//create objects of Car loan and HomeLoan and persist it 
//observe the results ....
@Entity
public abstract class Loan {
	@Id
private int loanAccNum;
private float amt;
private int tenor;
public int getLoanAccNum() {
	return loanAccNum;
}
public void setLoanAccNum(int loanAccNum) {
	this.loanAccNum = loanAccNum;
}
public float getAmt() {
	return amt;
}
public void setAmt(float amt) {
	this.amt = amt;
}
public int getTenor() {
	return tenor;
}
public void setTenor(int tenor) {
	this.tenor = tenor;
}

//setter and getter


}
