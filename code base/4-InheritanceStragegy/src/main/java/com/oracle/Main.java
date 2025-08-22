package com.oracle;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
public class Main {
	static EntityManagerFactory emf=
			Persistence.createEntityManagerFactory("myJpaUnit"); //reads META-INF/persistence.xml
public static void main(String[] args) {
	addLoan();
}
private static void addLoan() {
	CarLoan loan1=new CarLoan();
	loan1.setLoanAccNum(1); loan1.setAmt(100000); loan1.setTenor(10); loan1.setVehicleNum("KA12345");
	
	HomeLoan loan2=new HomeLoan();
	loan2.setLoanAccNum(2); loan2.setAmt(200000); loan2.setTenor(5); loan2.setAddress("Bangalore");
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
	em.persist(loan1);
	em.persist(loan2);
	em.getTransaction().commit();
	System.out.println("Done ....");
	em.close();
}
}
