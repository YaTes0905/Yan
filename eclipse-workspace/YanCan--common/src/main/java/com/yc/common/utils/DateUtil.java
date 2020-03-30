package com.yc.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static long random(long begin,long end) {
		long l = (long) (begin+(Math.random()*(end-begin)));
		if (l==begin||l==end) {
			return random(begin, end);
		}
		return l;
	}
	public static Date randomDate(String beginDate,String endDate) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date start = format.parse(beginDate);
			Date end = format.parse(endDate);
			if (start.getTime()>=end.getTime()) {
				return null;
			}
			long date = random(start.getTime(), end.getTime());
			return new Date(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
