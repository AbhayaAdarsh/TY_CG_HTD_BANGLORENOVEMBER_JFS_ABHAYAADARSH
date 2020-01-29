package com.capgemini.forestrymanagement.collectionservice;

import com.capgemini.forestrymanagement.collectionbean.SchedularBean;
import com.capgemini.forestrymanagement.collectiondao.SchedularDao;
import com.capgemini.forestrymanagement.collectionmanager.SchedularDaoManager;

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
