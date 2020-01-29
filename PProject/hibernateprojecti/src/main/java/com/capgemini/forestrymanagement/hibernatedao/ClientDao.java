package com.capgemini.forestrymanagement.hibernatedao;

import java.util.List;
import com.capgemini.forestrymanagement.hibernatebean.ClientBean;

public interface ClientDao {
	boolean addClient(ClientBean bean);

	boolean deleteClient(int clientid);

	boolean updateClient(ClientBean bean, int clientid);

	List<ClientBean> getAllClient();
}
