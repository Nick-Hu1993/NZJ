package org.dao;

import java.util.List;

import org.model.Language;

public interface LanguageDao {
	//-----------------------------------增---------------------------------------
	/**
	 * 1.1添加语言
	 * @param l
	 * @return
	 */
	public long addLanguage(Language l);
	//-----------------------------------删---------------------------------------
	/**
	 * 2.1删除语言
	 * @param id
	 * @return
	 */
	public boolean deleteLanguage(long id);
	//-----------------------------------改---------------------------------------
	/**
	 * 3.1修改语言
	 * @param l
	 * @return
	 */
	public boolean updateLanguage(Language l);
	/**
	 * 3.2修改阿姨的语言
	 * @param AuntId
	 * @param laId
	 * @return
	 */
	public boolean updateLanguageByAuntId(long AuntId,long[] laId);
	//-----------------------------------查---------------------------------------
	/**
	 * 4.1查询语言
	 * @return
	 */
	public List getLanguageList();
	/**
	 * 4.2通过阿姨的id查出会的所有的语言
	 * @return
	 */
	public List getLanguageByAuntId(long auntId);
}
