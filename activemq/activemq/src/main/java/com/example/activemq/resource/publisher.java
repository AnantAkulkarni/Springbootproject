package com.example.activemq.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.activemq.model.User;


@RestController
@RequestMapping("/rest")
public class publisher {
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	@GetMapping("/message/{msg}")
	String publishmsg(@PathVariable String msg)
	{
		//User user=new User(1,msg,100L);
		jmsTemplate.convertAndSend("topic", msg);
		return "published message successfuly";
	}

}
