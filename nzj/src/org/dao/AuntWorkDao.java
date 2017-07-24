package org.dao;

import java.util.List;

import org.Form.AuntWorkForm;

public interface AuntWorkDao {
	// -----------------------------------增---------------------------------------
	/**
	 * 1.1添加工作经历
	 * 可批量
	 * @param AuntId
	 * @param w
	 * @return
	 */
	public boolean addWork (long AuntId, AuntWorkForm w);
	// -----------------------------------删---------------------------------------
	/**
	 * 2.1删除工作经历
	 * @param id
	 * @return
	 */
	public boolean deleteWork (long id);
	// -----------------------------------改---------------------------------------
	public boolean updateWorkByAuntId(final long AuntId,final AuntWorkForm w);
	// -----------------------------------查---------------------------------------
	/**
	 * 4.1查询阿姨工作经历
	 * @return
	 */
	public List getWorkByAuntId(long auntId);
}
