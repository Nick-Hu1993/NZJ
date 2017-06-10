package org.dao;

import java.util.List;

import org.Form.AuntWorkForm;

public interface AuntWorkDao {
	// -----------------------------------增---------------------------------------

	// -----------------------------------删---------------------------------------

	// -----------------------------------改---------------------------------------
	public boolean updateWorkByAuntId(final long AuntId,final AuntWorkForm w);
	// -----------------------------------查---------------------------------------
	/**
	 * 4.1查询阿姨工作经历
	 * @return
	 */
	public List getWorkByAuntId(long auntId);
}
