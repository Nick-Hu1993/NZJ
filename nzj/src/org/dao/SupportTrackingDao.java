package org.dao;

import java.util.List;

import org.Form.SupportTrackingForm;
import org.model.SupportTracking;

public interface SupportTrackingDao {
	//-----------------------------------增--------------------------------------
	/**
	 * 1.1添加服务追踪情况标签（可批量添加）
	 * 选择类型时候，只能单选（前端控制）
	 * @param st
	 * @return
	 */
	public boolean addSupportTracking (SupportTrackingForm stf);
	
	//-----------------------------------删--------------------------------------
	/**
	 * 2.1删除服务追踪情况表（仅管理员，可批量删除）
	 * 连带追踪情况标签一同删除
	 * @param id
	 * @return
	 */
	public boolean deleteSupportTracking (Long[] id);
	//-----------------------------------改--------------------------------------
	/**
	 * 3.1修改服务追踪情况标签
	 * @param supportTrackingid
	 * @param st
	 * @return
	 */
	public boolean updateSupportTracking (SupportTracking st);
	//-----------------------------------查--------------------------------------
	/**
	 * 4.1根据不同状态（-1开业前，1开业后）遍历服务追踪标签
	 * @param status
	 * @return
	 */
	public List<SupportTracking> getSupportTrackingByStatus (Integer start, Integer limit, Integer status);
	/**
	 * 4.2根据不同状态（-1开业前，1开业后）查询记录数量
	 * @param status
	 * @return
	 */
	public long getCountByStatus (Long userId, Integer status);
	
}
