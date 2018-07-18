package SolvingSolution.Lession6_Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class AllSort {
	private static <T extends Comparable<T>> int Compare(T a, T b) {
		/*Note: <T extends Comparable<T>> is the same as
		* class T implements Comparable<T> { int compareTo(T t) {return 0;} }
		* Means that the type parameter must support comparison with other instances of its own type
		*/
		return a.compareTo(b);
	}
	
	private static void Swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	/**Time: O(N^2) 
	*Searching for minimum in array and swap it with the current index
	*Ex: 3 1 2 -> 3 [1] 2 -> 1 3 2 -> 1 3 [2] -> 1 2 3
	*/
	public static int[] SelectionSort(int[] newArray) {
		int length = newArray.length;
		
		//Check for empty or 1 size-array
		if (length <= 1) return newArray;
		
		for (int i = 0; i < length - 1; i++)  {
			int min = i;
			for (int j = i + 1; j < length; j++) {
				if (newArray[min] > newArray[j])
					min = j;
			}
			if (min != i) {
				//Swap
				int smallerNum = newArray[min];
				newArray[min] = newArray[i];
				newArray[i] = smallerNum;
			}
		}
		return newArray;
	}
	
	/**Time O(n + k); may be bad for memory
	*Count elements in array of counters, modify the count array by adding the previous counts,
	*Create another array with same length, place corresponding values to this array and decrease count by 1
	*https://youtube.com/watch?v=7zuGmKfUt7s
	*If user knows the input sequence is a permutation of {1,2,...n}, then use this, else bad due to space memory!!!
	*/
	public static int[] CountingSort (int[] newArray) {
		//Check for empty or 1 size-array
	   if (newArray.length <= 1) return newArray;
				
		//Find the max element in the newArray
		int maxNum = 0;
		for (int value : newArray) {
			if (maxNum < value)
				maxNum = value;
		}

		//Create an array with length of maxNum + 1
		int[] countArray = new int[maxNum + 1];
		
		//Iterate through newArray, then add to countArray with index is the value
		for (int value : newArray) {
			++countArray[value];
		}
		
		//Modify countArray by adding the previous counts to the current index
		for (int i = 1; i < countArray.length; i++)
		{
			countArray[i] += countArray[i - 1];
		}
		
		//Create a new array with the length of newArray
		int[] sortedArray = new int[newArray.length];
		
		//Get each value inside newArray, use this value as an index to get value B in countArray
		//Decrease the new value B by 1 since sortedArray starts at 0, then assign the sortedArray at index B with value
		for (int value : newArray) {
			sortedArray[countArray[value] - 1] = value;
			countArray[value]--;
		}
		
		return sortedArray;
	}
	
	/**
	 * Time O(nlogn). Example of Divide and Conquer
	 * @param newArray
	 * @return sortedArray
	 */
	public static int[] MergeSort (int[] newArray) {
		//Check for empty or 1 size-array
		if (newArray.length <= 1) return newArray;
		int[] a0 = Arrays.copyOfRange(newArray, 0, newArray.length/2);
		int[] a1 = Arrays.copyOfRange(newArray, newArray.length/2, newArray.length);
		MergeSort(a0);
		MergeSort(a1);
		Merge(a0, a1, newArray);
		return newArray;
	}
	private static void Merge(int[] firstArray, int[] secondArray, int[] newArray) {
		int i0 = 0, i1 = 0;
		for (int i = 0; i < newArray.length; i++) {
			if (i0 == firstArray.length)
				newArray[i] = secondArray[i1++];
			else if (i1 == secondArray.length)
				newArray[i] = firstArray[i0++];
			else if (Compare(firstArray[i0], secondArray[i1]) < 0)
				newArray[i] = firstArray[i0++];
			else
				newArray[i] = secondArray[i1++];
		}
	}
	
	//Use the function, take O(n log n)
	public static int[] SortFunction (int[] newArray) {
		Arrays.sort(newArray);
		return newArray;
	}
	
	//Simple swap two positions in an array. Take O (N ^ 2)
	public static int[] BubbleSort (int[] newArray) {
		if (newArray.length == 0) return null;
		
		for (int i = 0; i < newArray.length; i++) {
			for (int j = i + 1; j < newArray.length; j++) {
				if (newArray[i] > newArray[j]) {
					int temp = newArray[j];
					newArray[j] = newArray[i];
					newArray[i] = temp;
				}
			}
		}
		return newArray;
	}
	
	//Example of Divide and Conquer Time O(n logn)
	//Pick a pivot and partition array into set of elements < x, = x and > x, then recursively sort
	public static int[] QuickSort (int[] newArray) {
		if (newArray.length == 0) return null;
		QuickSort(newArray, 0, newArray.length);
		return newArray;
	}
	private static void QuickSort (int[] newArray, int i, int n) {
		if (n <= 1) return;
		int rand = i + new Random().nextInt(n);
		int randPivot = newArray[rand];
		int p = i - 1, j = i, q = i + n;		
		
		System.out.println(Arrays.toString(newArray));
		
		while (j < q) {
			int comp = Compare(newArray[j], randPivot);
			if (comp < 0)
				Swap(newArray, j++, ++p);
			else if (comp > 0)
				Swap(newArray, j, --q);
			else
				j++;
			System.out.printf("i = %d\t"
					+ "p = %d\t"
					+ "j = %d\t"
					+ "q = %d\t"
					+ "randPivot = %d\t"
					+ "newArray[j] = %d\t"
					+ "comp = %d\t"
					+ "A = ", i,p,j,q,randPivot,newArray[j],comp);
			
			for (int h = 0; h < newArray.length; h++) {
				if (h == rand)
					System.out.print("{" + newArray[rand] + "} ");
				else if (h == j)
					System.out.print("[" + newArray[h] + "] ");
				else
					System.out.print(newArray[h] + " ");
			}
			System.out.println();
		}
		QuickSort(newArray, i, p-i+1);
		QuickSort(newArray, q, n-(q-i));
	}
}
