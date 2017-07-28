package org.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.model.User;
import org.model.UserDetail;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.view.VUser;

public interface UserService {
	/**
	 * 1注册
	 * 
	 * @param u
	 * @return
	 */
	public Object register(HttpSession session, User u, Integer code);

	/**
	 * 2登录
	 * 
	 * @param u
	 * @return
	 */
	public Object login(HttpSession session, Long phone, String password);

	/**
	 * 3获取session
	 * 
	 * @param session
	 * @return
	 */
	public Object getSession(HttpSession session);

	/**
	 * 4获取短信验证码
	 * 
	 * @param session
	 * @param phone
	 * @return
	 */
	public Object getValidateCode(HttpSession session, Long phone);

	/**
	 * 5完善用户详细信息
	 * 
	 * @param ud
	 * @return
	 */
	public Object addUserDetail(HttpServletRequest request, UserDetail ud,
			@RequestParam("file1") CommonsMultipartFile file1,
			@RequestParam("file2") CommonsMultipartFile file2)
			throws IllegalStateException, IOException;

	/**
	 * 6修改用户详细信息
	 * 
	 * @param ud
	 * @return
	 */
	public Object updateUserDetail(HttpServletRequest request, UserDetail ud,
			@RequestParam("file1") CommonsMultipartFile file1,
			@RequestParam("file2") CommonsMultipartFile file2)
			throws IllegalStateException, IOException;

	/**
	 * 7获取当前用户信息
	 * 
	 * @param session
	 * @return
	 */
	public Object getUser(HttpSession session);

	/**
	 * 8修改用户密码
	 * 
	 * @return
	 */
	public Object updateUserPassword(HttpSession session, String oPwd,
			String nPwd);

	/**
	 * 9审核确认，修改ack 0为1，修改rank 0为rank，并将父节点的id传过来
	 * 
	 * @return
	 */
	public Object ackUser(Long id, Integer rank, Long pid);

	/**
	 * 10获取未确认的用户列表
	 * 
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getUnAckUserList(Integer start, Integer limit);

	/**
	 * 11检测该用户是否完善了用户信息
	 * 
	 * @param userId
	 * @return
	 */
	public Object checkUserDetail(Long userId);

	/**
	 * 12获取用户的审核情况信息
	 * 
	 * @param userId
	 * @return
	 */
	public Object getUserCheckById(Long userId);

	/**
	 * 13获取已确认的用户列表
	 * 
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getAckUserList(Integer start, Integer limit);

	/**
	 * 14填写用户审查表
	 * 
	 * @param userId
	 * @param status
	 * @param description
	 * @return
	 */
	public Object updateUserCheck(Long userId, Integer status,
			String description);
	/**
	 * 15.id号获取其下一级加盟商
	 * ps:批量查询
	 * @param id
	 * @return
	 */
	public Object getChildByParentAndSupport (HttpSession session, Integer start, Integer limit, Long[] parent, Integer support);
	/**
	 * 16.管理员登录
	 * ps：总部的员工亦可登录
	 * @param session
	 * @return
	 */
	public Object loginByAdmin (HttpSession session);
	/**
	 * 17.重置用户密码
	 * @param id
	 * @param nPwd
	 * @return
	 */
	public Object ResetUserPassword (long id, String nPwd);
	/**
	 * 18.通过rank值遍历用户
	 * @param start
	 * @param limit
	 * @param rank
	 * @return
	 */
	public Object getUserListByRank (Integer start, Integer limit, Integer rank);
	/**
	 * 19.以是否已享受加盟服务遍历用户详情
	 * 0需要（为服务过）：1不需要（已服务过）
	 * @return
	 */
	public Object getUserDetailListBySupport (Integer start, Integer limit, Integer support);
	/**
	 * 20.根据用户id获取用户详细信息
	 * @param userId
	 * @return
	 */
	public Object getUserDetailById(Long userId);
	/**
	 * 21.跟根据用户id列表，获取用户详情
	 * @param id
	 * @return
	 */
	public Object getUserDetailListById(Long[] id);
	/**
	 * 22.修改用户的头像
	 * @param userId
	 * @param photourl
	 * @return
	 */
	public Object updateUserPhoto(HttpServletRequest request, long userId, String image);
	/**
	 * 23.修改用户服务状态
	 * suppor：0未服务 1已服务
	 * @param userId
	 * @param support
	 * @return
	 */
	public Object updateSupport (long userId, Integer support);
}
