package SolvingSolution.Lession2_Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the element in array
 * that don't have pairs.
 * 
 * In other words, the counting of that element is an odd number
 * 
 * Array = {3 1 3} should return 1
 */

public class OddOccurrencesInArray {
	//This take O(N^2) times
	/*public static int solution (int[] A)
	{
		int count;
		for (int i = 0; i < A.length; i++)
		{
			count = 0;
			for (int j = 0; j < A.length; j++)
			{
				if (A[i] == A[j])
				{
					System.out.println("Pos: " + j + " : " + A[j]);
					count++;
				}
			}
			if (count % 2 != 0)
				return A[i];
		}
			
		return 0;
	}*/
	
	//total runtime is O(2n) or O(n), how about O(NlogN) ?
	public static int solution (int[] A)
	{
		//Initialize an array to count element repetition
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		//O(n)
		for (int i = 0; i < A.length; i++)
		{
			if (map.containsKey(A[i]))
				map.put(A[i], map.get(A[i]) + 1);
			else
				map.put(A[i], 1);
		}
		//(O(n)
		for (Integer key : map.keySet())
		{
			if (map.get(key) % 2 != 0)
				return key;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {9, 3, 9, 3, 9, 7, 9};
		
		System.out.println(solution(A));
	}

}
