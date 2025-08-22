package com.oracle;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl  implements OrderService{
   private HashMap<String, Float> products=new HashMap<>();
   {
	   products.put("TShirt", 1000.0f);
	   products.put("Mobile", 15000f);
	   products.put("Shoes", 2500.99f);
	   products.put("Laptop", 50000f);
   }
   @Autowired
    private PaymentService paymentService;
    
//    @Autowired
//	public void setPaymentService(PaymentService paymentService) {
//    	System.out.println("setter ....");
//		this.paymentService = paymentService;
//	}
	@Override 
	//client will call this fn
	public void placeOrder(String product, int quantity) {
		//calculate the price & invoke the payment service
		if(products.containsKey(product))
			paymentService.processPayment(products.get(product)*quantity);
		else
			System.out.println("Not a valid product");
	}

}
