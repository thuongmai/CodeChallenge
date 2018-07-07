package SolvingSolution.Lession4_CountingElements;

import java.util.Arrays;

/**
 * 
 * @author thuong
 * 
 * Check whether array A is permutation
 * 
 * A sequence contain each element from 1 to N once only
 * 
 * A = {4, 1, 3, 2} is permutation
 * B = {4, 1, 3} is not permutation
 * 
 * Complexity: time: O(N) and space: O(N)
 *
 */
public class PermCheck {
	//Doesn't work for array [2, 2, 2]
	/*public static int solution(int [] A) {
		//Check empty array
		if (A.length == 0)
			return 0;
		
		int total = 0;
		int count = 0;
		for (int i = 0; i < A.length; i++)
		{
			total += A[i];
			count += i + 1;
		}
		System.out.println("Test: " + total + " ==  " + count);
		if (count == total)
			return 1;
		
		return 0;
	}*/
	
	public static int solution (int [] A) {
		
		if (A.length == 0)
			return 0;
		
		Arrays.sort(A);
		
		for (int i = 0; i < A.length; i++) {
			if ((i + 1) != A[i])
				return 0;
		}
		
		return 1;
	}
}
