package com.yc.common.utils;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int random = RandomUtil.random(1, 3);
		System.out.println(random);
	}
	@Test
	public void testSubRandom() {
		Set<Integer> subRandom = RandomUtil.subRandom(1, 10, 3);
		System.out.println(subRandom);
	}
	@Test
	public void testRandomCharacter() {
		char randomCharacter = RandomUtil.randomCharacter();
		System.out.println(randomCharacter);
	}

	@Test
	public void testRandomString() {
		String randomString = RandomUtil.randomString(3);
		System.out.println(randomString);
	}
}
