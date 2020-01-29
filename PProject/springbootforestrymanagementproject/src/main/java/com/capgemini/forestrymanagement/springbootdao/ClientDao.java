package com.capgemini.forestrymanagement.springbootdao;

import java.util.List;

import com.capgemini.forestrymanagement.springbootdto.ClientBean;

public interface ClientDao {
	public boolean addClient(ClientBean bean);

	public boolean deleteClient(int clientid);

	public boolean updateClient(int clientid, ClientBean bean);

	public ClientBean getClient(int clientid);

	public List<ClientBean> getAllClient();
}
