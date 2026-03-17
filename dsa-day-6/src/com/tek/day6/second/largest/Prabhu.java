package com.tek.day6.second.largest;

import java.util.Arrays;

public class Prabhu {
	public static void main(String[] args) {
		secondLargestNumber();
	}

	private static void secondLargestNumber() {
//		int[] array = { 5, 9, 2, 7, 1 };
		int[] array = {1,6,4,3,9};
		System.out.println("Array: " + Arrays.toString(array));
		int secondLargest = array[0];
		int largest = array[0];

		if (array.length <= 2) {
			secondLargest = Math.min(array[0], array[1]);
		} else {
			for (int num : array) {
				if (num > largest) {
					secondLargest = largest;
					largest = num;
				} else if (num > secondLargest && num != largest) {
					secondLargest = num;
				}
			}
		}
		System.out.println("Second Largest Number: " + secondLargest);
	}
}
