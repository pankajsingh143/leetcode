package com.leetcode.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SqauareOfArraySorted {

	public static void main(String[] args) {
		// find largest consecutive one in binary array
		// int[] nums = {0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1};
		// int[] nums = {0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1};

		int[] nums = {-1, -6, 8, 9, 2};
		int[] sqNums = new int[nums.length];
		List<Integer> list = Arrays.asList(-1, -6, 8, 9, 2);

		List<Integer> sqList = list.stream().map(num -> num * num)
				.collect(Collectors.toList());
		Collections.sort(sqList);
		System.out.println("Sorted square list " + sqList);
		int i = 0;
		for (int n : nums) {
			sqNums[i] = n * n;
			i++;
		}
		System.out.println("Sq array " + Arrays.toString(sqNums));
		int low = 0;
		int high = sqNums.length - 1;
		quicksort(sqNums, low, high);
		System.out.println("Sorted array " + Arrays.toString(sqNums));
	}
	// Sorted square list [1, 4, 36, 64, 81]

	public static void quicksort(int[] na, int low, int high) {
		int[] sortedSq = new int[na.length];
		if (low < high) {
			int pi = partition(na, low, high);
			quicksort(na, low, pi - 1);
			quicksort(na, pi + 1, high);
		}

	}
	public static int partition(int[] na, int low, int high) {
		int i = low - 1;
		int pivot = na[high];
		for (int j = low; j < high; j++) {
			if (na[j] < pivot) {
				i++;
				swap(na, i, j);
			}
		}
		swap(na, i + 1, high);

		return i + 1;
	}

	public static void swap(int[] na, int i, int j) {
		int temp = na[i];
		na[i] = na[j];
		na[j] = temp;
	}

}
