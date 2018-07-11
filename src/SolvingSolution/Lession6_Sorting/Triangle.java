package SolvingSolution.Lession6_Sorting;

import java.util.Arrays;

/*
*Determine whether a triangle can be built from a given set of edge
*A triplet (P, Q, R) is a triangular if 0 <= P <= Q <= R <= N and
*A[P] = A[Q] > A[R],
*A[Q] + A[R] > A[P],
*A[R] + A[P] > A[Q].
*Complexity: time O(N*logN) and space O(N)
*/
public class Triangle {

	public static int solution(int[] A) {
		// check empty array
		if (A.length == 0)
			return 0;

		Arrays.sort(A);

		for (int i = 0; i < A.length - 2; i++) {
			if (((long) A[i] + (long) A[i + 1] > A[i + 2]) && ((long) A[i + 1] + (long) A[i + 2] > A[i])
					&& ((long) A[i] + (long) A[i + 2] > A[i + 1]))
				return 1;
		}

		return 0;
	}
}
