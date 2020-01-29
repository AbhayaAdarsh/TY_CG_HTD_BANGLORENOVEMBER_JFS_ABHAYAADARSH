package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice;

import java.util.List;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.ClientBean;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao.ClientDao;
import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcmanager.ClientDaoManager;

public class ClientServiceImpl implements ClientServices {
	ClientDao dao = ClientDaoManager.instanceOfClientDaoImpl();

	@Override
	public boolean addClient(ClientBean bean) {
		return dao.addClient(bean);
	}

	@Override
	public boolean deleteClient(int custid) {
		return dao.deleteClient(custid);
	}

	@Override
	public boolean updateClient(ClientBean bean) {
		return dao.updateClient(bean);
	}

	@Override
	public ClientBean getClient(int clientid) {
		return dao.getClient(clientid);
	}

	@Override
	public List<ClientBean> getAllClient() {
		return dao.getAllClient();
	}
}