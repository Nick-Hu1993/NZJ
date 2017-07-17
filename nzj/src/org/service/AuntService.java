package org.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.Form.AuntContactForm;
import org.Form.AuntWorkForm;
import org.model.Aunt;
import org.model.AuntContact;
import org.model.AuntWork;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public interface AuntService {
	/**
	 * 1添加阿姨
	 * 
	 * @param session
	 * @param a
	 * @return
	 */
	public Object addAunt(HttpSession session, HttpServletRequest request,
			Aunt a, Long[] languageId, Long[] cookingId, Long[] skillId,
			Long[] applianceId, Long[] certificateId, Long[] jobId,
			AuntContactForm c, AuntWorkForm w,
			@RequestParam("file") CommonsMultipartFile file)
			throws IllegalStateException, IOException;

	/**
	 * 2删除阿姨
	 * 
	 * @param id
	 * @return
	 */
	public Object deleteAunt(long id);

	/**
	 * 3获取阿姨列表
	 * 
	 * @param session
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getAuntList(HttpSession session, Integer start, Integer limit);

	/**
	 * 4.通过id获取阿姨完整信息
	 * 
	 * @param id
	 * @return
	 */
	public Object getAuntById(Long id);

	/**
	 * 5.根据状态来获取当前加盟商的所有阿姨列表
	 * 0待岗，1上岗，-1黑名单
	 * @param status
	 * @param start
	 * @param limit
	 * @param userId
	 * @return
	 */
	public Object getAuntListByStatus(HttpSession session, Integer status,
			Integer start, Integer limit, Long userId);

	/**
	 * 6.修改阿姨基本信息（不包括从表）
	 * 
	 * @param a
	 * @return
	 */
	public Object updateAunt (Aunt a);

	/**
	 * 7.修改阿姨语言
	 * 
	 * @param AuntId
	 * @param laId
	 * @return
	 */
	public Object updateAuntLanguage(long AuntId, long[] laId);

	/**
	 * 8.修改阿姨烹饪技能
	 * 
	 * @param AuntId
	 * @param coId
	 * @return
	 */
	public Object updateAuntCooking(long AuntId, long[] coId);

	/**
	 * 9.修改阿姨基本技能
	 * 
	 * @param AuntId
	 * @param skId
	 * @return
	 */
	public Object updateAuntSkill(long AuntId, long[] skId);

	/**
	 * 10.修改阿姨家用电器
	 * 
	 * @param AuntId
	 * @param apId
	 * @return
	 */
	public Object updateAuntAppliance(long AuntId, long[] apId);

	/**
	 * 11.修改阿姨证书
	 * 
	 * @param AuntId
	 * @param ceId
	 * @return
	 */
	public Object updateAuntCertificate(long AuntId, long[] ceId);

	/**
	 * 12.修改阿姨岗位
	 * 
	 * @param AuntId
	 * @param joId
	 * @return
	 */
	public Object updateAuntJob(long AuntId, long[] joId);

	/**
	 * 13.修改阿姨紧急联系人
	 * 
	 * @param AuntId
	 * @param c
	 * @return
	 */
	public Object updateAuntContact(long AuntId, AuntContactForm c);

	/**
	 * 14.修改阿姨工作经历
	 * 
	 * @param AuntId
	 * @param w
	 * @return
	 */
	public Object updataAuntWork(long AuntId, AuntWorkForm w);

	/**
	 * 15.修改阿姨照片
	 * 
	 * @param AuntId
	 * @param url
	 * @return
	 */
	public Object updateAuntPhoto(HttpServletRequest request, long AuntId,
			@RequestParam("file") CommonsMultipartFile file)
			throws IllegalStateException, IOException;
	
	/**
	 * 16.修改阿姨状态（0待岗， 1上岗， -1黑名单）
	 * @param AuntId
	 * @param status
	 * @return
	 */
	public Object updateAuntStauts(Long AuntId,Integer status);
	/**
	 * 17.根据用户id及阿姨状态遍历阿姨信息（0待岗， 1上岗， -1黑名单）
	 * @param start
	 * @param limit
	 * @param userId
	 * @param status
	 * @return
	 */
	public Object getAuntListByIdStatus (Integer start, Integer limit, Long userId, Integer status);
	/**
	 * 18.修改复选框信息（1.语言，2，烹饪技能，3.基本技能、4.家用电器、5.证书、6.岗位）
	 * @param auntid
	 * @param laId
	 * @param coId
	 * @param skId
	 * @param apId
	 * @param ceId
	 * @param joId
	 * @return
	 */
	public Object updateAuntSkills (long auntid, long[] laId, long[] coId, long[] skId,  long[] apId, long[] ceId, long[] joId);
}
