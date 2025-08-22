package com.oracle;

public class ArrayEx1 {
public static void main(String[] args) {
	//int nums[5]; //ERROR in java
	//in java array is object
	int nums[] = new int[5];
	
	nums[0]=10;
	nums[1]=20;
	System.out.println("***Traditional loop***");
	for(int i=0;i<nums.length;i++) {
		System.out.println(nums[i]);
	}
	System.out.println("****for each loop***");
	for(int val:nums) {
		System.out.println(val);
	}
	//Another way of making array
	int arr[]= {1,2,3,4,5,6};
	String fruits[]= {"Apple","Mango","Banana","Water melon"};
	//iterate it ...
}
}
