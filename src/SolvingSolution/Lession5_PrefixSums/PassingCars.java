package SolvingSolution.Lession5_PrefixSums;

/*
 * Count the number of passing cars on the road
 * Complexity: time O(N) and space O(1)
 */
public class PassingCars {
	public static int solution (int[] A) {
		int count = 0;
		int multiply = 0;
		for (int car : A)
		{
			if (car == 0)
				multiply = multiply + 1;
			if (multiply > 0)
				if (car == 1) {
					count += multiply;
					if (count > 1000000000)
						return -1;
				}
		}
		
		return count;
	}
}
