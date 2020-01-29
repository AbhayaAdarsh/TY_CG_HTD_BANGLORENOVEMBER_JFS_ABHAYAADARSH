package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.SchedularBean;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao.SchedularDao;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcmanager.SchedularDaoManager;

public class SchedularServiceImpl implements SchedularServices {
	SchedularDao dao = SchedularDaoManager.instanceOfSchedularDaoImpl();

	@Override
	public boolean addSchedular(SchedularBean bean) {
		return dao.addSchedular(bean);
	}

	@Override
	public boolean deleteSchedular(int contractid) {
		return dao.deleteSchedular(contractid);
	}

	@Override
	public boolean modifySchedular(SchedularBean bean) {
		return dao.modifySchedular(bean);
	}
}
