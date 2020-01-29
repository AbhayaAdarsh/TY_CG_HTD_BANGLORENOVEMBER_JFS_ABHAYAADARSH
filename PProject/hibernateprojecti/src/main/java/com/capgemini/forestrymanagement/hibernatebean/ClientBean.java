package com.capgemini.forestrymanagement.hibernatebean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class ClientBean {
	@Id
	@Column
	private int clientid;
	@Column
	private String clientName;
	@Column
	private String clientPassword;
	@Column
	private String streetAddress1;
	@Column
	private String streetAddress2;
	@Column
	private String town;
	@Column
	private int postalCode;
	@Column
	private String email;
	@Column
	private String telephoneNum;

	public int getClientId() {
		return 0;
	}

	public void setClientId(int clientid2) {
	}

	public String getClientName() {
		return null;
	}

	public void setClientName(String clientName2) {
	}

	public String getStreetAddress1() {
		return null;
	}

	public void setStreetAddress1(String streetAddress12) {
	}

	public String getStreetAddress2() {
		return null;
	}

	public void setStreetAddress2(String streetAddress12) {
	}

	public String gettown() {
		return null;
	}

	public void settown(String streetAddress12) {
	}

	public String getpostalCode() {
		return null;
	}

	public void setpostalCode(int postalCode2) {
	}

	public int getPostalCode() {
		return 0;
	}

	public void setPostalCode(int postalCode2) {
	}

	public String getemail() {
		return null;
	}

	public void setemail(String email2) {
	}

	public String gettelephoneNum() {
		return null;
	}

	public void settelephoneNum(String telephoneNum2) {
	}

}
