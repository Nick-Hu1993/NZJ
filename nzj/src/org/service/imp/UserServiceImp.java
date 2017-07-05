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

import org.dao.StaffDao;
import org.dao.UserCheckDao;
import org.dao.UserDao;
import org.dao.UserDetailDao;
import org.dao.UserLinkDao;
import org.model.Staff;
import org.model.User;
import org.model.UserCheck;
import org.model.UserDetail;
import org.model.UserLink;
import org.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.tool.GetUserId;
import org.tool.JsonObject;
import org.tool.SendPost;
import org.tool.readProperties;
import org.view.VUser;
import org.view.VUserId;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserDao uDao;
	@Autowired
	private UserDetailDao udDao;
	@Autowired
	private UserLinkDao ulDao;
	@Autowired
	private UserCheckDao ucDao;
	
	@Autowired
	private StaffDao sDao;

	public Object register(HttpSession session, User u, Integer code) {
		System.out.println("	code: " + code);
		int s_code = (int) session.getAttribute("code");
		if (s_code != code) {
			return JsonObject.getResult(0, "验证码错误", false);
		} else {
			if (uDao.getUser(u.getPhone()) != null) {
				return JsonObject.getResult(-1, "该手机已注册", false);
			} else {
				u.setAck(0);
				u.setClock(new Date().getTime() / 1000);
				u.setRank(-1);
				long id = uDao.addUser(u);
				u.setId(id);
				u.setPassword("******");
				session.setAttribute("user", u); // 用于前往完善用户信息界面，保留session
				if (id != -1) {
					return JsonObject.getResult(1, "注册成功", id);
				} else
					return JsonObject.getResult(-2, "注册失败", false);
			}
		}
	}

	@Override
	public Object login(HttpSession session, Long phone, String password) {
		session.removeAttribute("staff"); // 清除员工缓存，防止同时有user和staff登录
		User u = uDao.getUser(phone, password);
		if (u != null) {
			if (u.getAck() != 1) { // 判断账号是否通过审核，没有的话等待审核，或修改用户信息
				u.setPassword("******");
				session.setAttribute("user", u); // 用于前往审核进度页面，保留一个id
				return JsonObject.getResult(-1, "该账号尚未通过审核", u.getId());
			} else { // 已通过审核
				u.setPassword("******");
				session.setAttribute("user", u);
				return JsonObject.getResult(1, "success", true);
			}
		} else
			return JsonObject.getResult(0, "用户名或密码错误", false);
	}

	@Override
	public Object getSession(HttpSession session) {
		User u = (User) session.getAttribute("user");
		Staff s = (Staff) session.getAttribute("staff");
		if (u != null && s == null) { // 说明是user登录
			return JsonObject.getResult(1, "用户 session", u);
		} else if (u == null && s != null) { // 说明是staff登录
			return JsonObject.getResult(2, "员工 session", s);
		} else if (u == null && s == null) { // 游客登录
			return JsonObject.getResult(0, "无（游客） session", null);
		} else {
			System.out.println("	异常，同时有user和staff的缓存");
			return JsonObject.getResult(-1, "getSession error", null);
		}
	}

	@Override
	public Object getValidateCode(HttpSession session, Long phone) {
		try {
			System.out.println("	phone: " + phone);

			String templateId = "2de5152421cd4a4cb628370e74b27e3b"; // 短信模板
			int code = (int) ((Math.random() * 9 + 1) * 100000); // 6位短信验证码
			System.out.println("	code: " + code);

			session.setAttribute("code", code); // 保存到session中用于验证

			String url = "http://v1.avatardata.cn/Sms/Send?key=2d7bce4f548d4a75864ee4ffa86d443e"; // 短信服务url

			String param = "&mobile=" + phone + "&" + "templateId="
					+ templateId + "&param=" + code;

			String result = new SendPost().sendPost(url, param);
			System.out.println("	result: " + result);

			ObjectMapper mapper = new ObjectMapper();
			JsonNode node = mapper.readTree(result);

			if (node.get("error_code").toString().equals("0"))
				return JsonObject.getResult(1, "发送成功，等待接收", true);
			else
				return JsonObject.getResult(0, "参数有误，请检查", false);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return JsonObject.getResult(0, "JsonProcessingException异常，请检查",
					false);
		} catch (IOException e) {
			e.printStackTrace();
			return JsonObject.getResult(0, "IOException异常，请检查", false);
		}
	}

	@Override
	public Object addUserDetail(HttpServletRequest request, UserDetail ud,
			@RequestParam("file1") CommonsMultipartFile file1,
			@RequestParam("file2") CommonsMultipartFile file2)
			throws IllegalStateException, IOException {
		if (udDao.getUserDetail(ud.getUsername()) == null) {
			String cUrl = "";
			String iUrl = "";

			String f1Name = file1.getOriginalFilename();
			String f2Name = file2.getOriginalFilename();

			String rPath = request.getSession().getServletContext()
					.getRealPath("/"); // 项目根目录 ...\nzj\

			if (!f1Name.equals("")) {
				f1Name = new Date().getTime() / 1000 + "_"
						+ new Random().nextInt(10)
						+ f1Name.substring(f1Name.indexOf("."));

				String upDir1 = "upload" + File.separator + "user_idcard"; // 文件夹名
				String path1 = rPath + upDir1; // 图片保存的完整目录

				File dir1 = new File(path1);
				if (!dir1.exists() && !dir1.isDirectory()) { // 路径不存在则创建
					dir1.mkdirs();
				}
				String fPath1 = path1 + File.separator + f1Name; // 文件最终路径
				String url1 = new readProperties().getP("server")
						+ "upload/user_idcard/" + f1Name; // 保存的url

				File f1 = new File(fPath1);
				file1.transferTo(f1);

				cUrl = url1;
			}
			if (!f2Name.equals("")) {
				f2Name = new Date().getTime() / 1000 + "_"
						+ new Random().nextInt(10)
						+ f2Name.substring(f2Name.indexOf("."));

				String upDir2 = "upload" + File.separator + "user_charter"; // 文件夹名
				String path2 = rPath + upDir2; // 图片保存的完整目录

				File dir2 = new File(path2);
				if (!dir2.exists() && !dir2.isDirectory()) { // 路径不存在则创建
					dir2.mkdirs();
				}
				String fPath2 = path2 + File.separator + f2Name; // 文件最终路径
				String url2 = new readProperties().getP("server")
						+ "upload/user_charter/" + f2Name; // 保存的url

				File f2 = new File(fPath2);
				file2.transferTo(f2);

				iUrl = url2;
			}
			ud.setSupport(0);
			ud.setCharterurl(cUrl);
			ud.setIdcardurl(iUrl);
			if (udDao.addUserDetail(ud) != -1) {
				long uid = ud.getUserId();
				ucDao.addUserCheck(new UserCheck(uid, -1, "未审核"));
				return JsonObject.getResult(1, "添加详细信息成功", true);
			} else {
				return JsonObject.getResult(0, "添加详细信息失败", false);
			}
		} else {
			return JsonObject.getResult(-1, "用户名已使用", false);
		}
	}

	@Override
	public Object updateUserDetail(HttpServletRequest request, UserDetail ud,
			@RequestParam("file1") CommonsMultipartFile file1,
			@RequestParam("file2") CommonsMultipartFile file2)
			throws IllegalStateException, IOException {

		String cUrl = "";
		String iUrl = "";

		String f1Name = file1.getOriginalFilename();
		String f2Name = file2.getOriginalFilename();

		String rPath = request.getSession().getServletContext()
				.getRealPath("/"); // 项目根目录 ...\nzj\

		if (!f1Name.equals("")) {
			f1Name = new Date().getTime() / 1000 + "_"
					+ new Random().nextInt(10)
					+ f1Name.substring(f1Name.indexOf("."));

			String upDir1 = "upload" + File.separator + "user_idcard"; // 文件夹名
			String path1 = rPath + upDir1; // 图片保存的完整目录

			File dir1 = new File(path1);
			if (!dir1.exists() && !dir1.isDirectory()) { // 路径不存在则创建
				dir1.mkdirs();
			}
			String fPath1 = path1 + File.separator + f1Name; // 文件最终路径
			String url1 = new readProperties().getP("server")
					+ "upload/user_idcard/" + f1Name; // 保存的url

			File f1 = new File(fPath1);
			file1.transferTo(f1);

			cUrl = url1;
		}
		if (!f2Name.equals("")) {
			f2Name = new Date().getTime() / 1000 + "_"
					+ new Random().nextInt(10)
					+ f2Name.substring(f2Name.indexOf("."));

			String upDir2 = "upload" + File.separator + "user_charter"; // 文件夹名
			String path2 = rPath + upDir2; // 图片保存的完整目录

			File dir2 = new File(path2);
			if (!dir2.exists() && !dir2.isDirectory()) { // 路径不存在则创建
				dir2.mkdirs();
			}
			String fPath2 = path2 + File.separator + f2Name; // 文件最终路径
			String url2 = new readProperties().getP("server")
					+ "upload/user_charter/" + f2Name; // 保存的url

			File f2 = new File(fPath2);
			file2.transferTo(f2);

			iUrl = url2;
		}
		if (cUrl == null)
			cUrl = " ";
		if (iUrl == null)
			iUrl = " ";
		ud.setCharterurl(cUrl);
		ud.setIdcardurl(iUrl);

		if (udDao.updateUserDetail(ud))
			return JsonObject.getResult(1, "修改详细信息成功", true);
		else
			return JsonObject.getResult(0, "修改详细信息失败", false);
	}

	@Override
	public Object getUser(HttpSession session) {
		User u = (User) session.getAttribute("user");
		Staff s = (Staff)session.getAttribute("staff");
		if (u != null) {
			VUserId v = uDao.getUserById(u.getId());
			return JsonObject.getResult(1, "获取当前用户信息", v);
		} else if (s != null) {
			Staff sDetail = sDao.getStaffById(s.getId());
			sDetail.setPassword("***********");
			return JsonObject.getResult(1, "获取当前用户信息", sDetail);
		}
		return JsonObject.getResult(-999, "请先登录", false);
	}

	@Override
	public Object updateUserPassword(HttpSession session, String oPwd,
			String nPwd) {
		User u = (User) session.getAttribute("user");
		if (u == null) {
			System.out.println("	updateUserPassword--未登录");
			return JsonObject.getResult(-999, "请先登录", false);
		}
		if (uDao.getUser(u.getPhone(), oPwd) != null) {
			if (uDao.updateUserPassword(u.getId(), nPwd))
				return JsonObject.getResult(1, "修改密码成功", true);
			else
				return JsonObject.getResult(-1, "修改密码失败", false);
		} else {
			return JsonObject.getResult(0, "密码错误", false);
		}
	}

	@Override
	public Object ackUser(Long id, Integer rank, Long pid) {
		if (uDao.updateUser(id, rank, 1)
				&& ulDao.addUserLink(new UserLink(pid, id)) != -1) {
			ucDao.updateUserCheck(id, 1, "审核通过");
			return JsonObject.getResult(1, "审核确认用户成功", true);
		} else
			return JsonObject.getResult(0, "审核确认用户失败", false);
	}

	@Override
	public Object getUnAckUserList(Integer start, Integer limit) {
		Map<String, Object> map = new HashMap<String, Object>();
		long count = uDao.getUnAckUserCount();
		List<VUserId> li = uDao.getUnAckUserList(start, limit);

		List list = new ArrayList<>();
		for (VUserId v : li) {
			Map<String, Object> uMap = new HashMap<String, Object>();
			long uid = v.getId();

			uMap.put("id", uid);
			uMap.put("phone", v.getPhone());
			uMap.put("time", v.getTime());
			uMap.put("username", v.getUsername());
			uMap.put("company", v.getCompany());
			uMap.put("contact", v.getContact());
			uMap.put("telephone", v.getTelephone());
			uMap.put("dphone", v.getDphone());
			uMap.put("address", v.getAddress());
			uMap.put("charterurl", v.getCharterurl());
			uMap.put("idcardurl", v.getIdcardurl());

			UserCheck uc = ucDao.getUserCheck(uid);
			uMap.put("status", uc.getStatus());
			uMap.put("description", uc.getDescription());
			list.add(uMap);
		}

		map.put("count", count);
		map.put("result", list);

		return JsonObject.getResult(1, "获取未确认的用户列表", map);
	}

	@Override
	public Object checkUserDetail(Long userId) {
		System.out.println("	checkUserDetail:" + userId);
		if (udDao.getUserDetail(userId))
			return JsonObject.getResult(1, "已完善用户信息", true);
		else
			return JsonObject.getResult(0, "该用户尚未完善详细信息", false);
	}

	@Override
	public Object getUserCheckById(Long userId) {
		System.out.println("	getUserCheckById:" + userId);
		return JsonObject.getResult(1, "获取用户审核状态", ucDao.getUserCheck(userId));
	}

	@Override
	public Object getAckUserList(Integer start, Integer limit) {
		Map<String, Object> map = new HashMap<>();
		long count = uDao.getAckUserCount();
		map.put("count", count);
		map.put("result", uDao.getAckUserList(start, limit));
		return JsonObject.getResult(1, "获取已确认的用户列表", map);
	}

	@Override
	public Object updateUserCheck(Long userId, Integer status,
			String description) {
		if (ucDao.updateUserCheck(userId, status, description))
			return JsonObject.getResult(1, "修改用户审查信息成功", true);
		else
			return JsonObject.getResult(0, "修改用户审查信息失败", false);
	}

	@Override
	public Object getChildByParent(HttpSession session,Integer start, Integer limit, Long[] parent) {
		Map<String, Object> map = new HashMap<>();
		/*1.当前登录者为user下的staff
		long uId = new GetUserId().getUserId(session);*/
		List<VUser> li = ulDao.getChildByParent(start, limit, parent);
		map.put("UserlList", li);
		return JsonObject.getResult(1, "用户列表", map);
	}

	@Override
	public Object loginByAdmin(HttpSession session) {
		Long userId = GetUserId.getUserId(session);
		if (userId == null) {
			return JsonObject.getResult(-999, "登录已失效，请重新登录", false);
		}
		if (uDao.getRankByUserId(userId).equals(1)) {
			return JsonObject.getResult(1, "登录成功", true);
		} else {
			return JsonObject.getResult(-999, "仅管理员登录", false);
		}
	}

	@Override
	public Object ResetUserPassword(long id, String nPwd) {
		if (uDao.updateUserPassword(id, nPwd)) {
			return JsonObject.getResult(1, "重置用户密码成功", true);
		} else {
			return JsonObject.getResult(0, "重置用户密码失败", false);
		}
	}

	@Override
	public Object getUserListByRank(Integer start, Integer limit, Integer rank) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("UserList", uDao.getUserListByRank(start, limit, rank));
		map.put("count",uDao.getRankCount(rank));
		return JsonObject.getResult(1, "用户列表", map);
	}
}