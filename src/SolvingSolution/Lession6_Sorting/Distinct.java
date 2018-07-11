package SolvingSolution.Lession6_Sorting;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/*
 * Compute number of distinct values in an array
 * {2,1,1,2,3,1} return 3 distinct values 1 2 3
 */

public class Distinct {
	//Take O(N^2)
	/*public static int solution (int[] A) {
		Set<Integer> set = new TreeSet<>();
		for (int value : A) {
			if (!set.contains(value))
				set.add(value);
		}
		return set.size();
	}*/
	
	//Take O(N*logN)
	public static int solution (int[] A) {
		//Check empty array
		if (A.length == 0) return 0;
		Arrays.sort(A);
		int count = 1;
		int temp = A[0];
		for (int i = 0; i < A.length; i++) {
			if (temp != A[i]) {
				temp = A[i];
				count++;
			}
		}
		return count;
	}
}
