package org.service.imp;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.dao.ModuleDao;
import org.dao.StaffDao;
import org.model.Staff;
import org.model.User;
import org.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.tool.GetUserId;
import org.tool.JsonObject;
import org.tool.readProperties;

@Service
public class StaffServiceImp implements StaffService {
	@Autowired
	private StaffDao sDao;
	
	@Autowired
	private ModuleDao mDao;

	@Override
	public Object addStaff(HttpSession session, HttpServletRequest request,
			Staff o, @RequestParam("file") CommonsMultipartFile file, Long[] mid)
			throws IllegalStateException, IOException {

		User u = (User) session.getAttribute("user");
		if (u != null) {
			if (sDao.getStaff(o.getPhone()) != null) {
				return JsonObject.getResult(-1, "此电话已用，请勿重复添加", false);
			}

			String photoName = file.getOriginalFilename();
			if (photoName.equals("")) {
				return JsonObject.getResult(-2, "照片不能为空", false);
			}

			if (mid == null) { // 没有分配权限
				return JsonObject.getResult(-4, "至少分配一种权限", false);
			}

			photoName = new Date().getTime() / 1000 + "_"
					+ new Random().nextInt(10)
					+ photoName.substring(photoName.indexOf("."));

			String rPath = request.getSession().getServletContext()
					.getRealPath("/"); // 项目根目录 ...\nzj\

			String upDir = "upload" + File.separator + "staff_photo";

			String path = rPath + upDir; // 图片保存的完整目录

			File dir = new File(path);
			if (!dir.exists() && !dir.isDirectory()) { // 路径不存在则创建
				dir.mkdirs();
			}
			String fPath = path + File.separator + photoName; // 文件最终路径
			String url = new readProperties().getP("server")
					+ "upload/staff_photo/" + photoName; // 保存的url
			// System.out.println("url:" + url);

			File f = new File(fPath);
			file.transferTo(f);
			// -----------------------文件传输完成------------------------

			if (o.getAddress() == null)
				o.setAddress("");

			o.setTime(new Date().getTime() / 1000);
			o.setPhotourl(url);
			o.setUserId(u.getId());

			if (sDao.addStaff(o, mid) != -1)
				return JsonObject.getResult(1, "添加员工成功", true);
			else
				return JsonObject.getResult(-3, "添加员工失败", false);
		} else {
			return JsonObject.getResult(0, "用户登录，才能添加员工", false);
		}
	}

	@Override
	public Object deleteStaff(HttpSession session, HttpServletRequest request,
			Long id) {
		String url = sDao.getStaffPhotourlById(id);

		String rPath = request.getSession().getServletContext()
				.getRealPath("/");

		String upDir = "upload" + File.separator + "staff_photo"
				+ File.separator;

		if (url != null) {
			File folder = new File(rPath + upDir);
			if (folder.exists()) {
				File[] files = folder.listFiles();
				for (File f : files) {
//					System.out.println(f.getName());
					if (url.contains(f.getName())) {
						System.out.println("	删除：" + f.getName());
						f.delete();
					}
				}
			}
		}
		// return null;
		if (sDao.deleteStaff(id))
			return JsonObject.getResult(1, "删除员工成功", true);
		else
			return JsonObject.getResult(0, "删除员工失败", false);
	}

	@Override
	public Object getStaffList(HttpSession session, Integer start, Integer limit) {
//		User u = (User) session.getAttribute("user");
		Long userId = GetUserId.getUserId(session);
		if (userId != null) {
			List li = sDao.getStaffList(userId, start, limit);
			long count = sDao.getStaffCount(userId);

			Map<String, Object> map = new HashMap<String, Object>();
			map.put("count", count);
			map.put("result", li);

			return JsonObject.getResult(1, "获取员工列表", map);
		} else {
			return JsonObject.getResult(0, "请先登录，才能获取员工列表", false);
		}
	}

	@Override
	public Object sLogin(HttpSession session, Long phone, String password) {
		session.removeAttribute("user"); // 清除用户缓存，防止同时有user和员工登录
		Staff s = sDao.getStaff(phone, password);
		if (s != null) {
			s.setPassword("******");
			session.setAttribute("staff", s);
			List authority = mDao.getModuleListByStaffId(s.getId());
			session.setAttribute("authority", authority);
			System.out.println("当前员工的权限是：" + session.getAttribute("authority"));
			return JsonObject.getResult(1, "员工登录成功", true);
		} else {
			return JsonObject.getResult(0, "电话或密码错误", false);
		}
	}

