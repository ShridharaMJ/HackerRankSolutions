package com.practice.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class StringManipulation {

	@Test
	public void testCase1() {
		String str = "32400121200";

		Matcher end = Pattern.compile(String.valueOf("0")).matcher(str);
		String newString = "";
		while (end.find()) {

			newString += "0";
		}

		System.out.println(newString + str.replaceAll("0", ""));

	}

}
