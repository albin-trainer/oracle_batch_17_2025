package com.oracle;
public class UPIPaymentServiceImpl implements PaymentService {
	public void processPayment(double amount) {
		System.out.println("UPI Payment of "+amount+" is proccessed");
	}

}
