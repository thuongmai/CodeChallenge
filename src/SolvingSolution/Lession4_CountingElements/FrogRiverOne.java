package SolvingSolution.Lession4_CountingElements;

import java.util.HashMap;

/**
 * @author thuong
 *Find the earliest time when a frog can jump to the other side of a river
 *Complexity: time O(N) and space O(X)
 */

public class FrogRiverOne {
	
	public static int solution (int X, int[] A) {
		
		//Check empty array
		if (A.length == 0)
			return -1;
		
		boolean isJump = false;
		int total = 0;
		HashMap<Integer, Integer> index = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < A.length; i++)
		{
			if (i == 0 || !index.containsKey(A[i]))
				index.put(A[i], 1);
			else
				index.put(A[i], index.get(A[i]) + 1);
			
			if (index.size() == X) {
				return i;
			}
		}
		
		return -1;
	}
	
}
