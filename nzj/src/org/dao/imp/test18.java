package org.dao.imp;

import org.dao.AmountDao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class test18 {
	public static void main(String[] args) {
		AmountDao amDao = new AmountDaoImp();
		try {
			System.out.println(new ObjectMapper().writeValueAsString(amDao.getAmountList(null, null)));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
}
