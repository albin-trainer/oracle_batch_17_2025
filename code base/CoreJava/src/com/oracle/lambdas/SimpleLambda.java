package com.oracle.lambdas;

public class SimpleLambda {
	public static void main(String[] args) {
		postWishes(new BirthdayGreetings(), "Rajesh");
		Greeting g=(String name)-> {
			return "Hi "+name+" happy Birthday !!!!!";
		};
		postWishes(g, "Subhashini");
		postWishes(n->"hello "+n+" have a wonderful evening !!!!", "Batch 17");
	}
	
	static void postWishes(Greeting g,String name) {
		 System.out.println(g.wish(name));
	}
}

class BirthdayGreetings implements Greeting{
	public String wish(String name) {
		return "Hi "+name+" happy Birthday !!!!!";
	}
}
interface Greeting{
	  String wish(String name);
}