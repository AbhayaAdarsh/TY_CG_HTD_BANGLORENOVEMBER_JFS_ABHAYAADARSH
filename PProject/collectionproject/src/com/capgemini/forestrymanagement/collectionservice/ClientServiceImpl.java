package com.capgemini.forestrymanagement.collectionservice;

import java.util.List;
import com.capgemini.forestrymanagement.collectionbean.ClientBean;
import com.capgemini.forestrymanagement.collectiondao.ClientDao;
import com.capgemini.forestrymanagement.collectionmanager.ClientDaoManager;

public class ClientServiceImpl implements ClientServices {
	ClientDao dao = ClientDaoManager.instanceOfClientDaoImpl();

	@Override
	public boolean addClient1(ClientBean bean) {
		return dao.addClient(bean);
	}

	@Override
	public boolean deleteClient(int custid) {
		return dao.deleteClient(custid);
	}

	@Override
	public boolean updateClient1(ClientBean bean) {
		return dao.updateClient(bean);
	}

	@Override
	public ClientBean getClient1(int clientid) {
		return dao.getClient(clientid);
	}

	@Override
	public List<ClientBean> getAllClient() {
		return dao.getAllClient();
	}

	@Override
	public boolean addClient(ClientBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateClient(ClientBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ClientBean getClient(int clientid) {
		// TODO Auto-generated method stub
		return null;
	}

}
