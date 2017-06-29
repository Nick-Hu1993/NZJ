package org.dao;

import java.util.List;

import org.model.AmountRecord;

public interface AmountRecordDao {
	//-----------------------------------增---------------------------------------
	/**
	 * 1.1添加消费记录（此接口作废）
	 * @param ad
	 * @return
	 */
	public boolean addAmountRecord(AmountRecord ad);
	/**
	 * 根据用户id获取消费记录
	 * @param start
	 * @param limit
	 * @param id
	 * @return
	 */
	public List<AmountRecord> getAmountRecordList(Integer start, Integer limit, long id);
}
