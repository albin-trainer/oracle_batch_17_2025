package com.oracle.oop.polymorphism;
public class StaticDemo1 {
	int x=10; //instance variable ....
	static {
		System.out.println("I m static block1");
	}
public static void main(String[] args) {
	System.out.println("I m main method");
	//static int a=10; //ERROR !!!
	//System.out.println(x);
	Student.course="Java"; //since it is static can access by class name
	Student s1=new Student();
	s1.id=101; s1.name="Ajay";
	Student s2=new Student();
	s2.id=102;s2.name="Chathur";
	s1.print();
	s2.print();
	s2.course="Spring";
	System.out.println(s1.course);
}
static {
	System.out.println("I m static block 2");
}
}
class Student{
	static String course;
	int id;
	String name;
	void print() {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Course : "+course);
	}
}