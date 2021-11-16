package com.practice.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import javax.swing.event.ListSelectionEvent;

import org.testng.annotations.Test;

public class RotateArrays {

	@SuppressWarnings("removal")
	@Test
	public void testcase1() {

		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5);

		int numberOfRotate = 9;

		Integer[] array = asList.toArray(new Integer[asList.size()]);
		int arrayLength = array.length;
		if (numberOfRotate > arrayLength)
			numberOfRotate = numberOfRotate % arrayLength;

		for (int i = 0; i < numberOfRotate; i++) {

			// Integer[] tempArray = new Integer[array.length];
			/*
			 * for (int j = tempArray.length - 1; j >= 0; j--) {
			 * 
			 * if (j == tempArray.length - 1) { tempArray[j] = array[0]; // always take 1st
			 * element to last else
			 * 
			 * } else tempArray[j] = array[j+1];
			 * 
			 * }
			 */

			int tempInt = array[0];
			array = Arrays.copyOfRange(array, 1, arrayLength + 1);
			array[arrayLength - 1] = tempInt;
		}

		for (Integer integer : array) {
			System.out.println(integer);
		}
		// List<Integer> asList2 = Arrays.asList(array);

	}

}
