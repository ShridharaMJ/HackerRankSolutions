package com.practice.basics;

import java.util.Scanner;

import org.testng.annotations.Test;

public class LoopsDemo {
	@Test
	public void testCase1() {

		int a = 5;
		int b = 3;
		int n = 5;
		for (int i = 1; i <= n; i++) {
			int tempCount = a;
			for (int j = 0; j < i; j++) {

				tempCount += Math.pow(2, j) * b;

			}

			System.out.print(tempCount + " ");

		}
		

	}
}
