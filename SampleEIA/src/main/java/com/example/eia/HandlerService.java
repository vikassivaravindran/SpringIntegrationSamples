package com.example.eia;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service; 

@Service
public class HandlerService {
	
	
	@ServiceActivator(inputChannel="inputChannel",outputChannel="outputChannel")
	public Message handleMessage(Message message){
		
		System.out.println("Message in input Channel:"+message);
		return message;
		}
	
	@ServiceActivator(inputChannel="outputChannel",requiresReply="false")
public Message handleOutputMessage(Message message){
	
	System.out.println("Message Received in output channel:"+message);
	return message;
	}
}