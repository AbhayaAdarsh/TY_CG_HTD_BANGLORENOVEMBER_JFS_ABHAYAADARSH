package com.capgemini.forestrymanagement.collectionservice;

import com.capgemini.forestrymanagement.collectionbean.SchedularBean;

public interface SchedularServices {
	boolean addSchedular(SchedularBean bean);

	boolean deleteSchedular(int schedularid);

	boolean modifySchedular(SchedularBean bean);
}
