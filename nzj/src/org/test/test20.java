package org.test;

import org.dao.UserDao;
import org.dao.imp.UserDaoImp;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class test20 {
	public static void main(String[] args) throws JsonProcessingException {
		UserDao uDao = new UserDaoImp();
		System.out.println(new ObjectMapper().writeValueAsString(uDao.getUserListByRank(null, null,2)));
		System.out.println(uDao.getRankCount(2));
	}
}
