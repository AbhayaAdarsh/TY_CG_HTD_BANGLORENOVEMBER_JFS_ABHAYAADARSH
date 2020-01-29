package com.capgemini.forestrymanagement.collectionmanager;

import com.capgemini.forestrymanagement.collectiondao.LandDao;
import com.capgemini.forestrymanagement.collectiondao.LandDaoImpl;

public class LandDaoManager {
	public static LandDao getLanddao() {
		return new LandDaoImpl();
	}

	public static LandDao instanceOfLandDaoImpl() {
		return null;
	}

}
