package com.capgemini.forestrymanagement.collectionmanager;

import com.capgemini.forestrymanagement.collectiondao.SchedularDao;
import com.capgemini.forestrymanagement.collectiondao.SchedularDaoImpl;

public class SchedularDaoManager {

	public static SchedularDao getAdmindao() {
		return new SchedularDaoImpl();
	}

	public static SchedularDao getSchedulardao() {
		return null;
	}

	public static SchedularDao instanceOfSchedularDaoImpl() {
		return null;
	}
}
