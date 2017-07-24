package org.dao;

import java.util.List;

import org.Form.AuntContactForm;

public interface AuntContactDao {
	// -----------------------------------增---------------------------------------
	/**
	 * 1.1新增紧急联系人
	 * 可批量
	 * @param AuntId
	 * @param c
	 * @return
	 */
	public boolean addContact (long AuntId, AuntContactForm c); 
	// -----------------------------------删---------------------------------------
	/**
	 * 2.1删除紧急联系人
	 * @param AuntId
	 * @return
	 */
	public boolean deleteContact (long id);

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
