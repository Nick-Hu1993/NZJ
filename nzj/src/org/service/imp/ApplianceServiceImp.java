package org.service.imp;

import java.util.List;

import org.dao.ApplianceDao;
import org.model.Appliance;
import org.service.ApplianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.JsonObject;

@Service
public class ApplianceServiceImp implements ApplianceService{
	@Autowired
	private ApplianceDao aDao;
	
	@Override
	public Object addAppliance(Appliance a) {
		if(aDao.addAppliance(a)!=-1)
			return JsonObject.getResult(1, "添加家电成功", true);
		else
			return JsonObject.getResult(0, "删除家电成功", true);
	}

	@Override
	public Object deleteAppliance(long id) {
		if(aDao.deleteAppliance(id))
			return JsonObject.getResult(1, "删除家电成功", true);
		else
			return JsonObject.getResult(0, "删除家电失败", false);
	}

	@Override
	public Object updateAppliance(Appliance a) {
		if(aDao.updateAppliance(a))
			return JsonObject.getResult(1, "修改家电成功", true);
		else
			return JsonObject.getResult(0, "添加家电失败", false);
	}

	@Override
	public Object getApplianceList() {
		List li =aDao.getApplianceList();
		return JsonObject.getResult(1, "获取家电列表", li);
	}

}
