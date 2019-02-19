package com.example.activemq.resource;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class receiver {

	@JmsListener(destination = "topic")
	public void receivemsg(String msg)
	{
		System.out.println("received msg "+msg);
	}
	
}
