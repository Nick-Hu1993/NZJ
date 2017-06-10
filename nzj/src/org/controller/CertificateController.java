package org.controller;

import org.model.Certificate;
import org.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CertificateController {
	@Autowired
	private CertificateService cService;
	
	@RequestMapping("/addCertificate")
	@ResponseBody
	public Object addCertificate(String name)throws Exception{
		return cService.addCertificate(new Certificate(name));
	}
	
	@RequestMapping("/deleteCertificate")
	@ResponseBody
	public Object deleteCertificate(long id)throws Exception{
		return cService.deleteCertificate(id);
	}
	
	@RequestMapping("/updateCertificate")
	@ResponseBody
	public Object updateCertificate(Long id,String name)throws Exception{
		return cService.updateCertificate(new Certificate(id,name));
	}
	
	@RequestMapping("/getCertificateList")
	@ResponseBody
	public Object getCertificateList()throws Exception{
		return cService.getCertificateList();
	}
}
