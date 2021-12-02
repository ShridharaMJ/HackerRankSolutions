package com.practice.strings;

import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class SherlockAndAnagrams {

	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void find() {
		String s = "cdcd";
		HashMap<String, Integer> hmap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String str = s.substring(i, j + 1);
				str = Stream.of(str.split("")).sorted().collect(Collectors.joining());
				if (hmap.containsKey(str))
					hmap.put(str, hmap.get(str) + 1);
				else
					hmap.put(str, 1);
			}

		}
		int annagramCount = 0;
		Set<String> keySet = hmap.keySet();
		for (String string : keySet) {
			Integer integer = hmap.get(string);

			annagramCount += integer * (integer - 1) / 2;

		}
		System.out.println(annagramCount);

	}
	
	
	@Test
	public void StringDemo() {
		String s=" #13 Konankunte, Near government school road, Bengaluru-560062 ";
		System.out.println(s.toUpperCase());
	}
}
