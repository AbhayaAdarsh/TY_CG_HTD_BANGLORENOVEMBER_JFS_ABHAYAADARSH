package com.capgemini.retailermaintenancesystemapplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class OrmCofig {

	@Bean
	public LocalEntityManagerFactoryBean getLocalEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean bean=new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("retailer-unit");
		return bean;
	}	
}
