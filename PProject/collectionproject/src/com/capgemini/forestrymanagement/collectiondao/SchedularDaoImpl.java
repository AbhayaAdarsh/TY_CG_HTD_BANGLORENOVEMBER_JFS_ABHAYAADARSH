package com.capgemini.forestrymanagement.collectiondao;

import java.util.ArrayList;
import java.util.List;
import com.capgemini.forestrymanagement.collectionbean.SchedularBean;

public class SchedularDaoImpl implements SchedularDao {
	private List<SchedularBean> schedularBean = new ArrayList<SchedularBean>();

	@Override
	public boolean addSchedular(SchedularBean bean) {
		for (SchedularBean schedularBean : schedularBean) {
			if (schedularBean.getSchedulerId() == bean.getSchedulerId()) {
				return false;
			}
		}
		SchedularBean.add(bean);
		return true;
	}

	@Override
	public boolean modifySchedular(SchedularBean bean) {
		for (SchedularBean schedularBean : schedularBean) {
			if (schedularBean.getSchedulerId() == bean.getSchedulerId()) {
				schedularBean.contains(schedularBean);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteSchedular(int Schedularid) {
		for (SchedularBean schedularBean : schedularBean) {
			if (schedularBean.getSchedulerId() == schedularBean.getSchedulerId()) {
				schedularBean.contains(schedularBean);
				return true;
			}
		}
		return false;
	}

}
