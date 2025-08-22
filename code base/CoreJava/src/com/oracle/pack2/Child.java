package com.oracle.pack2;

import com.oracle.pack1.Parent;

public class Child extends Parent {
public static void main(String[] args) {
	Child c=new Child();
	System.out.println(c.x);
	Parent p=new Parent();
//	System.out.println(p.x); //ERROR !!!!!
}
void hello() {
	System.out.println(x);
}
}
