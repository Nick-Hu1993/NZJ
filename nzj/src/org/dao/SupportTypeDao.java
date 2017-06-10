package org.dao;

import java.util.List;

import org.model.SupportType;

public interface SupportTypeDao {
	//-----------------------------------增--------------------------------------
	/**
	 * 1.1增加加盟支持的类型（仅管理员）
	 * @param type
	 * @return
	 */
	public long addSupportType (SupportType st);
	//-----------------------------------删--------------------------------------
	/**
	 * 2.1删除加盟支持的类型（仅管理员）
	 * @param id
	 * @return
	 */
	public boolean deleteSupportType (long id);
	//-----------------------------------改--------------------------------------
	/**
	 * 3.1更改加盟支持的类型（仅管理员）
	 * @param st
	 * @return
	 */
	public boolean updateSupportType(SupportType st);
	//-----------------------------------查--------------------------------------
	/**
	 *4.1遍历所有加盟支持的类型（仅管理员）
	 * @return
	 */
	public List<SupportType> getSupporTypeList (Integer start, Integer limit);
	/**
	 * 4.2查询类型的总记录数量
	 * @return
	 */
	public long getCount ();
}