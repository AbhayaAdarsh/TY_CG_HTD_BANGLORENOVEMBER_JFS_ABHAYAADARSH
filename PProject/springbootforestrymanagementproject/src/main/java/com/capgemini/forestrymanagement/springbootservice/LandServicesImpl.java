package com.capgemini.forestrymanagement.springbootservice;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.forestrymanagement.springbootdao.LandDao;
import com.capgemini.forestrymanagement.springbootdto.LandBean;
import com.capgemini.forestrymanagement.springbootexception.LandException;

@Service
public class LandServicesImpl implements LandServices {
	@Autowired
	LandDao dao;

	@Override
	public boolean addLand(LandBean bean) {
		return dao.addLand(bean);
	}
	
	@Override
	public boolean deleteLand(int landno) throws LandException {
		return dao.deleteLand(landno);
	}

	@Override
	public List<LandBean> getAllLand() {
		return dao.getAllLand();
	}

	@Override
	public boolean updateLand(LandBean bean) {
		return false;
	}

	@Override
	public List<LandBean> getLandBean(int landno) {
		return null;
	}

	@Override
	public boolean registerLand(LandBean bean) {
		// TODO Auto-generated method stub
		return false;
	}
}