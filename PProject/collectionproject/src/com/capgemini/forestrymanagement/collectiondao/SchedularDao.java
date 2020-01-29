package com.capgemini.forestrymanagement.collectiondao;

import com.capgemini.forestrymanagement.collectionbean.SchedularBean;

public interface SchedularDao {
	boolean addSchedular(SchedularBean bean);

	boolean modifySchedular(SchedularBean bean);

	boolean deleteSchedular(int Schedularid);
}
