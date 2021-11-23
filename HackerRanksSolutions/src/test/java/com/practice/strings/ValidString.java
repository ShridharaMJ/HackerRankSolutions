package com.practice.strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.testng.annotations.Test;


public class ValidString {

	
	@Test
	public void testcase() {
		String str = "aabbcd";
		HashMap<Character, Integer> hsref = new HashMap<>();

		char[] chars = str.toCharArray();
		for (char c : chars) {
			if (hsref.containsKey(c))
				hsref.put(c, hsref.get(c) + 1);
			else
				hsref.put(c, 1);
		}

		TreeMap<Integer, Integer> values = new TreeMap<>();

		Set<Entry<Character, Integer>> entrySet = hsref.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {

			Integer value = entry.getValue();
			if (values.containsKey(value))
				values.put(value, values.get(value) + 1);
			else
				values.put(value, 1);

		}
		Integer num1 = values.firstKey();
		Integer num2 = values.lastKey();
		boolean flag = false;

		if (values.size() == 1||(values.size()==2) && (num1==1 && values.get(1)==1||(num1 + 1) == num2))
			flag = true;
		

		System.out.println(flag?"YES":"No");
		
	}
}
