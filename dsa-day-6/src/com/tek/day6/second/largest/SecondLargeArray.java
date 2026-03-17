package com.tek.day6.second.largest;

public class SecondLargeArray {
	public static void main(String[] args) {
//		int[] arr = {5,9,2,7,1};
		int[] arr = { -5, -9, -2, -7, -1 };
//		int[] arr = {1,6,4,3,9};
		int largest = arr[0];
		int secondLargest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println(secondLargest);
	}

}