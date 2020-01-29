package com.capgemini.forestrymanagement.collectiondao;

import java.util.List;
import com.capgemini.forestrymanagement.collectionbean.ClientBean;

public interface ClientDao {
	boolean addClient(ClientBean bean);

	boolean deleteClient(int clientid);

	ClientBean getClient(int clientid);

	List<ClientBean> getAllClient();

	boolean updateClient(ClientBean bean);

}
