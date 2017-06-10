package org.service.imp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.Form.AuntContactForm;
import org.Form.AuntWorkForm;
import org.dao.ApplianceDao;
import org.dao.AuntContactDao;
import org.dao.AuntDao;
import org.dao.AuntPhotoDao;
import org.dao.AuntWorkDao;
import org.dao.CertificateDao;
import org.dao.CookingDao;
import org.dao.JobDao;
import org.dao.LanguageDao;
import org.dao.SkillDao;
import org.model.Aunt;
import org.model.AuntContact;
import org.model.AuntWork;
import org.model.User;
import org.service.AuntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.tool.GetUserId;
import org.tool.JsonObject;
import org.tool.readProperties;
import org.view.VAuntId;

@Service
public class AuntServiceImp implements AuntService {
	@Autowired
	private AuntDao aDao;

	@Autowired
	private LanguageDao lDao;
	@Autowired
	private ApplianceDao apDao;
	@Autowired
	private CookingDao cDao;
	@Autowired
	private SkillDao sDao;
	@Autowired
	private CertificateDao ceDao;
	@Autowired
	private JobDao jDao;
	@Autowired
	private AuntContactDao acDao;
	@Autowired
	private AuntWorkDao awDao;
	@Autowired
	private AuntPhotoDao aphDao;

	@Override
	public Object addAunt(HttpSession session, HttpServletRequest request,
			Aunt a, Long[] languageId, Long[] cookingId, Long[] skillId,
			Long[] applianceId, Long[] certificateId, Long[] jobId,
			AuntContactForm c, AuntWorkForm w,
			@RequestParam("file") CommonsMultipartFile file)
			throws IllegalStateException, IOException {

//		User u = (User) session.getAttribute("user");
		Long userId = GetUserId.getUserId(session);
		if (userId != null) {
			if (aDao.getAunt(a.getIdnumber()) != null) { // 验证是否重复插入阿姨，根据身份证号判断
				return JsonObject.getResult(-2, "此身份证已用，请核实", false);
			}

			String photoName = file.getOriginalFilename();
			// String path = request.getRealPath("/"); // 项目路径
			if (photoName.equals("")) {
				return JsonObject.getResult(0, "图片不能为空", false);
			}

			photoName = new Date().getTime() / 1000 + "_"
					+ new Random().nextInt(10)
					+ photoName.substring(photoName.indexOf("."));

			String rPath = request.getSession().getServletContext()
					.getRealPath("/"); // 项目根目录 ...\nzj\

			String upDir = "upload" + File.separator + "aunt_photo";

			String path = rPath + upDir; // 图片保存的完整目录

			// System.out.println("保存目录目录：" + path);
			// System.out.println("保存文件夹：" + upDir);
			// System.out.println("上传文件名字：" + photoName);

			File dir = new File(path);
			if (!dir.exists() && !dir.isDirectory()) { // 路径不存在则创建
				dir.mkdirs();
			}
			String fPath = path + File.separator + photoName; // 文件最终路径
			String url = new readProperties().getP("server")
					+ "upload/aunt_photo/" + photoName; // 保存的url
			// System.out.println("url:" + url);

			File f = new File(fPath);
			file.transferTo(f);
			// -----------------------文件传输完成------------------------

			a.setUserId(userId); // 将阿姨所属的加盟商给添加进去
			a.setStatus(0); // 初始化阿姨的状态为待岗
			boolean bb = aDao.addAunt(a, languageId, cookingId, skillId,
					applianceId, certificateId, jobId, c, w, url);
			if (bb) { // 添加阿姨
				return JsonObject.getResult(1, "添加阿姨成功", true);
			} else {
				return JsonObject.getResult(-1, "添加阿姨失败", false);
			}
		} else {
			return JsonObject.getResult(-999, "请先登录，才能添加阿姨", false);
		}
	}

