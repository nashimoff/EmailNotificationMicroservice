package com.appsdeveloperblog.ws.emailnotification.handler;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ProductCreatedEventHandler {
	
	@KafkaListener
	public void handle() {
		
	}

}
