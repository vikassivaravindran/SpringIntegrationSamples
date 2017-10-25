package com.example.integration.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

@SpringBootApplication
public class SpringPublishSubsribePatternApplication implements CommandLineRunner{

	@Autowired
	@Qualifier("publisherChannel")
	private MessageChannel inputChannel;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringPublishSubsribePatternApplication.class, args);
	}
	@Override
	public void run(String... strings) throws Exception{
		inputChannel.send(MessageBuilder.withPayload("Hello").build());
	}
}

