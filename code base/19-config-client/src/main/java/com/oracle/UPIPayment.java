package com.oracle;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class UPIPayment implements PaymentService {
	public String payment() {
		return "UPI Payment";
	}

}
