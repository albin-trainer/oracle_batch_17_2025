package com.oracle;
import org.springframework.stereotype.Component;
@Component
public class CardPaymentServiceImpl  implements PaymentService{
	public void processPayment(double amount) {
		System.out.println("Card Payment of "+amount+" is proccessed");
	}
}
