package com.practice.strings;

import java.util.Iterator;

import org.testng.annotations.Test;

public class ChildLength {

	@Test
	public void testcase1() {

		String s1 = "WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS";
		String s2 = "FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC";

		int commChildLength1 = getCommChildLength(s1, s2);
		int commChildLength2 = getCommChildLength(s2, s1);
		int max = Integer.max(commChildLength1, commChildLength2);

		System.out.println(max);

	}

	public static int getCommChildLength(String s1, String s2) {

		int countLong1 = 0;
		int cursorLength = 0;
		int tempCursor = 0;
		int minIndex = getMinIndex(s1, s2);

		// Loop thro' each chars and return longest child possible
		while (minIndex < s1.length()) {

			char tempChar = s1.charAt(minIndex);
			cursorLength = tempCursor;
			while (cursorLength < s2.length()) {

				if (s2.charAt(cursorLength) == tempChar) {
					countLong1++;
					tempCursor = cursorLength + 1;
					break;
				}
				cursorLength++;
			}
			s1 = s1.substring(minIndex + 1);
			s2 = s2.substring(tempCursor);
			minIndex = getMinIndex(s1, s2);
		}

		return countLong1;

	}

	public static int getMinIndex(String s1, String s2) {
		int min_index = Integer.MAX_VALUE;
		int charToStart = 0;
		for (int i = 0; i < s1.length(); i++) {

			char tempCahrs = s1.charAt(i);
			int tempIndex = s2.indexOf(tempCahrs);
			if (tempIndex != -1 && tempIndex < min_index) {
				min_index = tempIndex;
				charToStart = i;
			}

		}
		return charToStart;
	}

}
