package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao;

import java.util.List;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.ContractorBean;

public interface ContractorDao {

	boolean addContractor(ContractorBean bean);

	boolean deleteContractor(int contractorid);

	boolean modifyContractor(ContractorBean bean);

	public List<ContractorBean> getAllContractor();

	public ContractorBean getContractor(int contractorid);
}
