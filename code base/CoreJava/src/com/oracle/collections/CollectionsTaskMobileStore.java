package com.oracle.collections;

import java.util.HashMap;
import java.util.List;

public class CollectionsTaskMobileStore {
 HashMap<String, List<String>> mobiles=new HashMap<>();
 void addMobile(String brand,String model) {
	 
 }
 
 List<String> getModels(String brand){
	 return null;
 }
 
 public static void main(String[] args) {
	 CollectionsTaskMobileStore store=new CollectionsTaskMobileStore();
	 
	 store.addMobile("Samsung", "S25"); //add S25 in a new ArrayList
	 store.addMobile("Samsung", "S30"); //add in the existing list
	 store.addMobile("Samsung", "A15");	//add in the existing list	
	 store.addMobile("OnePlus", "13S");//add in a new ArrayList
	 store.addMobile("OnePlus", "15S");//add in the exising list
			 
}
	
}
