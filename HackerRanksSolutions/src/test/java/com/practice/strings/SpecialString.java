package com.practice.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.testng.annotations.Test;

public class SpecialString {
	/*
	 * A string is said to be a special string if either of two conditions is met:
	 * 
	 * 
	 * All of the characters are the same, e.g. aaa. All characters except the
	 * middle one are the same, e.g. aadaa.
	 */

	@Test
	public void testCase1() {
		String s = "abcbaba";
		List<String> lstOfStr = new ArrayList<>();
		int k = 3;
		while (k < s.length()) {
			int tempend = k;
			for (int i = 0; i < s.length(); i++) {
				if (tempend <= s.length()) {
					lstOfStr.add(s.substring(i, tempend));
					tempend++;
				}
			}
			k++;
		}

		Predicate<String> predicate = str -> str.equals(String.valueOf(new StringBuffer(str).reverse()));
		int noOfMatch = 0;
		for (String string : lstOfStr) {
			if (predicate.test(string)) {
				noOfMatch++;
			}

		}

		System.out.println(noOfMatch + s.length());

	}

	@Test
	public void pivote() {
		Predicate<String> predicate = str -> str.equals(String.valueOf(new StringBuffer(str).reverse()));

		boolean test2 = predicate.test("moom");
		System.out.println(test2);
	}
}
