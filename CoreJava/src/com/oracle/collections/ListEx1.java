package com.oracle.collections;

import java.util.ArrayList;
import java.util.Vector;

public class ListEx1 {
public static void main(String[] args) {
	//it creates a array with the size of 10
	Vector<String> v1=new Vector<>();
	System.out.println(v1.capacity());
	Vector<String> v2=new Vector<>(3); //creates a array of size 3
	System.out.println("capacity : "+v2.capacity());
	v2.add("Krish");
	v2.add("Tejas");
	System.out.println("no of elements "+v2.size());
	v2.add("Ayushi");
	v2.add("Amit"); //creates another array & copies the content from old to new array
	System.out.println(v2);
	System.out.println(v2.capacity());
	
	ArrayList<String> list=new ArrayList<>();
	list.add("Bangalore");
	list.add("Mumbai");
	System.out.println(list);
	list.add(0, "Delhi");
	System.out.println(list);
	String c=list.get(2);
	System.out.println(c);
	System.out.println(list.contains("Mumbai"));
	list.set(1, "Bengaluru");//modify the index val
	System.out.println(list);
//	int oldCapacity=10;
//	int newCapacity= oldCapacity >> 1 ;
//	System.out.println(newCapacity+oldCapacity);
}
}
