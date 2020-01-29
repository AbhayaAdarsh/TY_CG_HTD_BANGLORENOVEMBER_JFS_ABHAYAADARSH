package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao;

import java.util.List;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.ClientBean;

public interface ClientDao {
	boolean addClient(ClientBean bean);

	boolean deleteClient(int custid);

	boolean updateClient(ClientBean bean);

	ClientBean getClient(int clientid);

	List<ClientBean> getAllClient();

}
