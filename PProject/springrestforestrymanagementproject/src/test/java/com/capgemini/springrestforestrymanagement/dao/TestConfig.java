package com.capgemini.springrestforestrymanagement.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springrestforestrymanagement.services.ContractorServices;
import com.capgemini.springrestforestrymanagement.services.ContractorServicesImpl;
import com.capgemini.springrestforestrymanagement.services.LandsServices;
import com.capgemini.springrestforestrymanagement.services.LandsServicesImpl;
import com.capgemini.springrestforestrymanagement.services.ProductServices;
import com.capgemini.springrestforestrymanagement.services.ProductServicesImpl;
import com.capgemini.springrestforestrymanagement.services.UsersServices;
import com.capgemini.springrestforestrymanagement.services.UsersServicesImpl;

@Configuration
public class TestConfig {
	@Bean
	public UsersDAO userDAO() {
		return new UsersDAOImpl();
	}
	
	@Bean 
	public ContractorDAO contractDAO() {
		return new ContractorDAOImpl();
	}
	
	@Bean
	public LandsDAO landDAO() {
		return new LandsDAOImpl();
	}
	
	@Bean
	public ProductDAO productDAO() {
		return new ProductDAOImpl();
	}
	
	@Bean
	public UsersServices adminServices() {
		return new UsersServicesImpl();
	}
	
	@Bean 
	public ContractorServices contractServices() {
		return new ContractorServicesImpl();
	}
	
	@Bean
	public LandsServices landServices() {
		return new LandsServicesImpl();
	}
	
	@Bean
	public ProductServices productServices() {
		return new ProductServicesImpl();
	}

}
