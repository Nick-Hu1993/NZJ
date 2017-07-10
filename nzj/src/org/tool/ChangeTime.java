package org.tool;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChangeTime {
	// public static String TimeStamp2Date(String timestampString, String
	// formats) {
	// Long timestamp = Long.parseLong(timestampString) * 1000;
	// String date = new java.text.SimpleDateFormat(formats)
	// .format(new java.util.Date(timestamp));
	// return date;
	// }
	/**
	 * 日期格式字符串转换成时间戳
	 * 
	 * @param date
	 *            字符串日期
	 * @param format
	 *            如：yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String date2TimeStamp(String date_str, String format) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return String.valueOf(sdf.parse(date_str).getTime()/1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 取得当前时间戳（精确到秒）
	 * 
	 * @return
	 */
	public static String timeStamp() {
		long time = System.currentTimeMillis();
		String t = String.valueOf(time / 1000);

		return t;
	}

	/**
	 * 取得当前月份
	 */
	public static Integer currentMon() {
		return Integer.parseInt(new SimpleDateFormat("MM").format(new Date()));
		// return 11;
	}

	/**
	 * 取得当前年份
	 */
	public static Integer currentYear() {
		return Integer
				.parseInt(new SimpleDateFormat("YYYY").format(new Date()));
	}

	/**
	 * 取得当前年月日
	 */
	public static Integer currentDate() {
		return Integer.parseInt(new SimpleDateFormat("YYYYMMdd")
				.format(new Date()));
	}

	/**
	 * 取得前十二个月份的数组
	 */
	public static List<String> current() {
		// Map<String, String> map = new HashMap<String, String>();
		List<String> list = new ArrayList<>();
		if (currentMon() - 12 == 0) {
			for (int i = 1; i <= 12; i++) {
				if (i < 10) {
					// map.put(currentYear() + "-0" + i, "");
					list.add(currentYear() + "-0" + i);
				} else {
					// map.put(currentYear() + "-" + i, "");
					list.add(currentYear() + "-" + i);
				}
			}
		} else {
			for (int i = currentMon() + 1; i <= 12; i++) {
				if (i < 10) {
					// map.put(currentYear() - 1 + "-0" + i, "");
					list.add(currentYear() - 1 + "-0" + i);
				} else {
					// map.put(currentYear() - 1 + "-" + i, "");
					list.add(currentYear() - 1 + "-" + i);
				}
			}
			for (int i = 1; i <= currentMon(); i++) {
				if (i < 10) {
					// map.put(currentYear() + "-0" + i, "");
					list.add(currentYear() + "-0" + i);
				} else {
					// map.put(currentYear() + "-" + i, "");
					list.add(currentYear() + "-" + i);
				}
			}
		}
		return list;

	}

	// 输出结果：
	// timeStamp=1417792627
	// date=2014-12-05 23:17:07
	// 1417792627
	public static String TimeStamp2Date(String timestampString, String formats) {
		Long timestamp = Long.parseLong(timestampString) * 1000;
		String date = new java.text.SimpleDateFormat(formats)
				.format(new java.util.Date(timestamp));
		return date;
	}
	
	/**
	 * 比较date1和date2的大小，date1是否大于date2
	 * 返回boolean类型
	 * @param date1
	 * @param date2
	 * @return
	 * @throws ParseException
	 */
	public static boolean compare_date(String date1, String date2) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date dt1 = df.parse(date1);//将日期解析为时间戳形式,但还是日期类型
        Date dt2 = df.parse(date2);
        if (dt1.getTime() > dt2.getTime()) {//转换成为long类型的整数进行比较
            return true;
        } else {
        	return false;
        }
    }
}
