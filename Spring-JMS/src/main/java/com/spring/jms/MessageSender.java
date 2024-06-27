package com.spring.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.Session;

@Component
public class MessageSender {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Value("${springjms.myQueue}")
	private String queue;

	public void send(String message) {
		MessageCreator mc = s -> s.createTextMessage("Helloo Spring JMS");
		jmsTemplate.convertAndSend(queue, message);
	}

}
