package com.oracle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.oracle.config.SpringConfig;
public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx= 
new AnnotationConfigApplicationContext(SpringConfig.class);
	System.out.println("Spring ioc container initialized .....");
	//invoke orderservice
	OrderService service=(OrderService) ctx.getBean("order");
	service.placeOrder("Mobile", 2);
	}
}
