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
//	System.out.println("Observe the table creation....");
	//addNewCustomer();
	//searchByCustomerId(11);
	// allCustomers();
	//searchCustomersByAddress("Mumbai");
	updateAddress(101, "Mumbai");
}
static void updateAddress(int cid,String newAddreess) {
	//DO IT .....
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
	Customer c=  em.find(Customer.class, cid); //here it will a copy in p context (cache)
	 //and gives another copy
	if(c!=null) {
		c.setAddress(newAddreess);
		System.out.println("updated !!!!");
	}
	else
		System.out.println("invalid cid");
	em.getTransaction().commit();
	em.close();
}
private static void searchCustomersByAddress(String address) {
	EntityManager em=emf.createEntityManager();
	String jpql="select c from Customer c where c.address= :addr"; //query params :paramname
	Query q=em.createQuery(jpql);
	q.setParameter("addr", address);
	 List<Customer> clist=q.getResultList();
	  clist.forEach(c->System.out.println(c.getCustId()+"  "+c.getCustomerName()+" "+c.getAddress()+" "+c.getEmail()));
	
}
private static void allCustomers() {
	EntityManager em=emf.createEntityManager();
	String jpql="select c from Customer c"; //java persistence query language
	Query q=em.createQuery(jpql);
   List<Customer> clist=q.getResultList();
   clist.forEach(c->System.out.println(c.getCustId()+"  "+c.getCustomerName()+" "+c.getAddress()+" "+c.getEmail()));
}
static void searchByCustomerId(int custId) {
	EntityManager em=emf.createEntityManager();
	Customer c=  em.find(Customer.class, custId);//search only by primary key
	if(c!=null) {
		System.out.println("Id : "+c.getCustId());
		System.out.println("Name : "+c.getCustomerName());
		System.out.println("Address : "+c.getAddress());
		System.out.println("Email : "+c.getEmail());
	}
	else
		System.out.println("Record not exists ....");
	em.close();
}

static void addNewCustomer() {
	Customer c=new Customer(); //new state
	c.setCustId(106);
	c.setCustomerName("Chathur");
	c.setAddress("Bangalore");
	c.setEmail("chathur@abcd.com");
	
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
	em.persist(c); //saving customer obj (managed state) sync with the DB
	c.setAddress("Bengaluru");
	em.getTransaction().commit();
	System.out.println("Done ....");
	em.close();
	c.setAddress("xyx"); //detached state ...
}
}
