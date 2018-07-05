package SolvingSolution.Lession3_TimeComplexity;

/*
 * Find the missing element in an array
 * 
 * Assume that all elements are distinct
 * 
 * complexity: time: O(N) and space: O(1) 
 */

public class PermMissingElem {
	
	//O(N) or (O(NlogN)) //This one doesn't assume that we start at 1
	public static int solution (int[] A)
	{
		boolean isMinOne = true;
		
		//Empty array
		if (A.length == 0)
			return 1;
		
		//Find Totalnumber in array
		int max = 0;
		for (int i = 0; i < A.length; i++) // Find Max
		{
			if (max < A[i])
				max = A[i];
		}
		int min = max;
		for (int i = 0; i < A.length; i++) //Find min
		{
			if (min > A[i])
				min = A[i];
		}
		
		System.out.println("Min: " + min + " | Max: " + max);
		
		int base = 0; //If min doesn't start at 1, we need to keep that out of the formula at (1)
		if (min != 1)
		{
			isMinOne = false;
			for (int i = 0; i < min; i++) //Find base = 1 + 2 + ... + min
				base += i;
		}
		double total = (double) max * (max + 1) / 2 - base; //(1) 
		
		System.out.println("Total: " + total);
		
		//Find the missing element.
		for (int i = 0; i < A.length; i++)
		{
			total -= A[i];
		}
		
		if (total == 0 && !isMinOne && (min - 1) != 0)
			return --min;
		else if (total == 0 && (min - 1) == 0)
			return ++max;
		else 
			return (int)total;
	}
	
	/* O(N) . Assume that data is fixed and start at 1
	public int solution(int[] data) {

	    long N = data.length + 1;
	    long total = (N * (N + 1)) / 2;

	    long sum = 0L;

	    for (int i : data) {

	        sum += i;
	    }

	    return (int)(total - sum);
	}*/

}
