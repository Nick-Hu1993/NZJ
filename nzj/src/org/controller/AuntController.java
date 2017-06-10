package org.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.Form.AuntContactForm;
import org.Form.AuntWorkForm;
import org.model.Aunt;
import org.service.AuntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class AuntController {
	@Autowired
	private AuntService aService;

	@RequestMapping("/addAunt")
	@ResponseBody
	public Object addAunt(HttpSession session, HttpServletRequest request,
			Aunt a, Long[] languageId, Long[] cookingId, Long[] skillId,
			Long[] applianceId, Long[] certificateId, Long[] jobId,
			AuntContactForm c, AuntWorkForm w,
			@RequestParam("file") CommonsMultipartFile file) throws Exception {

		for (String aa : c.getCname())
			System.out.println("联系人名字：" + aa);

		return aService.addAunt(session, request, a, languageId, cookingId,
				skillId, applianceId, certificateId, jobId, c, w, file);
	}

	@RequestMapping("/deleteAunt")
	@ResponseBody
	public Object deleteAunt(long id) throws Exception {
		return aService.deleteAunt(id);
	}

	@RequestMapping("/getAuntList")
	@ResponseBody
	public Object getAuntList(HttpSession session, Integer start, Integer limit)
			throws Exception {
		return aService.getAuntList(session, start, limit);
	}

	@RequestMapping("/updateAunt")
	@ResponseBody
	public Object updateAunt(Aunt a) throws Exception {
		return aService.updateAunt(a);
	}

	@RequestMapping("/updateAuntLanguage")
	@ResponseBody
	public Object updateAuntLanguage(long AuntId, long[] id) throws Exception {
		return aService.updateAuntLanguage(AuntId, id);
	}

	@RequestMapping("/updateAuntCooking")
	@ResponseBody
	public Object updateAuntCooking(long AuntId, long[] id) throws Exception {
		return aService.updateAuntCooking(AuntId, id);
	}

	@RequestMapping("/updateAuntSkill")
	@ResponseBody
	public Object updateAuntSkill(long AuntId, long[] id) throws Exception {
		return aService.updateAuntSkill(AuntId, id);
	}

	@RequestMapping("/updateAuntAppliance")
	@ResponseBody
	public Object updateAuntAppliance(long AuntId, long[] id) throws Exception {
		return aService.updateAuntAppliance(AuntId, id);
	}

	@RequestMapping("/updateAuntCertificate")
	@ResponseBody
	public Object updateAuntCertificate(long AuntId, long[] id)
			throws Exception {
		return aService.updateAuntCertificate(AuntId, id);
	}

	@RequestMapping("/updateAuntJob")
	@ResponseBody
	public Object updateAuntJob(long AuntId, long[] id) throws Exception {
		return aService.updateAuntJob(AuntId, id);
	}

	@RequestMapping("/updateAuntContact")
	@ResponseBody
	public Object updateAuntContact(long AuntId, AuntContactForm c)
			throws Exception {
		return aService.updateAuntContact(AuntId, c);
	}

	@RequestMapping("/updataAuntWork")
	@ResponseBody
	public Object updataAuntWork(long AuntId, AuntWorkForm w) throws Exception {
		return aService.updataAuntWork(AuntId, w);
	}

	@RequestMapping("/updateAuntPhoto")
	@ResponseBody
	public Object updateAuntPhoto(HttpServletRequest request, long AuntId,
			@RequestParam("file") CommonsMultipartFile file) throws Exception {
		return aService.updateAuntPhoto(request, AuntId, file);
	}

	@RequestMapping("/getAuntById")
	@ResponseBody
	public Object getAuntById(Long id) throws Exception {
		return aService.getAuntById(id);
	}

	@RequestMapping("/getAuntListByStatus")
	@ResponseBody
	public Object getAuntListByStatus(HttpSession session, Integer status,
			Integer start, Integer limit, Long userId) throws Exception {
		return aService.getAuntListByStatus(session, status, start, limit,
				userId);
	}

	@RequestMapping("/updateAuntStauts")
	@ResponseBody
	public Object updateAuntStauts(Long AuntId, Integer status)throws Exception{
		return aService.updateAuntStauts(AuntId, status);
	}
}
