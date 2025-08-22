package com.oracle.lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BuiltinFunctionalInterfaces {
public static void main(String[] args) {
	ArrayList<String> list1=new ArrayList<>();
	list1.add("Bangalore");
	list1.add("Mysore");
	list1.add("Chennai");
	list1.add("Mumbai");
	list1.add("Delhi");
	System.out.println("------forEach (old style)---");
	for(String s:list1) {
		System.out.println(s);
	}
	System.out.println("---forEach method----");
	Consumer<String> c= (s)->System.out.println(s);
	list1.forEach(c);
	
	System.out.println("************");
	list1.forEach((s)->System.out.println(s));
	
	Predicate<String>predicate=(s)->s.equals("Delhi");
	list1.removeIf(predicate);
	System.out.println(list1);
}
}
