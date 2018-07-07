package SolvingSolution.Lession4_CountingElements;

import java.util.Arrays;

/**
 * @author thuong
 *Find the smallest positive integer that does not occur in a given sequence
 *Complexity: time O(N) and space O(N)
 */

public class MissingInteger {
	public static int solution (int[] A) {
		//check empty array
		if (A.length == 0)
			return 1;
		
		Arrays.sort(A);
		int index = 1;
		for (int i = 0; i < A.length; i++)
		{
			if (A[i] == index)
				index++;
		}
		return index;
	}
}
