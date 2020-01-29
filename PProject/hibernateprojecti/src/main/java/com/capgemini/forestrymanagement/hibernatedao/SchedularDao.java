package com.capgemini.forestrymanagement.hibernatedao;

import com.capgemini.forestrymanagement.hibernatebean.SchedularBean;

public interface SchedularDao {

	boolean addSchedular(SchedularBean bean);

	boolean modifySchedular(SchedularBean bean, int schedulerId);

	boolean deleteSchedular(int Schedularid);
}
