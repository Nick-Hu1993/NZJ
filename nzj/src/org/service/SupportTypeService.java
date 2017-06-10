package org.service;

import org.model.SupportType;

public interface SupportTypeService {
	/**
	 * 1.增加加盟支持的类型（仅管理员）
	 * @param st
	 * @return
	 */
	public Object addSuportType (SupportType st);
	/**
	 * 2.删除加盟支持的类型（仅管理员）
	 * @param id
	 * @return
	 */
	public Object deleteSupportType (long id);
	/**
	 * 3.更改加盟支持的类型（仅管理员）
	 * @param st
	 * @return
	 */
	public Object updateSupportType (SupportType st);
	/**
	 * 4.遍历所有加盟支持的类型（仅管理员）
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getSupportTypeList (Integer start, Integer limit);
}
