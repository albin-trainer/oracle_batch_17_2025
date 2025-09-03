package com.oracle.api;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	@Autowired
	private KafkaTemplate<String, String> template;
	public void sendMsg(Message msg) {
		System.out.println("Sending msg");
		try {
	    		template.send("myMsg", msg.getUsr(), msg.getMsg());
		    System.out.println("Sent to Kafka.. ");
		} catch (Exception e) {
		    System.out.println("send failed.. " + e.getClass().getSimpleName() + " - " + e.getMessage());
		}

		
	}
}
