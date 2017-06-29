package org.test;

import java.util.List;

import org.dao.TraineeDao;
import org.dao.imp.TraineeDaoImp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class test18 {
	public static void main(String[] args) throws JsonProcessingException {
//		PriceDao pDao =  new PriceDaoImp();
//		System.out.println(new ObjectMapper().writeValueAsString(pDao.getPriceList()));
//		System.out.println(new ObjectMapper().writeValueAsString(pDao.getPrice(2)));
//		System.out.println(new ObjectMapper().writeValueAsString(pDao.updatePrice(2, 51.51)));
//		AmountDao ad = new AmountDaoImp();
//		System.out.println(new ObjectMapper().writeValueAsString(ad.getAmount(6L)));
		TraineeDao tDao = new TraineeDaoImp();
		long[] id = {59L,62L};
		List<Integer> li = tDao.getTraineeStatus(id);
		System.out.println(new ObjectMapper().writeValueAsString(li));
		System.err.println(li.contains(3));
	}
}
