package org.service;

import javax.servlet.http.HttpSession;

import org.Form.SupportTrackingForm;
import org.model.SupportTracking;

public interface SupportTrackingService {
	/**
	 * 1.添加追踪标签（可批量）
	 * @param stf
	 * @return
	 */
	public Object addSupportTracking (HttpSession session, SupportTrackingForm stf, long id);
	/**
	 * 2.删除追踪(可批量)
	 * @param id
	 * @return
	 */
	public Object deleteSupportTracking (Long[] id);
	/**
	 * 3.修改追踪标签
	 * @param st
	 * @param time
	 * @return
	 */
	public Object updateSupportTranking (SupportTracking st, String time);
	/**
	 * 4.根据不同状态（-1开业前，1开业后）遍历服务追踪标签
	 * @param status
	 * @return
	 */
	public Object getSupportTrackingByStatus (HttpSession session,Integer start, Integer limit, Integer status);
}
