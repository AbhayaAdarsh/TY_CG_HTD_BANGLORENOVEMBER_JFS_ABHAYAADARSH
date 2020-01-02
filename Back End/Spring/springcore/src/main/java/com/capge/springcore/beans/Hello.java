package com.capge.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean,DisposableBean{
	public Hello() {
		System.out.println("Object Created.");
	}

public Hello(String message, int count) {
		super();
		this.message = message;
		this.count = count;
	}
private String message;
private int count;




public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}

@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("afterPropertSet");
}
@PostConstruct
public void init() {
	System.out.println("init method.");
}
@PreDestroy //@Override
public void destroy() {
	System.out.println("destroy method.");
}


}
