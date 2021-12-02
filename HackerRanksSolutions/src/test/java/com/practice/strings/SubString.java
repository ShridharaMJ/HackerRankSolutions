package com.practice.strings;

import org.testng.annotations.Test;

public class SubString {

	@Test
	public void find() {

		String s1 = "helloITdsjsiodjgoijsaufauyhoiuaushfishas";
		String s2 = "worldfouahahia";

		if (s2.length() < s1.length()) {
			String temp = s1;
			s1 = s2;
			s2 = temp;
		}

		for (int i = 0; i < s1.length(); i++) {

			char charValue = s1.charAt(i);
			if (s2.contains(String.valueOf(charValue)))
				System.out.println("Yes");
			else if (s1.indexOf(charValue) != s1.lastIndexOf(charValue))
				s1 = s1.replaceAll(String.valueOf(charValue), "");

		}

		System.out.println("End of search.");
	}

}
