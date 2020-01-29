package com.capgemini.forestrymanagement.springbootservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestrymanagement.springbootdao.ClientDao;
import com.capgemini.forestrymanagement.springbootdto.ClientBean;
import com.capgemini.forestrymanagement.springbootexception.ClientException;

@Service
public class ClientServiceImpl implements ClientServices {
	@Autowired
	private ClientDao dao;

	@Override
	public boolean addClient(ClientBean bean) {
		return dao.addClient(bean);
	}

	@Override
	public boolean updateClient(int clientid, ClientBean bean) {
		return dao.updateClient(clientid, bean);
	}

	@Override
	public boolean deleteClient(int clientid) throws ClientException {
		return dao.deleteClient(clientid);
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
