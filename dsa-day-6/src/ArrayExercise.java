import java.util.Arrays;
import java.util.Random;

public class ArrayExercise {
	public static void main(String[] args) {
		reverse();
		findSecondHighest();
	}

	private static void findSecondHighest() {
		// TODO Auto-generated method stub

	}
	private static int[] generateArray() {
		Random rd = new Random();
		int[] arr = new int[99999999];
		for (int i = 0; i < arr.length; i++) {
		    arr[i] = rd.nextInt(100); // Fills with random numbers 0-99
		}
		return arr;
	}
	private static void reverse() {
		int[] arr = generateArray();
		int n = arr.length;
		int[] rev = new int[n]; //space
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
		    rev[i] = arr[n - 1 - i];
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
//		for (int i = 0; i < n; i++) {
//		    System.out.print(rev[i] + " ");
//		}
//		System.out.println("Reversed Array"+Arrays.toString(rev));
	}
}
