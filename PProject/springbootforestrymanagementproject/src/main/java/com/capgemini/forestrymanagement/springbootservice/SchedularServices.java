package com.capgemini.forestrymanagement.springbootservice;

import java.util.List;
import com.capgemini.forestrymanagement.springbootdto.SchedularBean;

public interface SchedularServices {

	public boolean deleteSchedular(int landno);

	public List<SchedularBean> getAllSchedular();

	public boolean registerSchedular(SchedularBean bean);

	public SchedularBean getSchedularBean(int schedulerId);

	public boolean updateSchedular(SchedularBean bean);

}
