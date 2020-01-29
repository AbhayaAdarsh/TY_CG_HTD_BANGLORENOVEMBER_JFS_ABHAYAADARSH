package com.capgemini.forestrymanagement.collectionbean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdminBean implements Serializable {
	private int adminId;
	private String adminName;
	private AdminBean adminBean;

	public AdminBean getAdminBean() {
		return adminBean;
	}

	public void setAdminBean(AdminBean adminBean) {
		this.adminBean = adminBean;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public void add(AdminBean adminBean) {
		this.adminBean = adminBean;
	}

	@Override
	public String toString() {
		return "AdminBean [adminId=" + adminId + ", adminName=" + adminName + ", adminBean=" + adminBean + "]";
	}

	public void remove(AdminBean adminBean2) {
	}

}
