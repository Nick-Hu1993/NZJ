package org.dao;

import java.util.List;

import org.Form.AuntContactForm;

public interface AuntContactDao {
	// -----------------------------------增---------------------------------------

	// -----------------------------------删---------------------------------------

	// -----------------------------------改---------------------------------------
	/**
	 * 3.1修改阿姨的紧急联系人，联系人的表id不需要传，即传AuntId cname[],relation[],workstatus[],cphone[]
	 * @param AuntId
	 * @param ac
	 * @return
	 */
	public boolean updateContactByAuntId(final long AuntId,final AuntContactForm c);
	// -----------------------------------查---------------------------------------
	/**
	 * 4.1查询阿姨紧急联系人
	 * @return
	 */
	public List getContactByAuntId(long auntId);
}
