package com.yc.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		
		Random random=new Random();
		int nextInt = random.nextInt(max);
		int i = nextInt+min;
		return i;
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static Set<Integer> subRandom (int min, int max, int subs){
	//TODO 实现代码
		Set<Integer> set=new HashSet<Integer>();
		while(set.size()<subs) {
			int random = RandomUtil.random(min, max);
			set.add(random);
		}
		return set;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		String string="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		int length = string.length();
		int random = RandomUtil.random(0, length);
		char charAt = string.charAt(random);
		return charAt;
	//TODO 实现代码
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
	//TODO 实现代码
		String string="";
		while(string.length()<length) {
			char c = RandomUtil.randomCharacter();
			string+=c;
		}
		return string;
	}
}
