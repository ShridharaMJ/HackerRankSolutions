package com.practice.strings;

import org.testng.annotations.Test;

public class JavaSubStringComparisons {

	@Test
	public void getSmallestAndLargest() {
		String s = "welcometojava";
		int k = 3;

		/*
		 * List<String> strlists = new ArrayList<>();
		 * 
		 * 
		 * for (int i = 0; i < str.length(); i++) { if (k <= str.length()) {
		 * strlists.add(str.substring(i, k)); k++; } }
		 * 
		 * Collections.sort(strlists);
		 * 
		 * String smallest = strlists.get(0); String longest =
		 * strlists.get(strlists.size()-1);
		 * 
		 * System.out.println(smallest + " " + longest);
		 */
		int araryIndex = 0;
		String[] str = new String[s.length()-(k-1)];
		for (int i = 0; i < s.length(); i++) {
			if (k <= s.length()) {
				String substring = s.substring(i, k);
				str[araryIndex] = substring;
				araryIndex++;
				k++;
			}
		}

		for (int i = 0; i < str.length; i++) {
			for (int j = i; j < str.length; j++) {

				if (str[i].compareTo(str[j]) > 0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;

				}

			}

		}

		String smallet = str[0];
		String longest = str[str.length - 1];

		System.out.println(smallet + " " + longest);
	}

}
