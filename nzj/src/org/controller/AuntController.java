package org.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.Form.AuntContactForm;
import org.Form.AuntSkillsForm;
import org.Form.AuntWorkForm;
import org.model.Aunt;
import org.service.AuntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import sun.print.resources.serviceui;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	public Object updateAuntPhoto(HttpServletRequest request, Long AuntId,
			String image) throws Exception {
		return aService.updateAuntPhoto(request, AuntId, image);
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
	public Object updateAuntStauts(Long AuntId, Integer status)
			throws Exception {
		return aService.updateAuntStauts(AuntId, status);
	}

	@RequestMapping("/getAuntListByIdStatus")
	@ResponseBody
	public Object getAuntListByIdStatus(Integer start, Integer limit,
			Long userId, Integer status) {
		return aService.getAuntListByIdStatus(start, limit, userId, status);
	}

	@RequestMapping("/updateAuntSkills")
	@ResponseBody
	public Object updateAuntSkills(Long auntid,
			@RequestParam("laId[]") List<Long> laId,
			@RequestParam("coId[]") List<Long> coId,
			@RequestParam("apId[]") List<Long> apId,
			@RequestParam("skId[]") List<Long> skId,
			@RequestParam("ceId[]") List<Long> ceId,
			@RequestParam("joId[]") List<Long> joId) throws IOException {
		System.out.println("阿姨的id;" + auntid +  "语言;" + laId + "厨艺；" + coId + "电器：" + apId + "特长；" + skId + "证件：" +  ceId + "岗位" + joId);
		return aService.updateAuntSkills(auntid, (Long[]) laId.toArray(new Long[laId.size()]),
				(Long[]) coId.toArray(new Long[coId.size()]), (Long[]) skId.toArray(new Long[skId.size()]),
				(Long[]) apId.toArray(new Long[apId.size()]), (Long[]) ceId.toArray(new Long[ceId.size()]),
				(Long[]) joId.toArray(new Long[joId.size()]));
	}
	
	@RequestMapping("/addContact")
	@ResponseBody
	public Object addContact(long AuntId,
			@RequestParam("cname[]") List<String> cname,    
			@RequestParam("relation[]") List<String> relation,   
			@RequestParam("workstatus[]") List<String> workstatus,    
			@RequestParam("cphone[]") List<String> cphone) throws JsonProcessingException {
		AuntContactForm c = new AuntContactForm();
		c.setCname((String[]) cname.toArray(new String[cname.size()]));
		c.setRelation((String[]) relation.toArray(new String[relation.size()]));
		c.setWorkstatus((String[]) workstatus.toArray(new String[workstatus.size()]));
		c.setCphone((String[]) cphone.toArray(new String[cphone.size()]));
		return aService.addContact(AuntId, c);
	}
	
	@RequestMapping("/deleteContact")
	@ResponseBody
	public Object deleteContact(long id) {
		return aService.deleteContact(id);
	}
	
	@RequestMapping("/addWork")
	@ResponseBody
	public Object addWork(long AuntId, 
			@RequestParam("time[]") List<String> time,
			@RequestParam("work[]") List<String> work ) {
		AuntWorkForm w = new AuntWorkForm();
		w.setTime((String[]) time.toArray(new String[time.size()]));
		w.setWork((String[]) work.toArray(new String[work.size()]));
		return aService.addWork(AuntId, w);
	}
	
	@RequestMapping("/deleteWork")
	@ResponseBody
	public Object deleteWork(long id) {
		return aService.deleteWork(id);
	}
}