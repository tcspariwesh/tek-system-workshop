package com.tek.day6.duplicates;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondLargestElementUsingStreams {
	public static void main(String[] args) {
		int[] arr = { 1, -2, -7, -8, Integer.MIN_VALUE };
		System.out.println("Second Largest Element is: " + findSecondLargestElement(arr));
	}

	private static Optional<Integer> findSecondLargestElement(int[] arr) {
		if(arr==null) {
			
		}
		if (arr.length <= 2) {
			return Optional.of(Math.min(arr[0], arr[1]));
		}
		return Arrays.stream(arr).distinct().boxed().sorted(Comparator.reverseOrder())
				.skip(1).findFirst();
	}
}