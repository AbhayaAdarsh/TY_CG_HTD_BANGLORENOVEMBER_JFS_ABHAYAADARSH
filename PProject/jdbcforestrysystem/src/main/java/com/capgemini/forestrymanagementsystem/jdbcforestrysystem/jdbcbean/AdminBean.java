package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdminBean implements Serializable{
	private int adminId;
	private int clientId;
	private int schedularId;
	private String adminName;
	private String clientName;
	private String schedularName;
	private String adminPassword;
	private String clientPassword;
	private String schedularPassword;
	private AdminBean adminBean;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public int getSchedularId() {
		return schedularId;
	}
	public void setSchedularId(int schedularId) {
		this.schedularId = schedularId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getSchedularName() {
		return schedularName;
	}
	public void setSchedularName(String schedularName) {
		this.schedularName = schedularName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getClientPassword() {
		return clientPassword;
	}
	public void setClientPassword(String clientPassword) {
		this.clientPassword = clientPassword;
	}
	public String getSchedularPassword() {
		return schedularPassword;
	}
	public void setSchedularPassword(String schedularPassword) {
		this.schedularPassword = schedularPassword;
	}
	public AdminBean getAdminBean() {
		return adminBean;
	}
	public void setAdminBean(AdminBean adminBean) {
		this.adminBean = adminBean;
	}
	
	
	public void remove(AdminBean adminBean2) {
		
	}
	@Override
	public String toString() {
		return "AdminBean [adminId=" + adminId + ", clientId=" + clientId + ", schedularId=" + schedularId
				+ ", adminName=" + adminName + ", clientName=" + clientName + ", schedularName=" + schedularName
				+ ", adminPassword=" + adminPassword + ", clientPassword=" + clientPassword + ", schedularPassword="
				+ schedularPassword + ", adminBean=" + adminBean + "]";
	}
	
	
}
