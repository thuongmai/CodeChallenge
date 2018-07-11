package SolvingSolution.Lession6_Sorting;

import java.util.Arrays;

public class AllSearch {
	/*
	 * Assume array is sorted
	 * Pick a middle and compare with value, if value is bigger, then take the second half of the array recursively
	 * Ex: 1 2 3 4 5 6 7, try to find if value 6 is there, the mid = 4 < 6, so take the second half of array
	 * 4 5 6 7, the mid is 6 = 6, return 6
	 */
	public static int BinarySearch (int[] A, int value) {
		if (A.length == 0) return -1;
		Arrays.sort(A);
		return BinarySearch (A, 0, A.length - 1, value);
	}
	private static int BinarySearch (int[] A, int left, int right, int value) {
		if (right >= 1) {
			int mid = left + (right - left) / 2;
			
			if (A[mid] == value)
				return mid;
			
			if (A[mid] > value)
				return BinarySearch(A, left, mid-1, value);
			
			return BinarySearch (A, mid+1, right, value);
		}
		return -1;
	}
}
