package com.oracle.collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class SetDemo {
public static void main(String[] args) {
	/*
	 * HashSet -- No duplicates
	 *          No guaranty of order of the elements
	 */
	HashSet<String> set1=new HashSet<>();
	set1.add("Orange");
	set1.add("Apple");
	set1.add("Banana");
	set1.add("Grapes");
	set1.add("Orange");
	set1.add("Papaya");
	System.out.println(set1);
	/*
	 * TreeSet - No duplicates
	 *         -uses BST
	 *         -in default sorted while traversing
	 */
	TreeSet<String> set2=new TreeSet<>();
	set2.add("Orange");
	set2.add("Apple");
	set2.add("Banana");
	set2.add("Grapes");
	set2.add("Orange");
	set2.add("Papaya");
	System.out.println(set2);
	/*
	 * LinkedHashSet - no duplicates
	 *               -insertion order ....
	 */
	LinkedHashSet<String> set3=new LinkedHashSet<>();
	set3.add("Orange");
	set3.add("Apple");
	set3.add("Banana");
	set3.add("Grapes");
	set3.add("Orange");
	set3.add("Papaya");
	System.out.println(set3);
}
}
