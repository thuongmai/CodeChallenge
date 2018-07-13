package SolvingSolution.Challenge;

/*
 * Assume n-dimension arrays are row wise and column wise, count all negative numbers
 * row wise, column wise = sorted in row and column
 * Ex:
 * [-3 -2 -1 1]
 * [-2 2 3 4]
 * [4 5 7 8]
 * return 4
 */
public class C6 {

	public static int solution (int[][] A) {
		int count = 0, i = 0, j = A[0].length;
		while (i < A.length && j >= 0) {
			if (A[i][j] < 0) {
				count += (j + 1);
				i++;
			}
			else
				j -= 1;
		}
		return count;
	}
	
}
