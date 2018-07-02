package SolvingSolution.Lession2_Arrays;

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
	public static int solution (int[] A)
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
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {9, 3, 9, 3, 9, 7, 9};
		
		System.out.println(solution(A));
	}

}
