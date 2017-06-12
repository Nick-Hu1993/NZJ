package org.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.model.Trainee;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public interface TraineeService {
	/**
	 * 1.添加学员
	 * 
	 * @param o
	 * @return
	 */
	public Object addTrainee(HttpSession session, HttpServletRequest request,
			Trainee t, @RequestParam("file1") CommonsMultipartFile file1,
			@RequestParam("file2") CommonsMultipartFile file2,
			@RequestParam("file3") CommonsMultipartFile file3,
			@RequestParam("file4") CommonsMultipartFile file4)
			throws IllegalStateException, IOException;
	/**
	 * 2.删除学员（可批量操作）
	 * @param id
	 * @return
	 */
	public Object deleteTrainee (long[] id);
	/**
	 * 3.修改学员信息
	 * @param t
	 * @return
	 */
	public Object updateTrainee (Trainee t);
	/**
	 *4.修改学员缴费状态
	 * @param id
	 * @param pay
	 * @return
	 */
	public Object updateTraineePay (long id, Integer pay);
	/**
	 * 5.根据学员缴费状态遍历学员
	 * @param start
	 * @param limit
	 * @param pay
	 * @param user_id
	 * @return
	 */
	public Object getTraineesListByPay (HttpSession session, Integer start, Integer limit, Integer pay);
	/**
	 * 6.根据是否绑定定单遍历学员
	 * ps：即是否申请制证
	 * @param start
	 * @param limit
	 * @param bind
	 * @param user_id
	 * @return
	 */
	public Object getTraineeListByBind (HttpSession session, Integer start, Integer limit, Integer bind);
	/**
	 * 7.遍历当前用户的的所有学员
	 * @param start
	 * @param limit
	 * @param id
	 * @return
	 */
	public Object getTraineeById (HttpSession session, Integer start, Integer limit);
	/**
	 * 8.获取所有学员信息（仅管理员）
	 * @param start
	 * @param Integer
	 * @return
	 */
	public Object getTraineeList (HttpSession session, Integer start, Integer limit);
	
}
