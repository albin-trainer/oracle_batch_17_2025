package com.oracle.collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class MapDemo {
public static void main(String[] args) {
	HashMap<String, String> map1=new HashMap<>();
	map1.put("BLR", "Bangalore");
	map1.put("MYS", "Mysore");
	map1.put("DEL", "New Delhi");
	map1.put("UK", "Uttarakhand");
	map1.put("Mum", "Mumbai");
	System.out.println(map1);
	String city= map1.get("Mum");
	System.out.println(city);
	map1.put("BLR", "Bengaluru"); //it overwrites/update
	System.out.println(map1);
	
	//iterating a map
	//Map is not iterateable
	Set<String> set=  map1.keySet(); //returns the keys 
	for(String s:set) {
		System.out.println(s);
	}
	System.out.println("--------");
	Collection<String> values=  map1.values();
	for(String v:values) {
		System.out.println(v);
	}
	System.out.println("-------------------");
	//Entry --> represent a pair of key-value
	Set<Entry<String, String>> rows=    map1.entrySet();
	for(Entry<String,String> row:rows) {
		String k=row.getKey();
		String v=row.getValue();
		System.out.println(k+"  "+v);
	}
}
}
