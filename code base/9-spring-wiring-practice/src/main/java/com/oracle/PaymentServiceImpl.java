package com.oracle;

public class PaymentServiceImpl  implements PaymentService{

	public void processPayment(double amount) {
		System.out.println("Payment of "+amount+" is proccessed");
	}

}
