package org.service.imp;

import java.util.List;

import org.dao.LanguageDao;
import org.model.Language;
import org.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.JsonObject;

@Service
public class LanguageServiceImp implements LanguageService{
	@Autowired
	private LanguageDao lDao;

	@Override
	public Object addLanguage(Language a) {
		if(lDao.addLanguage(a)!=-1)
			return JsonObject.getResult(1, "添加语言成功", true);
		else
			return JsonObject.getResult(0, "添加家电成功", false);
	}

	@Override
	public Object deleteLanguage(long id) {
		if(lDao.deleteLanguage(id))
			return  JsonObject.getResult(1, "删除语言成功", true);
		else
			return JsonObject.getResult(0, "删除语言成功", false);
	}

	@Override
	public Object updateLanguage(Language a) {
		if(lDao.updateLanguage(a))
			return JsonObject.getResult(1, "修改语言成功", true);
		else
			return JsonObject.getResult(0, "修改语言成功", false);
	}

	@Override
	public Object getLanguageList() {
		List li =lDao.getLanguageList();
		return JsonObject.getResult(1, "获取语言列表", li);
	}
	
}
