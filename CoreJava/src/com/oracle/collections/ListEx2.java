package com.oracle.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListEx2 {
public static void main(String[] args) {
	ArrayList<String> list1=new ArrayList<>();
	
	LinkedList<String> list2=new LinkedList<>();
	
	long t1=System.currentTimeMillis();
	for(int i=1;i<=100000;i++)
		list1.add(0,"Hello");
	long t2=System.currentTimeMillis();
	System.out.println("Array list took "+(t2-t1));
	
	t1=System.currentTimeMillis();
	for(int i=1;i<=100000;i++)
		list2.add(0,"Hello");
	t2=System.currentTimeMillis();
	System.out.println("Linked list took "+(t2-t1));
}
}
