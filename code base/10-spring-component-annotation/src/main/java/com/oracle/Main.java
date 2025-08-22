package com.oracle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("beans.xml");
	System.out.println("Spring ioc container initialized .....");
	//invoke orderservice
	OrderService service=(OrderService) ctx.getBean("orderServiceImpl");
	service.placeOrder("Mobile", 2);
	}
}
