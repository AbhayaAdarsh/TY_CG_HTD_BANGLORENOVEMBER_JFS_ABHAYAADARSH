package com.capgemini.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.dao.UseDao;
import com.capgemini.jdbc.factory.UserFactory;

public class UserServicesImpl implements UserServices
	{

		UseDao dao=UserFactory.instanceOfUserDaoImpl();
		
		@Override
		public List<UserBean> getAllUsers() 
		{
			return dao.getAllUsers();
		}

		@Override
		public UserBean userLogin(String username, String password)
		{
			return null;
		}

		@Override
		public boolean updateUser(int userId, String password, String email) 
		{
			return false;
		}

		@Override
		public boolean insertUser(UserBean user)
		{
			return dao.insertUser(user);
		}

		@Override
		public boolean deleteUser(int userId, String password)
		{
			return false;
		}
}
