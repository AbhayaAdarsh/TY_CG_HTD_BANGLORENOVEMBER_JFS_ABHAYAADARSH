package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.LandBean;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao.LandDao;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcmanager.LandDaoManager;

public class LandServicesImpl implements LandServices {
	LandDao dao = LandDaoManager.instanceOfLandDaoImpl();

	@Override
	public boolean addLand(LandBean bean) {
		return dao.addLand(bean);
	}

	@Override
	public boolean modifyLand(LandBean bean) {
		return dao.modifyLand(bean);
	}

	@Override
	public boolean deleteLand(int landId) {
		return dao.deleteLand(landId);
	}
}
