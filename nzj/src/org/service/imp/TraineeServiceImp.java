package org.service.imp;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.dao.TraineeDao;
import org.model.Trainee;
import org.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.tool.ChangeTime;
import org.tool.GetUserId;
import org.tool.JsonObject;
import org.tool.readProperties;


@Service
public class TraineeServiceImp implements TraineeService {
	@Autowired
	private TraineeDao tDao;

	@Override
	public Object addTrainee(HttpSession session, HttpServletRequest request,
			Trainee t, String birthday1, CommonsMultipartFile file1, CommonsMultipartFile file2,
			CommonsMultipartFile file3, CommonsMultipartFile file4)
			throws IllegalStateException, IOException {
		Long userId = GetUserId.getUserId(session);
		if(userId==null){
			return JsonObject.getResult(-999, "请先登录，才能添加学员", false);
		}
		
		String f1Name = file1.getOriginalFilename();
		System.out.println(f1Name);
		String f2Name = file2.getOriginalFilename();
		String f3Name = file3.getOriginalFilename();
		String f4Name = file4.getOriginalFilename();
		//以文件名判定上传文件不可为空
		if (f1Name.equals("") || f2Name.equals("") || f3Name.equals("")
				|| f4Name.equals("")) {
			return JsonObject.getResult(0, "上传的内容不能有空", false);
		}

		f1Name = new Date().getTime() / 1000 + "_" + new Random().nextInt(10)
				+ f1Name.substring(f1Name.indexOf("."));

		f2Name = new Date().getTime() / 1000 + "_" + new Random().nextInt(10)
				+ f2Name.substring(f2Name.indexOf("."));

		f3Name = new Date().getTime() / 1000 + "_" + new Random().nextInt(10)
				+ f3Name.substring(f3Name.indexOf("."));

		f4Name = new Date().getTime() / 1000 + "_" + new Random().nextInt(10)
				+ f4Name.substring(f4Name.indexOf("."));

		String rPath = request.getSession().getServletContext()
				.getRealPath("/"); // 项目根目录 ...\nzj\
		System.out.println(rPath);
		String upDir = "upload" + File.separator + "order_trainee"; // 文件夹名
		String path = rPath + upDir; // 图片保存的完整目录

		File dir = new File(path);
		//如果目录不存在则创建
		if (!dir.exists() && !dir.isDirectory()) {
			dir.mkdirs();
		}
		//separator为当前系统的路径分隔符号
		String fPath1 = path + File.separator + f1Name; // 文件最终路径
		String fPath2 = path + File.separator + f2Name; // 文件最终路径
		String fPath3 = path + File.separator + f3Name; // 文件最终路径
		String fPath4 = path + File.separator + f4Name; // 文件最终路径

		String url1 = new readProperties().getP("server")
				+ "upload/order_trainee/" + f1Name; // 保存url
		String url2 = new readProperties().getP("server")
				+ "upload/order_trainee/" + f2Name; // 保存url
		String url3 = new readProperties().getP("server")
				+ "upload/order_trainee/" + f3Name; // 保存url
		String url4 = new readProperties().getP("server")
				+ "upload/order_trainee/" + f4Name; // 保存url

		File f1 = new File(fPath1);
		file1.transferTo(f1);

		File f2 = new File(fPath2);
		file2.transferTo(f2);

		File f3 = new File(fPath3);
		file3.transferTo(f3);

		File f4 = new File(fPath4);
		file4.transferTo(f4);

		t.setIdcardurl1(url1);//身份证正面
		t.setIdcardurl2(url2);//身份证背面
		t.setPhotourl(url3);//证件照
		t.setInfourl(url4);//简历
		
		t.setBirthday(Long.parseLong(ChangeTime.date2TimeStamp(birthday1, "yyyy-MM-dd")));//设置出生日期
		t.setBind(0); // 初始化绑定标志为0，表示未绑定订单
		t.setUserId(userId);	//绑定学员所属的用户
		if (tDao.addTrainee(t) != -1)
			return JsonObject.getResult(1, "添加学员成功", true);
		else
			return JsonObject.getResult(-1, "添加学员失败", false);
	}

	@Override
	public Object deleteTrainee(long[] id) {
		if (tDao.deleteTrainee(id)) {
			return JsonObject.getResult(1, "删除成功", true);
		} else {
			return JsonObject.getResult(0, "删除失败", false);
		}
	}

