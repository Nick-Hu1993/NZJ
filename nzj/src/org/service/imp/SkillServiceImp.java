package org.service.imp;

import java.util.List;

import org.dao.SkillDao;
import org.model.Skill;
import org.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.JsonObject;

@Service
public class SkillServiceImp implements SkillService{
	@Autowired
	private SkillDao sDao;
	
	@Override
	public Object addSkill(Skill l) {
		if(sDao.addSkill(l)!=-1)
			return JsonObject.getResult(1, "添加基本技能成功", true);
		else
			return JsonObject.getResult(0, "添加基本技能失败", false);
	}

	@Override
	public Object deleteSkill(long id) {
		if(sDao.deleteSkill(id))
			return JsonObject.getResult(1, "删除基本技能成功", true);
		else
			return JsonObject.getResult(0, "删除基本技能失败", false);
	}

	@Override
	public Object updateSkill(Skill a) {
		if(sDao.updateSkill(a))
			return JsonObject.getResult(1, "修改基本技能成功", true);
		else
			return JsonObject.getResult(0, "修改基本技能失败", false);
	}

	@Override
	public Object getSkillList() {
		List li = sDao.getSkillList();
		return JsonObject.getResult(1, "获取基本技能列表", li);
	}
}
