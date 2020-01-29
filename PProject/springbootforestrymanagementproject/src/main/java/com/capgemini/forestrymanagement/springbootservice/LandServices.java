package com.capgemini.forestrymanagement.springbootservice;

import java.util.List;
import com.capgemini.forestrymanagement.springbootdto.LandBean;

public interface LandServices {
	public boolean addLand(LandBean bean);

	public boolean deleteLand(int landNo);

	public boolean updateLand(LandBean bean);

	public List<LandBean> getAllLand();

	public List<LandBean> getLandBean(int landno);

	public boolean registerLand(LandBean bean);

}