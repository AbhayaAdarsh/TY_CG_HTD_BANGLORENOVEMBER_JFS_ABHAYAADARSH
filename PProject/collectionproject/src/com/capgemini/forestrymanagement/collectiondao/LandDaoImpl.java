package com.capgemini.forestrymanagement.collectiondao;

import java.util.ArrayList;
import java.util.List;
import com.capgemini.forestrymanagement.collectionbean.LandBean;

public class LandDaoImpl implements LandDao {
	private List<LandBean> landBean = new ArrayList<LandBean>();

	@Override
	public boolean addLand(LandBean bean) {
		for (LandBean landBean : landBean) {
			if (landBean.getLandNo() == bean.getLandNo()) {
				return false;
			}
		}
		LandBean.add(bean);
		return true;
	}

	@Override
	public boolean deleteLand(int landNo) {
		LandBean bean = null;
		for (LandBean landBean2 : landBean) {
			if (landBean2.getLandNo() == landNo) {
				bean = landBean2;
			}
		}
		if (bean != null) {
			LandBean.remove(bean);
			return true;
		}
		return false;
	}

	@Override
	public boolean modifyLand(LandBean bean) {
		for (LandBean landBean2 : landBean) {
			if (landBean2.getLandNo() == bean.getLandNo()) {
				LandBean.contains(landBean2);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean displayLand(int landNo) {
		return false;
	}

	@Override
	public List<LandBean> getAllInfoLand() {
		return null;
	}

}
