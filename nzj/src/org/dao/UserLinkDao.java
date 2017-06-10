package org.dao;

import java.util.List;

import org.model.UserLink;
import org.view.VUser;

public interface UserLinkDao {
	//-----------------------------------增---------------------------------------
	public long addUserLink(UserLink ul);
	//-----------------------------------删---------------------------------------
	//-----------------------------------改---------------------------------------
	//-----------------------------------查---------------------------------------
	/**
	 * 4.1通过id查询父级节点
	 * @param child
	 * @return
	 */
	public long getParentByChild(Long child);
	/**
	 * 4.2通过当前用户的id查寻其子级节点
	 * @param parent
	 * @return
	 */
	public List<VUser> getChildByParent (Integer start, Integer limit, Long[] parent);
}
