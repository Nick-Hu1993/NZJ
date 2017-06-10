package org.service;

import org.model.Cooking;


public interface CookingService {
	/**
	 * 1添加烹饪技能
	 * @param a
	 * @return
	 */
	public Object addCooking(Cooking a);
	
	/**
	 * 2删除烹饪技能
	 * @param id
	 * @return
	 */
	public Object deleteCooking(long id);
	
	/**
	 * 3修改烹饪技能
	 * @param a
	 * @return
	 */
	public Object updateCooking(Cooking a);
	
	/**
	 * 4获取烹饪技能列表
	 * @return
	 */
	public Object getCookingList();
}
