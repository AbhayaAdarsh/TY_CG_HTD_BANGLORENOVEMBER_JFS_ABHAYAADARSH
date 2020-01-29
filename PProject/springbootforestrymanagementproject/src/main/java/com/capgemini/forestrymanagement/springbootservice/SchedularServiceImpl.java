package com.capgemini.forestrymanagement.springbootservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestrymanagement.springbootdao.SchedularDao;
import com.capgemini.forestrymanagement.springbootdto.SchedularBean;
import com.capgemini.forestrymanagement.springbootexception.SchedularException;

@Service
public class SchedularServiceImpl implements SchedularServices {
	@Autowired
	SchedularDao dao;

	@Override
	public boolean deleteSchedular(int schedulerId) throws SchedularException {
		return dao.deleteSchedular(schedulerId);
	}

	@Override
	public List<SchedularBean> getAllSchedular() {
		return dao.getAllSchedular();
	}

	@Override
	public boolean registerSchedular(SchedularBean bean) {
		return dao.register(bean);
	}

	@Override
	public SchedularBean getSchedularBean(int schedulerId) {
		return dao.getSchedularBean(schedulerId);
	}

	@Override
	public boolean updateSchedular(SchedularBean bean) {
		return dao.updateSchedular(bean);
	}
}