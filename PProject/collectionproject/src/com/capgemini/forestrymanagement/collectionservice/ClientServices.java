package com.capgemini.forestrymanagement.collectionservice;

import java.util.List;
import com.capgemini.forestrymanagement.collectionbean.ClientBean;

public interface ClientServices {
	boolean addClient(ClientBean bean);

	boolean deleteClient(int custid);

	boolean updateClient(ClientBean bean);

	ClientBean getClient(int clientid);

	List<ClientBean> getAllClient();

	boolean addClient1(ClientBean bean);
	boolean updateClient1(ClientBean bean);
	ClientBean getClient1(int clientid);

}
