package com.example.eia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;

@SpringBootApplication
public class SampleEiaApplication implements CommandLineRunner {

	
	
	@Autowired
	@Qualifier("inputChannel")
	private MessageChannel inputChannel;
	
	public static void main(String[] args) {
		SpringApplication.run(SampleEiaApplication.class, args);
	}
	
	@Override
	public void run(String... strings) throws Exception{
		inputChannel.send(MessageBuilder.withPayload("Hello").build());
	}
	
	
}
@Configuration
class DemoIntegration {
	
	@Bean
	public MessageChannel inputChannel() {
		
		return new DirectChannel();
		
	}
	@Bean
	public MessageChannel outputChannel() {
		
		return new DirectChannel();
		
	}
	
	
}