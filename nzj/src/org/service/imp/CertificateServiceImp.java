package org.service.imp;

import java.util.List;

import org.dao.CertificateDao;
import org.model.Certificate;
import org.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.JsonObject;

@Service
public class CertificateServiceImp implements CertificateService{
	@Autowired
	private CertificateDao cDao;
	
	@Override
	public Object addCertificate(Certificate a) {
		if(cDao.addCertificate(a)!=-1)
			return JsonObject.getResult(1, "添加证书成功", true);
		else
			return JsonObject.getResult(0, "添加证书失败", false);
	}

	@Override
	public Object deleteCertificate(long id) {
		if(cDao.deleteCertificate(id))
			return JsonObject.getResult(1, "删除证书成功", true);
		else
			return JsonObject.getResult(0, "删除证书失败", false);
	}

	@Override
	public Object updateCertificate(Certificate a) {
		if(cDao.updateCertificate(a))
			return JsonObject.getResult(1, "修改证书成功", true);
		else
			return JsonObject.getResult(0, "修改证书失败", false);
	}

	@Override
	public Object getCertificateList() {
		List li = cDao.getCertificateList();
		return JsonObject.getResult(1, "获取证书列表", li);
	}

}
