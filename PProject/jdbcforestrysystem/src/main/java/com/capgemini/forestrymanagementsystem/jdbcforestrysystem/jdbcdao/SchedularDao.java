package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.SchedularBean;

public interface SchedularDao {
	boolean addSchedular(SchedularBean bean);

	boolean modifySchedular(SchedularBean bean);

	boolean deleteSchedular(int Schedularid);
}