	@Override
	public Object getAllStaffList(Integer start, Integer limit) {
		List li = sDao.getAllStaffList(start, limit);
		long count = sDao.getAllStaffCount();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("count", count);
		map.put("result", li);

		return JsonObject.getResult(1, "获取全部员工列表", map);
	}

	@Override
	public Object getStaffById(HttpSession session) {
		Staff s = (Staff) session.getAttribute("staff");
		if (s != null) {
			Staff staff = sDao.getStaffById(s.getId());
			return JsonObject.getResult(1, "员工信息", staff);
		} else {
			return JsonObject.getResult(0, "请先通过员工登录", false);
		}
	}

	@Override
	public Object updateStaff(HttpSession session, String name, String address,
			String job) {
		Staff s = (Staff) session.getAttribute("staff");
		if (s != null) {
			if (sDao.updateStaff(s.getId(), name, address, job))
				return JsonObject.getResult(1, "修改员工基本信息成功", true);
			else
				return JsonObject.getResult(-1, "修改员工基本信息失败", false);
		} else {
			return JsonObject.getResult(0, "请先通过员工登录,才能修改员工信息", false);
		}
	}

	@Override
	public Object updateStaffPassword(HttpSession session, String oPwd,
			String nPwd) {
		Staff s = (Staff) session.getAttribute("staff");
		if (s == null) {
			return JsonObject.getResult(0, "请先通过员工登录,才能修改员工密码", false);
		}

		if (sDao.getStaff(s.getPhone(), oPwd) != null) {
			if (sDao.updateStaffPassword(s.getId(), nPwd))
				return JsonObject.getResult(1, "修改员工密码成功", true);
			else
				return JsonObject.getResult(-2, "修改员工密码失败", false);
		} else {
			return JsonObject.getResult(-1, "密码错误", false);
		}
	}

	@Override
	public Object updateStaffPhotourl(HttpSession session,
			HttpServletRequest request, CommonsMultipartFile file)
			throws IllegalStateException, IOException {

		Staff s = (Staff) session.getAttribute("staff");
		if (s == null) {
			return JsonObject.getResult(0, "请先通过员工登录,才能修改员工照片", false);
		}

		String photoName = file.getOriginalFilename();
		if (photoName.equals("")) {
			return JsonObject.getResult(-1, "照片不能为空", false);
		}

		photoName = new Date().getTime() / 1000 + "_"
				+ new Random().nextInt(10)
				+ photoName.substring(photoName.indexOf("."));

		String rPath = request.getSession().getServletContext()
				.getRealPath("/"); // 项目根目录 ...\nzj\

		String upDir = "upload" + File.separator + "staff_photo";

		String path = rPath + upDir; // 图片保存的完整目录

		File dir = new File(path);
		if (!dir.exists() && !dir.isDirectory()) { // 路径不存在则创建
			dir.mkdirs();
		}
		String fPath = path + File.separator + photoName; // 文件最终路径
		String url = new readProperties().getP("server")
				+ "upload/staff_photo/" + photoName; // 保存的url
		// System.out.println("url:" + url);

		File f = new File(fPath);
		file.transferTo(f);

		if (sDao.updateStaffPhotourl(s.getId(), url))
			return JsonObject.getResult(1, "修改员工照片成功", true);
		else
			return JsonObject.getResult(0, "修改员工照片失败", false);
	}

	@Override
	public Object getStaffAuthorityById(HttpSession session, Long id) {
		Staff sf = (Staff)session.getAttribute("staff");
		if (sf != null) {
			List<Long> li = (List<Long>)session.getAttribute("authority");
			if (li.contains(id)) {
				return JsonObject.getResult(1, "有权限", true);
			} else {
				return JsonObject.getResult(0, "无权限", false);
			}
		} else {
			return JsonObject.getResult(-999, "请登录", false);
		}
	}

	@Override
	public Object getStaffListById(Integer start, Integer limit, Long id) {
		List<Staff> sList = sDao.getStaffList(id, start, limit);
		Map<String , Object> map = new HashMap<String, Object>();
		map.put("staffList", sList);
		return JsonObject.getResult(1, "员工列表", map);
	}

	@Override
	public Object ResetStffPassword(Long sid, String nPwd) {
		if (sDao.updateStaffPassword(sid, nPwd)) {
			return JsonObject.getResult(1, "密码重置成功", true);
		} else {
			return JsonObject.getResult(0, "重置失败", false);
		}
	}

}
