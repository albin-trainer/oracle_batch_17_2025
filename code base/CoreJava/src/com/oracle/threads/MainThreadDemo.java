package com.oracle.threads;
public class MainThreadDemo {
public static void main(String[] args) {
	System.out.println("Hello");
//	Object obj=10;
//	String s=(String)obj; //ClassCastException .....
//	System.out.println(s);
Thread t=	Thread.currentThread();//returns current running thread
System.out.println("Currrent running thread is "+t.getName());
System.out.println(t.getPriority());
t.setName("Oracle");  t.setPriority(10); //1 (min) to 10 (max)
System.out.println("Currrent running thread is "+t.getName());
System.out.println(t.getPriority());
	System.out.println("End ...");
	
	for(int i=1;i<=10;i++) {
		
			
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				
		
		System.out.println(i);
		
	}
}
}
