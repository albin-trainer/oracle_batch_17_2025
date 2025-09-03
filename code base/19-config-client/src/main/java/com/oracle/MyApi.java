package com.oracle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/client")
public class MyApi {
	@Value("${configproperty}")
private String msg;
	@Autowired
  private PaymentService payment;	
	@GetMapping
	public String test() {
		return msg;
	}
	@GetMapping("/pay")
	public String pay() {
		return payment.payment();
	}
}
