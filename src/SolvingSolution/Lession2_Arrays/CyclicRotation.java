package SolvingSolution.Lession2_Arrays;

/**
 * 
 * @author thuong
 * 
 * Shift array to the right by K element
 *
 */

public class CyclicRotation {

	public static int[] solution(int[] A, int K)
	{
		//Check for empty Array
		if (A.length == 0)
			return A;
		
		for (int i = 0; i < K; i++)
		{
			int lastElem = A[A.length - 1];
			for (int j = A.length - 1; j > 0; j--)
			{
				A[j] = A[j-1];
			}
			A[0] = lastElem;
		}
		
		return A;
	}
	
	public static void main(String[] args) {
		int[] A = {3, 8, 9, 7, 6};
		int K = 3;
		
		int[] result = solution(A, K);
		for (int elem : result) 
		{
			System.out.print(elem + " ");
		}
	}

}
