package com.oracle.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.oracle.CardPaymentServiceImpl;
import com.oracle.OrderServiceImpl;
import com.oracle.UPIPaymentServiceImpl;
@Configuration
public class SpringConfig {
	@Bean("order")//replaces <bean> and @Component
	public OrderServiceImpl getOrderService() {
		return new OrderServiceImpl();
	}
	@Bean
	@Primary
	public CardPaymentServiceImpl getCardPayment() {
		return new CardPaymentServiceImpl();
	}
	@Bean
	public UPIPaymentServiceImpl getUPI() {
		return new UPIPaymentServiceImpl();
	}
}
