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
System.out.println("one to one demo");
}
 static void addNewLaptop() {
 }
 static void addNewEmp() {
	 //ignore laptop now
 }
 static void distributeLaptop(int empId, String laptopSerialNo) {
	 EntityManager em=emf.createEntityManager();
	 em.getTransaction().begin();
	 Laptop laptop=em.find(Laptop.class, laptopSerialNo);
	 Employee emp=em.find(Employee.class, empId);
	 if(laptop!=null && emp!=null) {
		 emp.setLaptop(laptop);
		 System.out.println("Laptop is distributed to the employee");
	 }
	 else
		 System.out.println("laptop  ser no / emp id is incorrect");
	 em.getTransaction().commit();
	 em.close();
 }
 static void getLaptopDetailsByEmpId(int empId) {
	 ///
 }
 static void getEmpDetailsByLaptopSerNo(String laptopSerNum) {
	 
 }
}
