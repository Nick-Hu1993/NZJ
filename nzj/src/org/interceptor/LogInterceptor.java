package org.interceptor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dao.LogDao;
import org.dao.imp.LogDaoImp;
import org.model.Log;
import org.model.Staff;
import org.model.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;

public class LogInterceptor implements HandlerInterceptor {

	/**
	 * Handler 执行前调用
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object arg2) throws Exception {
//		System.out.println("\n——preHandle——");

		String action = request.getServletPath().substring(1);		//请求的接口名
		System.out.println("\n"+request.getContextPath()+"——"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"——"+action);

		if(action.equals("sLogin")){
			String phone = request.getParameter("phone");
			
			LogDao lDao = new LogDaoImp();
			Log log = new Log(Long.parseLong(phone),action,new Date().getTime()/1000);
			lDao.addLog(log);
			return true;
		}else if(action.equals("login") || action.equals("register")){
			
			String phone = request.getParameter("phone");
			LogDao lDao = new LogDaoImp();
			Log log = new Log(Long.parseLong(phone),action,new Date().getTime()/1000);
			lDao.addLog(log);
			return true;
		}else{			//非登录类型日志
			User u = (User) request.getSession().getAttribute("user");
			Staff st = (Staff)request.getSession().getAttribute("staff");
			
			if(u!=null) {
				if(!action.equals("getLogList")){
					LogDao lDao = new LogDaoImp();
					Log log = new Log(u.getPhone(),action,new Date().getTime()/1000);
					lDao.addLog(log);
				}
				return true;
			}else if(st != null) {
				if(!action.equals("getLogList")){
					LogDao lDao = new LogDaoImp();
					Log log = new Log(st.getPhone(),action,new Date().getTime()/1000);
					lDao.addLog(log);
				}
				return true;
			}else{		//未登录
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("msg", "访问无效,请先登录");
				map.put("code", "-999");
				map.put("data", "http://localhost:8080/nzj/");

				ObjectMapper mapper = new ObjectMapper();
				String str = mapper.writeValueAsString(map);

				System.out.println("	访问无效,请先登录");

				response.setContentType("text/json;charset=UTF-8");
				response.setCharacterEncoding("UTF-8");
				response.getWriter().write(str);

				return false;
			}
		}
		
	}

	/**
	 * Handler 执行后，return 前调用
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// System.out.println("——postHandle——");.
	}

	/**
	 * Handler 执行后调用
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// System.out.println("——afterCompletion——");
	}

}
