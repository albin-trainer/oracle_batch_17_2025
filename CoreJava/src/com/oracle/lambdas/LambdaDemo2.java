package com.oracle.lambdas;

public class LambdaDemo2 {
public static void main(String[] args) {
	//Create a Lambda expr for the functional interface Calculator
	//invoke calculation method and pass it as arg
	//create seperate lambda for add, diff, prod and div
	Calculator c1=(float x, float y) ->{
		return x+y;
	};
	Calculator c2=(x,y)->{return x*y;};
	
	calculation(c1, 10, 10);
	calculation((x, y)->x*y,10,10);
	
	
}
static void calculation(Calculator c, float a,float b) {
	System.out.println("Result : "+c.eval(a, b));
}
}
@FunctionalInterface
interface Calculator{
	float eval(float x,float y);
	//void f1();
}
//class Addition implements Calculator{
//	public float eval(float x, float y) {
//		return x+y;
//	}
//	
//}