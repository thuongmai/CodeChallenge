package SolvingSolution.Challenge;

import java.util.ArrayList;

public class C9 {

	public static int solution(int[] A, int K, int M) {
		/*
		 * Thuong Mai Possible Solution (in case code doesn't work): run from the bottom
		 * to the top. At the very last element of A, we know that it is a last rose
		 * blooms; thus, a one long group with length A.length. The next last element of
		 * A will split A into 2 groups. If K = 2 and each group contains at least M
		 * long blossoming group, then we return this index array + 1; otherwise, we
		 * continue to go to the previous line.
		 */

		// if K = 1 and if M is equal A.length, simply return the last day = length of A
		if (M == 1 && A.length >= K)
			return A.length;

		int countGroups = 1;
		int countDay = A.length;
		ArrayList<Integer> savedLastBloom = new ArrayList<Integer>();

		for (int i = A.length - 1; i >= 0; i--) {
			if (savedLastBloom.isEmpty() && (i != A.length - 1 && i != 0)) {
				savedLastBloom.add(A[i]);
				countDay--;
				countGroups++;
			} else if (savedLastBloom.isEmpty() && (i == A.length - 1 || i == 0)) {
				savedLastBloom.add(A[i]);
				countDay--;
			} else {
				if (savedLastBloom.contains(A[i] + 1) || savedLastBloom.contains(A[i] - 1)) {
					savedLastBloom.add(A[i]);
					countDay--;
				} else {
					// If this is the first of last element
					if (i == A.length - 1 || i == 0) {
						savedLastBloom.add(A[i]);
						countDay--;
					} else {
						savedLastBloom.add(A[i]);
						countGroups++;
						countDay--;
					}
				}
			}

			if (countGroups == M) {
				// Check for K
				return ++countDay;
			}
			if (countDay == 0)
				return -1;
		}

		return -1;

	}

	public static void main(String[] args) {
		 System.out.println(solution(new int[] { 1, 4, 3, 2, 5 }, 1, 3));
		System.out.println(solution(new int[] { 1, 2, 7, 6, 4, 3, 5 }, 2, 2));
	}
}
