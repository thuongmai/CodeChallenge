package SolvingSolution.Lession3_TimeComplexity;

/*
 * Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|
 * 
 * Ex: A = {3, 1, 2, 4, 3};
 * P = 1 -> |3 - 10| = 7
 * P = 2 -> |4 - 9| = 5
 * P = 3 -> |6 - 7| = 1
 * P = 4 -> |10 - 3| = 7
 * 
 * function should return 1
 * 
 * Assume: N is an integer within range [2..100,000];
 *  and each element of array A is an integer within the range [-1000..1000]
 *  
 * Complexity: time: O(N) and space : O(N)
 *  
 */

public class TapeEquilibrium {

	//O(N)
	public static int solution(int[] A)
	{
		//Check for empty array
		if (A.length == 0)
			return 0;
		
		//Find Total First
		int total = 0;
		for (int i = 0; i < A.length; i++)
			total += A[i];
		
		//Find the difference
		int min = 0;
		int left = 0, right = 0;
		for (int p = 1; p < A.length; p++)
		{
			left += A[p - 1];
			right = total - left;
			int diff = Math.abs(left - right);
			if (p == 1 || min > diff)
				min = diff;
		}
		
		return min;
	}
	
}
