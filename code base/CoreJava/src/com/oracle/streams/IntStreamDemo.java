package com.oracle.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamDemo {
public static void main(String[] args) {
	int nums[]= {1,2,3,4,5,6,7,8,9,22,34,56,33,45,67,78};
	IntStream stream= Arrays.stream(nums);
	//find the sum of even nos
	int result= stream.filter(n->n%2==0).sum();
	System.out.println(result);
}
}
