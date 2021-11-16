package com.practice.arrays;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class ArrayManupulation {

	@Test
	public void testcase1() {

		// List<List<Integer>>

		List<Integer> asList = Arrays.asList(1, 2, 100);
		List<Integer> asList2 = Arrays.asList(2, 5, 100);
		List<Integer> asList3 = Arrays.asList(3, 4, 100);
		// List<Integer> asList5 = Arrays.asList(5, 9, 15);

		List<List<Integer>> asList4 = Arrays.asList(asList, asList2, asList3);

		// Bruth force method...

		int n = 5;
		int[] arr = new int[n];

		/*
		 * for (int i = 0; i < asList4.size(); i++) {
		 * 
		 * List<Integer> fromRange = asList4.get(i);
		 * 
		 * for (int j = fromRange.get(0)-1; j < fromRange.get(1); j++) { arr[j] = arr[j]
		 * + fromRange.get(2); }
		 * 
		 * } int max = 0; for (int i : arr) { if (i > max) max = i; }
		 * System.out.println(max);
		 */

		// Prefix sum method

		for (List<Integer> list : asList4) {
			int startIndex = list.get(0) - 1;
			int endIndex = list.get(1)-1 ;
			int value = list.get(2);

			arr[startIndex] += value;

			if (endIndex+1 < arr.length)
				arr[endIndex+1] -= value;

		}

		int MaxValue = Integer.MIN_VALUE;
		int curValur = 0;
		for (int i = 0; i < arr.length; i++) {
			curValur += arr[i];
			if (curValur > MaxValue)
				MaxValue = curValur;
		}
		System.out.println(MaxValue);
	}

}