	@Override
	public Object deleteAunt(long id) {
		if (aDao.deleteAunt(id))
			return JsonObject.getResult(1, "删除阿姨成功", true);
		else
			return JsonObject.getResult(0, "删除阿姨失败", false);
	}

	@Override
	public Object getAuntList(HttpSession session, Integer start, Integer limit) {
//		User u = (User) session.getAttribute("user");
		Long userId = GetUserId.getUserId(session);
		if (userId != null) {
			List<VAuntId> li = aDao.getAuntList(start, limit, userId);
			Long count = aDao.getAuntCount(userId);

			Map<String, Object> map = new HashMap<String, Object>();
			map.put("result", li);
			map.put("count", count);
			return JsonObject.getResult(1, "阿姨列表", map);
		} else {
			return JsonObject.getResult(-999, "请先登录，才能获取阿姨列表", false);
		}
	}

	@Override
	public Object updateAunt(Aunt a) {
		if (aDao.updateAunt(a))
			return JsonObject.getResult(1, "修改阿姨基本信息成功", true);
		else
			return JsonObject.getResult(0, "修改阿姨基本信息失败", false);
	}

	@Override
	public Object updateAuntLanguage(long AuntId, long[] laId) {
		if (lDao.updateLanguageByAuntId(AuntId, laId))
			return JsonObject.getResult(1, "修改阿姨语言成功", true);
		else
			return JsonObject.getResult(0, "修改阿姨语言失败", false);
	}

	@Override
	public Object updateAuntCooking(long AuntId, long[] coId) {
		if (cDao.updateCookingByAuntId(AuntId, coId))
			return JsonObject.getResult(1, "修改阿姨烹饪技能成功", true);
		else
			return JsonObject.getResult(0, "修改阿姨烹饪技能失败", false);
	}

	@Override
	public Object updateAuntSkill(long AuntId, long[] skId) {
		if (sDao.updateSkillByAuntId(AuntId, skId))
			return JsonObject.getResult(1, "修改阿姨基本技能成功", true);
		else
			return JsonObject.getResult(0, "修改阿姨基本技能失败", false);
	}

	@Override
	public Object updateAuntAppliance(long AuntId, long[] apId) {
		if (apDao.updateApplianceByAuntId(AuntId, apId))
			return JsonObject.getResult(1, "修改阿姨家电技能成功", true);
		else
			return JsonObject.getResult(0, "修改阿姨家电技能失败", false);
	}

	@Override
	public Object updateAuntCertificate(long AuntId, long[] ceId) {
		if (ceDao.updateCertificateByAuntId(AuntId, ceId))
			return JsonObject.getResult(1, "修改阿姨证书成功", true);
		else
			return JsonObject.getResult(0, "修改阿姨证书失败", false);
	}

	@Override
	public Object updateAuntJob(long AuntId, long[] joId) {
		if (jDao.updateJobByAuntId(AuntId, joId))
			return JsonObject.getResult(1, "修改阿姨岗位成功", true);
		else
			return JsonObject.getResult(0, "修改阿姨岗位失败", false);
	}

	@Override
	public Object updateAuntContact(long AuntId, AuntContactForm c) {
		if (acDao.updateContactByAuntId(AuntId, c))
			return JsonObject.getResult(1, "修改阿姨紧急联系人成功", true);
		else
			return JsonObject.getResult(0, "修改阿姨紧急联系人失败", false);
	}

	@Override
	public Object updataAuntWork(long AuntId, AuntWorkForm w) {
		if (awDao.updateWorkByAuntId(AuntId, w))
			return JsonObject.getResult(1, "修改阿姨工作经历成功", true);
		else
			return JsonObject.getResult(0, "修改阿姨工作经历失败", false);
	}

