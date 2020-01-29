package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcservice;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.LandBean;

public interface LandServices {
	boolean addLand(LandBean bean);

	boolean modifyLand(LandBean bean);

	boolean deleteLand(int landId);
}
