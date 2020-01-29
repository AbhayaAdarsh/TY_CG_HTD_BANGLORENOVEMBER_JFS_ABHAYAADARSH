package com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcdao;

import com.capgemini.forestrymanagementsystem.jdbcforestrysystem.jdbcbean.LandBean;

public interface LandDao {

	public boolean addLand(LandBean bean);

	public boolean deleteLand(int landNo);

	public boolean modifyLand(LandBean bean);

}
