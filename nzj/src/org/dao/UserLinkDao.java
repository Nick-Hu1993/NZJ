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
	public List<VUser> getChildByParentAndSupport (Integer start, Integer limit, Long[] parent, Integer support);
	/**
	 * 4.3通过当前用户的id查询其子级节点的数量，配合4.2
	 * @param parent
	 * @param support
	 * @return
	 */
	public long getCountByParentAndSupport (Long[] parent, Integer support);
	/**
	 * 4.4通过父级用户查询子级用户
	 * 用于数据统计
	 * @param parent
	 * @return
	 */
	public List<Long> getChildListByParent(Long parent);

}
