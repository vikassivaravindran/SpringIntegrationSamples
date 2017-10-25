package com.example.integration.demo;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
	import org.springframework.integration.channel.DirectChannel;
	import org.springframework.integration.channel.PublishSubscribeChannel;
	import org.springframework.integration.dsl.IntegrationFlow;
	import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;


@Configuration
public class SampleFlow {
	
	@Bean
	public MessageChannel publisherChannel(){
	PublishSubscribeChannel channel=new PublishSubscribeChannel();
	channel.subscribe(new Subscriber1());
	channel.subscribe(new Subscriber2());
	return channel;
	}
	
	
	@Bean
	public IntegrationFlow simpleInputFlow() {
		return IntegrationFlows.from(publisherChannel()).log().get();
	}

}
