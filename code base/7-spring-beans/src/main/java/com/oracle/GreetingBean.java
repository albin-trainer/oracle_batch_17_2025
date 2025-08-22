package com.oracle;
//spring creates this obj
public class GreetingBean {
 private String msg;
 public GreetingBean() {
	System.out.println("constructor");
}
 public GreetingBean(String msg) {
	super();
	this.msg = msg;
}

//spring calls setter
// public void setMsg(String msg) {
//	 System.out.println("setter...");
//	 this.msg=msg;
// }
// 
 public String sayHello(String name) {
	 return "Hi "+name+" "+msg;
 }
}
