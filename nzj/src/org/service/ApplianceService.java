package org.service;

import org.model.Appliance;

public interface ApplianceService {
	/**
	 * 1添加家电
	 * @param a
	 * @return
	 */
	public Object addAppliance(Appliance a);
	
	/**
	 * 2删除家电
	 * @param id
	 * @return
	 */
	public Object deleteAppliance(long id);
	
	/**
	 * 3修改家电
	 * @param a
	 * @return
	 */
	public Object updateAppliance(Appliance a);
	
	/**
	 * 4获取家电列表
	 * @return
	 */
	public Object getApplianceList();
}
