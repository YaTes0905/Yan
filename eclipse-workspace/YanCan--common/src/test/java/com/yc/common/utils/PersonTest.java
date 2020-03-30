package com.yc.common.utils;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() throws UnsupportedEncodingException {
		//批量生成1万个，并在控制台输出
		for (int i = 0; i < 10000; i++) {
			Person person=new Person();
			//姓名属性值调用StringUtil.generateChineseName()创建
			person.setName(StringUtil.generateChineseName()+i);
			//年龄属性值调用RandomUtil.random()创建，必须在1-120岁之间
			person.setAge(RandomUtil.random(1, 120));
			//介绍属性值调用StringUtil.randomChineseString()创建，字数为140个随机汉字
			person.setAbout(StringUtil.randomChineseString(140));
			//注册日期属性值模拟2010年1月1日至今任意随机时间
			person.setCreated(DateUtil.randomDate("2010-01-01","2020-03-30"));
			System.out.println(person);
		}
	}

}
