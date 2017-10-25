/**
 * 
 */
package com.example.integration.demo;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;

/**
 * @author sudhindra.desigan
 *
 */
public class Subscriber2 implements MessageHandler {

	/* (non-Javadoc)
	 * @see org.springframework.messaging.MessageHandler#handleMessage(org.springframework.messaging.Message)
	 */
	@Override
	public void handleMessage(Message<?> arg0) throws MessagingException {
System.out.println("Subscriber2"+arg0);
	}

}
