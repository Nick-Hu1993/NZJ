package org.dao;

import java.util.List;

import org.Form.PactTrackingForm;
import org.model.Pact;
import org.model.PactTracking;

public interface PactDao {
	// -----------------------------------增---------------------------------------
	/**
	 * 1.1添加当前用户的合同
	 * 
	 * @param p
	 * @return
	 */
	public long addPact(Pact p);

	/**
	 * 1.2添加合同的服务跟踪情况
	 * 
	 * @param pt
	 * @return
	 */
	public boolean addPactTracking(Long pactId, PactTrackingForm pt);

	// -----------------------------------删---------------------------------------
	/**
	 * 2.1删除当前用户的合同 删除合同时连带服务跟踪数据一同删除
	 * 
	 * @param id
	 * @return
	 */
	public boolean deletePact(long id);

	/**
	 * 2.2删除合同的服务跟踪数据
	 * 
	 * @param id
	 * @return
	 */
	public boolean deletePactTracking(long id);

	// -----------------------------------改---------------------------------------
	/**
	 * 3.1更改当前用户的合同内容
	 * 
	 * @param p
	 * @return
	 */
	public boolean updatePact(Pact p);

	/**
	 * 3.2修改合同跟踪情况
	 * 
	 * @param pt
	 * @return
	 */
	public boolean updatePactTracking(PactTracking pt);

	// -----------------------------------查---------------------------------------
	/**
	 * 4.1查询用户输入的合同号，避免重复输入
	 * 
	 * @param code
	 * @return
	 */
	public Pact getPactByCode(String code);

	/**
	 * 4.2获取当前用户的所有合同
	 * 
	 * @param userid
	 * @param id
	 * @param limit
	 * @return
	 */
	public List<Pact> getPactList(Long userId, Integer start, Integer limit);

	/**
	 * 4.3获取合同数量
	 * 
	 * @param id
	 * @return
	 */
	public long getPactCountById(Long id);

	/**
	 * 4.4根据合同状态遍历合同 0正常 -1暂停 -2退单
	 * 
	 * @param id
	 * @param status
	 * @return
	 */
	public long getPactCountByStatus(Long id, Integer status);

	/**
	 * 4.5根据合同号获取服务跟踪情况列表
	 * 
	 * @param packId
	 * @return
	 */
	public List<PactTracking> getPactTrackingList(Long packId);

	/**
	 * 4.6根据合同状态遍历合同 0正常 -1暂停 -2退单
	 * 
	 * @param start
	 * @param limit
	 * @param userId
	 * @param status
	 * @return
	 */
	public List<Pact> getPactListByStatus(Integer start, Integer limit,
			Long userId, Integer status);
	/**
	 * 4.7用雇主的id查询与其签订的合同
	 * @param start
	 * @param limit
	 * @param employerId
	 * @return
	 */
	public List<Pact> getPactListByEmployerId (Integer start, Integer limit,
			Long employerId);
	/**
	 * 4.8根据雇主id查询当前雇主的合同数量
	 * @param employerId
	 * @return
	 */
	public long getCountByEmployerId (long employerId);
	/**
	 * 4.9根据合同查找对应的标签的总数
	 * ps:配合4.5
	 * @param packId
	 * @return
	 */
	public long getCountByPactId (long packId);
}
