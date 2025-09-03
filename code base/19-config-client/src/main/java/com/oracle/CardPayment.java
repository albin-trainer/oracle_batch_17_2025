package com.oracle;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("prod")
public class CardPayment implements PaymentService {
	public String payment() {
		return "Card payment Service";
	}
}
