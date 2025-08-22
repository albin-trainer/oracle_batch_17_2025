package com.oracle.wrapper;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ArrayListEx {
public static void main(String[] args) {
	//arrays are fixed size
	//ArrayList is a dynamic Array
	//keep on add more elements @ runtime
	ArrayList<String> cities=new ArrayList<>();
	cities.add("Bangalore");
	cities.add("Mysore");
	cities.add("Mumbai");
	for(String s:cities) {
		System.out.println(s);
	}
	ArrayList<Integer> nums=new ArrayList<>();
	nums.add(11); nums.add(12);nums.add(55);
	System.out.println("---------------");
	for(int x:nums) {
		System.out.println(x);
	}
	LocalDateTime time=LocalDateTime.now();
}
}
