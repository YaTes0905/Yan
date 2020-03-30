package com.yc.common.utils;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String src=" ";
		boolean hasLength = StringUtil.hasLength(src);
		System.out.println(hasLength);
	}

	@Test
	public void testHasText() {
		String src="  ";
		boolean hasLength = StringUtil.hasText(src);
		System.out.println(hasLength);
	}

	@Test
	public void testRandomChineseString() throws UnsupportedEncodingException {
		String ChineseString = StringUtil.randomChineseString(2);
		System.out.println(ChineseString);
	}

	@Test
	public void testGenerateChineseName() throws UnsupportedEncodingException {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}

}
