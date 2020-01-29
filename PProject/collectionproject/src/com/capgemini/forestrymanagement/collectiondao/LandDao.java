package com.capgemini.forestrymanagement.collectiondao;

import java.util.List;
import com.capgemini.forestrymanagement.collectionbean.LandBean;

public interface LandDao {
	public boolean addLand(LandBean bean);

	public boolean deleteLand(int landNo);

	public boolean modifyLand(LandBean bean);

	public boolean displayLand(int landNo);

	public List<LandBean> getAllInfoLand();
}
