package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.SchedularBean;

public interface SchedularServices {
	boolean addSchedular(SchedularBean bean);

	boolean deleteSchedular(int contractid);

	boolean modifySchedular(SchedularBean bean);
}
