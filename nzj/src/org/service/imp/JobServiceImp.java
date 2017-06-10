package org.service.imp;

import java.util.List;

import org.dao.JobDao;
import org.model.Job;
import org.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.JsonObject;

@Service
public class JobServiceImp implements JobService{
	@Autowired
	private JobDao jDao;
	
	@Override
	public Object addJob(Job a) {
		if(jDao.addJob(a)!=-1)
			return JsonObject.getResult(1, "添加岗位成功", true);
		else
			return JsonObject.getResult(0, "添加岗位失败", false);
	}

	@Override
	public Object deleteJob(long id) {
		if(jDao.deleteJob(id))
			return JsonObject.getResult(1, "删除岗位成功", true);
		else
			return JsonObject.getResult(0, "删除岗位失败", false);
	}

	@Override
	public Object updateJob(Job a) {
		if(jDao.updateJob(a))
			return JsonObject.getResult(1, "修改岗位成功", true);
		else
			return JsonObject.getResult(0, "修改岗位成功", false);
	}

	@Override
	public Object getJobList() {
		List li = jDao.getJobList();
		return JsonObject.getResult(1, "获取岗位列表", li);
	}
}
