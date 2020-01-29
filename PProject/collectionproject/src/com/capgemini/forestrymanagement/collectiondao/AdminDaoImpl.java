package com.capgemini.forestrymanagement.collectiondao;

import java.util.ArrayList;
import java.util.List;
import com.capgemini.forestrymanagement.collectionbean.AdminBean;

public class AdminDaoImpl implements AdminDao {

	private List<AdminBean> adminBean = new ArrayList<AdminBean>();

	@Override
	public boolean addMain(AdminBean adminbean) {
		for (AdminBean adminBean2 : adminBean) {
			if (adminBean2.getAdminId() == adminbean.getAdminId()) {
				return false;
			}
		}
		adminbean.add(adminbean);
		return true;
	}

	@Override
	public boolean removeMain(String userName) {
		AdminBean adminbean = null;
		for (AdminBean adminBean2 : adminBean) {
			if (adminBean2.getAdminName() == adminbean.getAdminName()) {
				adminbean = adminBean2;
			}

		}
		if (adminBean != null) {
			adminBean.remove(adminbean);
			return true;
		}

		return false;
	}

	@Override
	public List<AdminBean> showMain() {

		return adminBean;
	}

	@Override
	public AdminBean adminLogin(int adminId, String adminName, String password) {
		
		return null;
	}

}
