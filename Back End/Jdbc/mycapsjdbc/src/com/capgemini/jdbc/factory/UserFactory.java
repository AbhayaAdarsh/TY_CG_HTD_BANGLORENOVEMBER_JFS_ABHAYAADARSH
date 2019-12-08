package com.capgemini.jdbc.factory;

import com.capgemini.jdbc.dao.UseDao;
import com.capgemini.jdbc.dao.UserDaoImpl;
import com.capgemini.jdbc.services.UserServices;
import com.capgemini.jdbc.services.UserServicesImpl;

public class UserFactory 
{
	
	
	public static UseDao instanceOfUserDaoImpl()
	{
		UseDao dao= new UserDaoImpl();
		return dao;
	}

	public static UserServices instanceOfUserServices()
	{
		UserServices services=new UserServicesImpl();
		return services;		
	}
}
