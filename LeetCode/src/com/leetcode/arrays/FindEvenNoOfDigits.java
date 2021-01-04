package com.leetcode.arrays;

public class FindEvenNoOfDigits {

	public static void main(String[] args) {
		// find largest consecutive one in binary array
		// int[] nums = {0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1};
		// int[] nums = {0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1};
		int nums[] = {1088, 129, 19, 8906, 908};
		int countOfEvenDigits = 0;
		for (int a : nums) {
			if (getNoOfDigits(a) % 2 == 0) {
				countOfEvenDigits++;
			} else
				continue;
		}
		System.out.println(countOfEvenDigits);

	}
	public static int getNoOfDigits(int n) {
		int noOfDigits = 1;

		while (n / 10 >= 1) {
			n = n / 10;
			noOfDigits++;
		}
		return noOfDigits;
	}

}
