package com.capgemini.forestrymanagement.springbootdao;

import java.util.List;
import com.capgemini.forestrymanagement.springbootdto.SchedularBean;

public interface SchedularDao {
	public boolean register(SchedularBean bean);

	public boolean updateSchedular(SchedularBean bean);

	public boolean deleteSchedular(int schedularId);

	public List<SchedularBean> getAllSchedular();

	public SchedularBean getSchedularBean(int schedulerId);
}
