package org.service;

import org.model.Language;

public interface LanguageService {
	/**
	 * 1添加语言
	 * @param a
	 * @return
	 */
	public Object addLanguage(Language a);
	
	/**
	 * 2删除语言
	 * @param id
	 * @return
	 */
	public Object deleteLanguage(long id);
	
	/**
	 * 3修改语言
	 * @param a
	 * @return
	 */
	public Object updateLanguage(Language a);
	
	/**
	 * 4获取语言列表
	 * @return
	 */
	public Object getLanguageList();
}
