package SolvingSolution.Lession4_CountingElements;

/**
 * @author thuong Calculate the values of counters after applying all
 *         alternating operations; increase counter by 1; set value of all
 *         counters to current maximum Complexity: time O(N+M) and space O(N)
 */
public class MaxCounters {
	/*60%
	 * public static int[] solution (int N, int[] A) {
	 * 
	 * int[] Index = new int[N]; int max = 0;
	 * 
	 * //Initialize array for (int i = 0; i < N; i++) Index[i] = 0;
	 * 
	 * for (int i = 0; i < A.length; i++) { if (A[i] <= N) { Index[A[i] - 1]++; if
	 * (max < A[i]) max = A[i]; } else { for (int j = 0; j < N; j++) Index[j] = max;
	 * } }
	 * 
	 * return Index; }
	 */

	public static int[] solution(int N, int[] A) {
		int counter[] = new int[N];
		int n = A.length;
		int max = -1, current_min = 0;

		for (int i = 0; i < n; i++) {
			if (A[i] >= 1 && A[i] <= N) {
				if (counter[A[i] - 1] < current_min)
					counter[A[i] - 1] = current_min;
				counter[A[i] - 1] = counter[A[i] - 1] + 1;
				if (counter[A[i] - 1] > max)
					max = counter[A[i] - 1];
			} else if (A[i] == N + 1) {
				current_min = max;
			}
		}
		for (int i = 0; i < N; i++) {
			if (counter[i] < current_min)
				counter[i] = current_min;
		}
		return counter;
	}
}
