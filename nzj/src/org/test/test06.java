package org.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.tool.ChangeTime;

public class test06 {
	public static void main(String[] args) {
		String l = ChangeTime.date2TimeStamp("2017-02-05",  "yyyy-MM-dd");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			System.out.println(sdf.parse("2017-02-05"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(l);
	}
}