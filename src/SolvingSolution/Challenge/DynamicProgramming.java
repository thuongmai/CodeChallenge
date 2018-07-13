package SolvingSolution.Challenge;

/*
 * Solve Fibonacci Sequence
 */

public class DynamicProgramming {

	public static int NaiveSolve (int index) {
		if (index == 1 || index == 2)
			return 1;
		else
			return NaiveSolve(index - 1) + NaiveSolve(index - 2);
	}
	
	public static int DynamicSolve (int index) {
		if (index == 1 || index == 2)
			return 1;
		int[] seq = new int[index + 2];
		seq[0] = seq[1] = 1;
		for (int i = 2; i <= index; i++) {
			seq[i] = seq[i - 1] + seq[i - 2];
		}
		return seq[index];
	}
	
	public static int OptimizedSpaceSolve (int index) {
		if (index == 1 || index == 2)
			return 1;
		int result = 0, a = 1, b = 1;
		for (int i = 2; i <= index; i++) {
			result = a + b;
			a = b;
			b = result;
		}
		return result;
	}
}
