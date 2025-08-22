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
System.out.println("one to Many demo");
//addNewDepartment();
//addEmployee(999);
//getDepartment(999);
}
 static void getDepartment(int deptId) {
	 EntityManager em=emf.createEntityManager();
	 Department d=em.find(Department.class, deptId);
	 if(d!=null) {
		 System.out.println("dept name : "+d.getDeptName());
		 List<Employee> emps=d.getEmps(); //it just returns proxy
		 System.out.println("----------------------");
		 emps.forEach(e->System.out.println(e.getEmpId()+"  "+e.getEmpName()+" "+e.getSalary()));
	 }
}
static void addEmployee(int deptId) {
	EntityManager em=emf.createEntityManager();
	Department d=em.find(Department.class, deptId);
	if(d!=null) {
	em.getTransaction().begin();
	Employee e=new Employee();
	e.setEmpName("Chathur");
	e.setSalary(50000);
	List<Employee> emps=d.getEmps();
	emps.add(e);
	//em.persist(d);
	//em.persist(e);
	em.getTransaction().commit();
	System.out.println("new emp ADDED");
	}
	else
		System.out.println("Incorrect deptid");
	
}

static void addNewDepartment() {
	Department d=new Department();
	d.setDeptId(999);
	d.setDeptName("IT");
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
	em.persist(d);
	em.getTransaction().commit();
	em.close();
	System.out.println("Dept added ");
}
}
