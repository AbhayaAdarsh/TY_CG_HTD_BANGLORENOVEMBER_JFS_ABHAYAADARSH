package com.capge.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capge.springcore.beans.Hello;

public class LifeCycleTest {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	
	Hello hello=context.getBean(Hello.class);
	
	System.out.println(hello.getMessage());
	System.out.println(hello.getCount());
	
	context.close();
}
}
