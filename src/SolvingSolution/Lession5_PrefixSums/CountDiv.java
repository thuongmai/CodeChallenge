package SolvingSolution.Lession5_PrefixSums;

/*
 * Compute number of integers divisible by k in range [a..b]
 * Complexity: time O(1) and space O(1)
 */
public class CountDiv {
	public static int solution (int A, int B, int K)
	{
		int b = B/K;
		int a = (A > 0 ? (A - 1) / K : 0);
		if (A == 0)
			b++;
		
		return b - a;
	}
}
