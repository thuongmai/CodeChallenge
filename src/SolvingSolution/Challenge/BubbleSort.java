package SolvingSolution.Challenge;

/*
 * 5 1 4 2 8
 * 1 5 4 2 8
 * 1 4 5 2 8
 * 1 4 2 5 8
 * 1 2 4 5 8
 * O (n*n)
 */
public class BubbleSort {
	public static int[] BubbleSort (int[] arr) {		
		boolean swapped;
		for (int i = 0; i < arr.length - 1; i++) {
			swapped = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}
		
		return arr;
	}
}
