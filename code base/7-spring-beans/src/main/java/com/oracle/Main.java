package com.oracle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Spring container initialized....");
		GreetingBean bean1=(GreetingBean) ctx.getBean("g1");
		GreetingBean bean2=(GreetingBean) ctx.getBean("g1");
		System.out.println(bean1==bean2);
		System.out.println(bean1.sayHello("Albin"));
	}
}
