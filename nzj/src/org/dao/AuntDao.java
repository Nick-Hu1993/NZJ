package org.dao;

import java.util.List;

import org.Form.AuntContactForm;
import org.Form.AuntWorkForm;
import org.model.Aunt;
import org.model.AuntWork;
import org.view.VAuntId;

public interface AuntDao {
	// -----------------------------------增---------------------------------------
	/**
	 * 1.1添加阿姨，同时将所有从属表的关系全部添加进去
	 * @param l
	 * @return
	 */
	public boolean addAunt(Aunt a, final Long[] languageId,
			final Long[] cookingId, final Long[] skillId,
			final Long[] applianceId, final Long[] certificateId,
			final Long[] jobId, final AuntContactForm c, final AuntWorkForm w,
			final String url);

	// -----------------------------------删---------------------------------------
	/**
	 * 2.1删除阿姨
	 * @param id
	 * @return
	 */
	public boolean deleteAunt(long id);

	// -----------------------------------改---------------------------------------
	/**
	 * 3.1修改阿姨，只修改主表
	 * @param l
	 * @return
	 */
	public boolean updateAunt(Aunt l);
	
	/**
	 * 3.2修改阿姨状态
	 * @param id
	 * @param status
	 * @return
	 */
	public boolean updateAuntStatus(Long id,Integer status);
	/**
	 * 3.3修改复选框信息（1.语言，2，烹饪技能，3.基本技能、4.家用电器、5.证书、6.岗位）
	 * @param auntid
	 * @param laId
	 * @param coId
	 * @param skId
	 * @param apId
	 * @param ceId
	 * @param joId
	 * @return
	 */
	public boolean updateAuntSkills (long auntid, long[] laId, long[] coId, long[] skId,  long[] apId, long[] ceId, long[] joId);
	// -----------------------------------查---------------------------------------
	/**
	 * 4.1获取全部阿姨
	 * @return
	 */
	public List<VAuntId> getAuntList(Integer start, Integer limit,Long userId);
	/**
	 * 4.2验证身份证是否重复插入，null表示此身份证可用，允许插入
	 * @param idnumber
	 * @return
	 */
	public Aunt getAunt(String idnumber);
	/**
	 * 4.3获取阿姨总数，只统计当前加盟商的数据，如果是总部，则全部
	 * @return
	 */
	public Long getAuntCount(Long userId);
	/**
	 * 4.4通过阿姨id获取阿姨，返回的是视图
	 * @param id
	 * @return
	 */
	public VAuntId getAuntById(Long id);
	/**
	 * 4.5根据状态来筛选当前加盟商的所有阿姨
	 * status：0待岗， 1上岗， -1黑名单
	 * @param status
	 * @param start
	 * @param limit
	 * @param userId
	 * @return
	 */
	public List<VAuntId> getAuntListByStatus(Integer status,Integer start, Integer limit,Long userId);
	/**
	 * 4.6根据状态获取当前加盟商的阿姨总数
	 * @param status
	 * @param userId
	 * @return
	 */
	public long getAuntCountByStatus(Integer status,long userId);
}
