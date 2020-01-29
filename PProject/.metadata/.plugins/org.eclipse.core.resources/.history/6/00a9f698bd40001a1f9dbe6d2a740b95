package com.capgemini.forestrymanagement.collectiondao;

import java.util.ArrayList;
import java.util.List;
import com.capgemini.forestrymanagement.collectionbean.ClientBean;

public class ClientDaoImpl implements ClientDao {
	private List<ClientBean> clientBean = new ArrayList<ClientBean>();

	@Override
	public boolean addClient(ClientBean bean) {
		for (ClientBean clientBean2 : clientBean) {
			if (clientBean2.getClientId() == bean.getClientId()) {
				return false;
			}

		}
		clientBean.add(bean);
		return true;
	}

	@Override
	public boolean deleteClient(int clientId) {
		ClientBean bean = null;
		for (ClientBean clientBean2 : clientBean) {
			if (clientBean2.getClientId() == clientId) {
				bean = clientBean2;
			}
		}
		if (bean != null) {
			clientBean.remove(bean);
			return true;
		}

		return false;
	}

	@Override
	public boolean updateClient(ClientBean bean) {
		for (ClientBean clientBean2 : clientBean) {
			if (clientBean2.getClientId() == bean.getClientId()) {
				return false;
			}
		}
		clientBean.add(bean);
		return true;
	}

	@Override
	public ClientBean getClient(int clientId) {
		for (ClientBean clientBean2 : clientBean) {
			if (clientBean2.getClientId() == clientId) {
				return clientBean2;
			}
		}
		return null;
	}

	@Override
	public List<ClientBean> getAllClient() {
		return clientBean;
	}

	public List<ClientBean> getClient() {
		return null;
	}

}
