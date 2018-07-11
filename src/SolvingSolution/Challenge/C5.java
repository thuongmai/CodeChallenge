package SolvingSolution.Challenge;

import java.util.Vector;

/*
 * Given an array, find if there is any 2 numbers in an array that can be added up = sum
 * [1,2,4,4], 8 will return 1 as Yes because 4 + 4 = 8
 * Solution:
 * low = 0, high = 3 => 1 + 4 = 5 < 8, increase low
 * low = 1, high = 3 => 2 + 4 = 6 < 8, increase low
 * low = 2, high = 3 => 4 + 4 = 8 = 8, return 1;
 */

public class C5 {
	//O(n), assume this array is sorted
	public static int FindArrayWithSum(int[] newArray, int sum) {
		int length = newArray.length;
		int high = length - 1, low = 0;

		while (low < high) {
			if (newArray[low] + newArray[high] == sum)
				return 1;
			else if (newArray[low] + newArray[high] > sum)
				high--;
			else
				low++;
		}
		return 0;
	}
	//not sorted, time O(n)
	public static int Find2(int[] newArray, int sum) {
		Vector<Integer> comp = new Vector<Integer>();
		for (int value : newArray) {
			if (comp.contains(value))
				return 1;
			comp.add(sum - value);
		}
		return 0;
	}
}
