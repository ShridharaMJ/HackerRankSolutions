package com.practice.arrays;

import org.testng.annotations.Test;

public class MinNumberOfSwap {

	@Test
	public void testcase1() {

		int[] a = {4, 3, 2, 1};
		int length = a.length;
		int swap = 0;
		int i = 0;
		while (i <= length) {
			if (i < length && a[i] != i + 1) {
				int index =  a[i]-1;

				int temp = a[i];
				a[i] = a[index];
				a[index] = temp;

				swap++;

			} else {
				i++;
			}
		}

		System.out.println(swap);

	}

}
