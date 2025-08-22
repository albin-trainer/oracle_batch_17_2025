package com.oracle;
import org.springframework.stereotype.Component;
@Component
public class PaymentServiceImpl  implements PaymentService{
	public void processPayment(double amount) {
		System.out.println("Payment of "+amount+" is proccessed");
	}
}
