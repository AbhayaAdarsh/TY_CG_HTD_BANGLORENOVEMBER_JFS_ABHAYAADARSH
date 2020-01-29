package com.capgemini.forestrymanagement.springbootdao;

import java.util.List;
import com.capgemini.forestrymanagement.springbootdto.LandBean;

public interface LandDao {
	public boolean addLand(LandBean bean);

	public boolean deleteLand(int landno);

	public boolean updateLand(int landno, LandBean bean);

	public List<LandBean> getAllLand();
}