	@Override
	public Object updateAuntPhoto(HttpServletRequest request, long AuntId,
			@RequestParam("file") CommonsMultipartFile file)
			throws IllegalStateException, IOException {

		String photoName = file.getOriginalFilename();

		photoName = new Date().getTime() / 1000 + "_"
				+ new Random().nextInt(10)
				+ photoName.substring(photoName.indexOf("."));

		String rPath = request.getSession().getServletContext()
				.getRealPath("/"); // 项目根目录 ...\nzj\

		String upDir = "upload" + File.separator + "aunt_photo";

		String path = rPath + upDir; // 图片保存的完整目录

		// System.out.println("保存目录目录：" + path);
		// System.out.println("保存文件夹：" + upDir);
		// System.out.println("上传文件名字：" + photoName);

		File dir = new File(path);
		if (!dir.exists() && !dir.isDirectory()) { // 路径不存在则创建
			dir.mkdirs();
		}
		String fPath = path + File.separator + photoName; // 文件最终路径
		String url = new readProperties().getP("server") + "upload/aunt_photo/"
				+ photoName; // 保存的url
		// System.out.println("url:" + url);

		File f = new File(fPath);
		file.transferTo(f);
		// ------------------------图片上传完成-----------------------------

		if (aphDao.updatePhotoByAuntId(AuntId, url))
			return JsonObject.getResult(1, "修改阿姨工作经历成功", true);
		else
			return JsonObject.getResult(0, "修改阿姨工作经历失败", false);
	}

	@Override
	public Object getAuntById(Long id) {
		VAuntId v = aDao.getAuntById(id);
		if (v == null)
			return JsonObject.getResult(0, "阿姨id不合法", false);
		Map<String, Object> aMap = new HashMap();
		Long aid = v.getId();
		aMap.put("id", aid);
		aMap.put("name", v.getName());
		aMap.put("age", v.getAge());
		aMap.put("sign", v.getSign());
		aMap.put("native", v.getNative_());
		aMap.put("sex", v.getSex());
		aMap.put("education", v.getEducation());
		aMap.put("marriage", v.getMarriage());
		aMap.put("nation", v.getNation());
		aMap.put("height", v.getHeight());
		aMap.put("weight", v.getWeight());
		aMap.put("sigh", v.getSigh());
		aMap.put("idnumber", v.getIdnumber());
		aMap.put("phone", v.getPhone());
		aMap.put("address", v.getAddress());
		aMap.put("url", v.getUrl()); // 照片通过视图组合进来了，不需要像下面一下添加
		aMap.put("userId", v.getUserId());

		aMap.put("language", lDao.getLanguageByAuntId(aid));
		aMap.put("cooking", cDao.getCookingByAuntId(aid));
		aMap.put("skill", sDao.getSkillByAuntId(aid));
		aMap.put("appliance", apDao.getApplianceByAuntId(aid));
		aMap.put("certificate", ceDao.getCertificateByAuntId(aid));
		aMap.put("job", jDao.getJobByAuntId(aid));

		aMap.put("contact", acDao.getContactByAuntId(aid));
		aMap.put("work", awDao.getWorkByAuntId(aid));

		return JsonObject.getResult(1, "阿姨信息", aMap);
	}

	@Override
	public Object getAuntListByStatus(HttpSession session, Integer status,
			Integer start, Integer limit, Long userId) {
//		User u = (User) session.getAttribute("user");
		Long userId1 = GetUserId.getUserId(session);
		if (userId1 != null) {
			List<VAuntId> li = aDao.getAuntList(start, limit, userId1);
			Long count = aDao.getAuntCount(userId1);

			Map<String, Object> map = new HashMap<String, Object>();
			map.put("result", li);
			map.put("count", count);
			return JsonObject.getResult(1, "阿姨列表", map);
		} else {
			return JsonObject.getResult(-999, "请先登录，才能获取阿姨列表", false);
		}
	}

	@Override
	public Object updateAuntStauts(Long AuntId, Integer status) {
		if(aDao.updateAuntStatus(AuntId, status))
			return JsonObject.getResult(1, "修改阿姨状态成功", true);
		else
			return JsonObject.getResult(0, "修改阿姨状态失败", false);
	}

}
