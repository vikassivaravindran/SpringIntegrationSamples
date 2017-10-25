package com.example.integration.demo;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class InputServiceHandler{
	

	private static final Logger logger=LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	
   
	public String toJson(String customerJson) throws MessagingException {
		
		if(customerJson != null && logger.isInfoEnabled()){
			logger.info("order json  {}",customerJson);
		}
		return customerJson;
		
	}
	


	public OrderItems fromJson(OrderItems order) throws MessagingException {
		
		if(order != null && logger.isInfoEnabled()){
			logger.info("order object {}",order.toString());
		}
		return order;
		
		
	}

}
