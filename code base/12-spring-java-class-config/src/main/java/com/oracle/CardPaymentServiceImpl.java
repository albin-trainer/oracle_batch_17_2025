package com.oracle;
public class CardPaymentServiceImpl  implements PaymentService{
	public void processPayment(double amount) {
		System.out.println("Card Payment of "+amount+" is proccessed");
	}
}