	@Override
	public Object updateTrainee(HttpSession session, HttpServletRequest request,
			Trainee t, String birthday1, @RequestParam("file1") CommonsMultipartFile file1,
			@RequestParam("file2") CommonsMultipartFile file2,
			@RequestParam("file3") CommonsMultipartFile file3,
			@RequestParam("file4") CommonsMultipartFile file4) throws IllegalStateException, IOException {
		Long userId = GetUserId.getUserId(session);
		if(userId==null){
			return JsonObject.getResult(-999, "请先登录，才能修改学员信息", false);
		}
		
		//获取文件的名字
		String f1Name = file1.getOriginalFilename();
		String f2Name = file2.getOriginalFilename();
		String f3Name = file3.getOriginalFilename();
		String f4Name = file4.getOriginalFilename();
		//以文件名判定上传文件不可为空
		if (f1Name.equals("") || f2Name.equals("") || f3Name.equals("")
				|| f4Name.equals("")) {
			return JsonObject.getResult(0, "上传的内容不能有空", false);
		}

		f1Name = new Date().getTime() / 1000 + "_" + new Random().nextInt(10)
				+ f1Name.substring(f1Name.indexOf("."));

		f2Name = new Date().getTime() / 1000 + "_" + new Random().nextInt(10)
				+ f2Name.substring(f2Name.indexOf("."));

		f3Name = new Date().getTime() / 1000 + "_" + new Random().nextInt(10)
				+ f3Name.substring(f3Name.indexOf("."));

		f4Name = new Date().getTime() / 1000 + "_" + new Random().nextInt(10)
				+ f4Name.substring(f4Name.indexOf("."));

		String rPath = request.getSession().getServletContext()
				.getRealPath("/"); // 项目根目录 ...\nzj\
		System.out.println(rPath);
		String upDir = "upload" + File.separator + "order_trainee"; // 文件夹名
		String path = rPath + upDir; // 图片保存的完整目录

		File dir = new File(path);
		//如果目录不存在则创建
		if (!dir.exists() && !dir.isDirectory()) {
			dir.mkdirs();
		}
		//separator为当前系统的路径分隔符号
		String fPath1 = path + File.separator + f1Name; // 文件最终路径
		String fPath2 = path + File.separator + f2Name; // 文件最终路径
		String fPath3 = path + File.separator + f3Name; // 文件最终路径
		String fPath4 = path + File.separator + f4Name; // 文件最终路径

		String url1 = new readProperties().getP("server")
				+ "upload/order_trainee/" + f1Name; // 保存url
		String url2 = new readProperties().getP("server")
				+ "upload/order_trainee/" + f2Name; // 保存url
		String url3 = new readProperties().getP("server")
				+ "upload/order_trainee/" + f3Name; // 保存url
		String url4 = new readProperties().getP("server")
				+ "upload/order_trainee/" + f4Name; // 保存url

		File f1 = new File(fPath1);
		file1.transferTo(f1);

		File f2 = new File(fPath2);
		file2.transferTo(f2);

		File f3 = new File(fPath3);
		file3.transferTo(f3);

		File f4 = new File(fPath4);
		file4.transferTo(f4);

		t.setIdcardurl1(url1);//身份证正面
		t.setIdcardurl2(url2);//身份证背面
		t.setPhotourl(url3);//证件照
		t.setInfourl(url4);//简历
		
		t.setBirthday(Long.parseLong(ChangeTime.date2TimeStamp(birthday1, "yyyy-MM-dd")));//设置时间戳
		t.setUserId(userId);
		if (tDao.updateTrainee(t)) {
			return JsonObject.getResult(1, "修改成功", true);
		} else {
			return JsonObject.getResult(0, "修改失败", false);
		}
	}

	@Override
	public Object updateTraineePay(long id, Integer pay) {
	if (tDao.updateTraineePay(id, pay)) {
		return JsonObject.getResult(1, "修改成功", true);
	} else {
		return JsonObject.getResult(0, "修改失败", false);
		}
	}

	@Override
	public Object getTraineesListByPay(HttpSession session,Integer start, Integer limit,
			Integer pay) {
		Long userId = GetUserId.getUserId(session);
		if (userId != null) {
			List<Trainee> li = tDao.getTraineesListByPay(start, limit, pay, userId);
			long count = tDao.getCountByPay(pay, userId);
			Map<String , Object> map = new HashMap<String, Object>();
			map.put("TraineeList", li);
			map.put("count", count);
			return JsonObject.getResult(1, "学员列表", map);
		} else {
			return JsonObject.getResult(-999, "请先登录", false);
		}
	}

	@Override
	public Object getTraineeListByBind(HttpSession session, Integer start, Integer limit,
			Integer bind) {
		Long userId = GetUserId.getUserId(session);
		if (userId != null) {
			List<Trainee> li = tDao.getTraineeListByBind(start, limit, bind, userId);
			long count = tDao.getCountByBind(bind, userId);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("TraineeList", li);
			map.put("count", count);
			return JsonObject.getResult(1, "学员列表", map);
 		} else {
			return JsonObject.getResult(-999, "请先登录", false);
		}
	}

	@Override
	public Object getTraineeList (HttpSession session, Integer start,
			Integer limit) {
		Long userId = GetUserId.getUserId(session);
		if (userId != null) {
			List<Trainee> li = tDao.getTraineeById(start, limit, userId);
			long count = tDao.getCountById(userId);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("TraineeList", li);
			map.put("count", count);
			return JsonObject.getResult(1, "学员列表", map);
		} else {
			return JsonObject.getResult(0, "请先登录", false);
		}
	}

	@Override
	public Object getTraineeListById (Long userId, Integer start, Integer limit) {
			List<Trainee> li = tDao.getTraineeById(start, limit, userId);
			long count = tDao.getCount();
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("TraineeList", li);
			map.put("count", count);
			return JsonObject.getResult(1, "所有学员", map);
	}

	@Override
	public Object getTraineeByBindAndPay(HttpSession session ,Integer start, Integer limit,
			Integer bind, Integer pay) {
		if (tDao.getTraineeByBindAndPay(start, limit, bind, pay,GetUserId.getUserId(session)) != null) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("TraineeList", tDao.getTraineeByBindAndPay(start, limit, bind, pay,GetUserId.getUserId(session)));
			return JsonObject.getResult(1, "学员列表", map);
		} else {
			return JsonObject.getResult(0, "学员列表", false);
		}
	}

}
