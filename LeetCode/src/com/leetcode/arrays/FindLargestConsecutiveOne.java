package com.leetcode.arrays;

public class FindLargestConsecutiveOne {

	public static void main(String[] args) {
		// find largest consecutive one in binary array
		int[] nums = {0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1};
		// int[] nums = {0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1};
		// int nums[] = {1, 0, 1, 1, 0, 1, 1, 1};
		System.out.println(getCount(nums));

	}
	public static int getCount(int[] a) {
		int largestCount = 0;
		int count = 0;
		for (int n : a) {
			if (n == 1) {
				count++;
			} else {
				if (count > largestCount)
					largestCount = count;
				count = 0;
				continue;
			}

		}
		if (count > largestCount)
			largestCount = count;

		return largestCount;
	}

}
