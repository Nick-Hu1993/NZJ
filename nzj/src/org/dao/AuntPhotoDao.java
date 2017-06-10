package org.dao;

import java.util.List;

public interface AuntPhotoDao {
	//-----------------------------------增---------------------------------------
	
	//-----------------------------------删---------------------------------------
	
	//-----------------------------------改---------------------------------------
	/**
	 * 3.1修改阿姨照片
	 * @param AuntId
	 * @param url
	 * @return
	 */
	public boolean updatePhotoByAuntId(final long AuntId,final String url);
	//-----------------------------------查---------------------------------------
	/**
	 * 4.1查询阿姨照片
	 * @return
	 */
	public List getPhotoByAuntId(long auntId);
}
