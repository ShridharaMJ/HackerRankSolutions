package com.practice.arrays;

import org.testng.annotations.Test;

public class NewYearChos {

	@Test
	public void testcase1() {
		
		/*
		 * List<Integer> asList = Arrays.asList(2, 5,1, 3, 4); Integer[] array =
		 * asList.toArray(new Integer[asList.size()]);
		 */

		int[] a = { 1 ,2 ,5 ,3 ,7 ,8 ,6, 4 };
		int swap = 0;

		for (int i = a.length - 1; i >= 0; i--) {

			if (i>0 && a[i - 1] == i + 1) {

				int temp = a[i - 1];
				a[i - 1] = a[i];
				a[i] = temp;
				swap++;

			} else if (i>1 && a[i - 2] == i + 1) {
				int temp = a[i - 2];
				a[i - 2] = a[i - 1];
				a[i - 1] = a[i];
				a[i] = temp;
				swap += 2;

			} else if (a[i] == i + 1) {
				continue;
			}
			else
			{
				System.out.println("Chaoss...");
				return;
			}

		}
		System.out.println(swap);
	}

}
