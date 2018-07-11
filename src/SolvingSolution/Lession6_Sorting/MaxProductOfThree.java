package SolvingSolution.Lession6_Sorting;

import java.util.Arrays;
//Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R)

public class MaxProductOfThree {
	//O(N*logN)
	public static int solution (int[] A) {
		//Check empty array
		if (A.length == 0) return 0;
		
		Arrays.sort(A);
		int result = A[A.length - 1] * A[A.length - 2] * A[A.length -3];
		
		if (A[0] < 0 && A[1] < 0)
			result = (A[0] * A[1] * A[A.length - 1]) > result ? (A[0] * A[1] * A[A.length - 1]) : result;
			
		return result;
	}
}
