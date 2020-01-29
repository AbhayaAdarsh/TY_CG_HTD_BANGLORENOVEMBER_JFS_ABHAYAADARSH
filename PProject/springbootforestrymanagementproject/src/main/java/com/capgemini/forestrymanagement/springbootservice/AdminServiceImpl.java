package com.capgemini.forestrymanagement.springbootservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.forestrymanagement.springbootdao.AdminDao;
import com.capgemini.forestrymanagement.springbootdto.AdminBean;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao dao;

	@Override
	public AdminBean login(int adminId, String password) {
		return dao.login(adminId, password);
	}

	@Override
	public boolean register(AdminBean bean) {
		return dao.register(bean);
	}
	
	
}
