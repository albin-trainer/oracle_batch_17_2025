package com.oracle.wrapper;
public class GenericEx {
	//Generics - parameterized type
	//provides typesafety
	//no need typecast while reading
	//avoids classcastexception @runtime
public static void main(String[] args) {
	Data<String> d1=new Data<String>();
	d1.setVal("Bangalore");
	
	Data<Integer> d2=new Data<Integer>();
	d2.setVal(99);
	//no need of typecasting
	String city=d1.getVal();
	int x=d2.getVal();
	System.out.println(city);
	System.out.println(x);
}
}
class Data <E>{
	private E val;
	public E getVal() {
		return val;
	}
	public void setVal(E val) {
		this.val = val;
	}
}
