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
	//-----------------------------------查---------------------------------------
	/**4.1根据用户id获取消费记录
	 * @param start
	 * @param limit
	 * @param id
	 * @return
	 */
	public List<AmountRecord> getAmountRecordList(Integer start, Integer limit, long id);
	/**
	 * 4.2根据用户的id号查询消费记录的数量
	 * @param id
	 * @return
	 */
	public long getCount (long id);
}
