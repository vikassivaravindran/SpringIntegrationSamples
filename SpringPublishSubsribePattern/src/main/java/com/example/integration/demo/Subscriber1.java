package com.example.integration.demo;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;

public class Subscriber1 implements MessageHandler {

@Override
public void handleMessage(Message<?> arg0) throws MessagingException {
			System.out.println("Subscriber1"+arg0);
	}

}
