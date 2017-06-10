package org.tool;

import javax.servlet.http.HttpSession;

import org.model.Staff;
import org.model.User;
/**
 * 1.员工登录时，获取其上级的user的id号
 * @author Administrator
 *
 */
public class GetUserId {
	public static long getUserId(HttpSession session) {
		// 1.当前登录者为user下的staff
		long uId = 0;
		if (session.getAttribute("staff") != null) {
			// 取出staff所属的userId
			Staff st = (Staff) session.getAttribute("staff");
			uId = st.getUserId();
			return uId;
		} else if (session.getAttribute("user") != null) {
			// 取出当前用户的id
			User u = (User) session.getAttribute("user");
			uId = u.getId();
			return uId;
		} else {
			return -999;
		}
	}
}
