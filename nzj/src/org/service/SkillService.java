package org.service;

import org.model.Skill;

public interface SkillService {
	/**
	 * 1添加基本技能
	 * @param a
	 * @return
	 */
	public Object addSkill(Skill a);
	
	/**
	 * 2删除基本技能
	 * @param id
	 * @return
	 */
	public Object deleteSkill(long id);
	
	/**
	 * 3修改基本技能
	 * @param a
	 * @return
	 */
	public Object updateSkill(Skill a);
	
	/**
	 * 4获取基本技能列表
	 * @return
	 */
	public Object getSkillList();
}
