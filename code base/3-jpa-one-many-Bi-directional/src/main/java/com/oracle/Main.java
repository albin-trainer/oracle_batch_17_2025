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
//addEmployee(991);
//getDepartment(999);

//jpql1();
//jpql2();
jpqlJoins();
}
private static void jpqlJoins() {
	String jpql="select e, d from Employee e join e.dept d";
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery(jpql);
	List list=q.getResultList();
	for(Object row:list) {
		Object []r=(Object[])row;
		Employee e=(Employee)r[0];
		Department d=(Department)r[1];
		System.out.println(e.getEmpName()+" works in "+d.getDeptName()+" departments");
	}
}
private static void jpql1() {
	String jpql="select e.empName from Employee e";
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery(jpql);
	List<String> list=q.getResultList();
	list.forEach(s-> System.out.println(s));
}
private static void jpql2() {
	String jpql="select e.empName,e.salary from Employee e";
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery(jpql);
	List list=q.getResultList();
	for(Object row:list) {
		Object []r=(Object[])row;
		System.out.println(r[0]+"  "+r[1]);
	}
}
static void addEmployee(int deptId) {
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
	Department d=em.find(Department.class, deptId);
	if(d!=null) {
		Employee e=new Employee();
		e.setEmpName("A");
		e.setSalary(50000);
		e.setDept(d);
		em.persist(e);
	}
	em.getTransaction().commit();
	System.out.println("Emp added");
	em.close();
}
static void addNewDepartment() {
	Department d=new Department();
	d.setDeptId(992);
	d.setDeptName("HR");
	EntityManager em=emf.createEntityManager();
	em.getTransaction().begin();
	em.persist(d);
	em.getTransaction().commit();
	System.out.println("Added ");
	em.close();
}
}
