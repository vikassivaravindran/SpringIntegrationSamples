package com.example.integration.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;


@SpringBootApplication
public class SpringTranformerPatternApplication implements CommandLineRunner {
	
	@Autowired
	private MessageChannel inputChannel;
	
	@Autowired
	@Qualifier("outputChannel")
	private MessageChannel outputChannel;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringTranformerPatternApplication.class, args);
	}



@Override
public void run(String... args) throws Exception {
	
	OrderItems order=new OrderItems(1L,"TV","Chennai",10L);
	inputChannel.send(MessageBuilder.withPayload(order).build());
	
	
}
}
