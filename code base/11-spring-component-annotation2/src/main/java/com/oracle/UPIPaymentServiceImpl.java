package com.oracle;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class UPIPaymentServiceImpl implements PaymentService {
	public void processPayment(double amount) {
		System.out.println("UPI Payment of "+amount+" is proccessed");
	}

}
