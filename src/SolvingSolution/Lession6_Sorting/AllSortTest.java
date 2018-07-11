package SolvingSolution.Lession6_Sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.Test;

class AllSortTest {
	final int arraySize = 10000;
	//Unsorted Array
	int[] UA1 = new int[] {8, 5, 2, 6, 9, 3, 1, 4, 7, 6};
	int[] UA2 = new int[arraySize];
	
	//Sorted Array
	int[] SA1 = new int[] {1, 2, 3, 4, 5, 6, 6, 7, 8, 9};
	int[] SA2 = new int[arraySize];
	
	AllSortTest() {
		int count = 0;
		for (int i = 0; i < SA2.length; i++) {
			SA2[i] = count;
			UA2[i] = count;
			count++;
		}
		shuffleArray(UA2);
	}
	
	void shuffleArray(int[] ar) {
		Random rnd = ThreadLocalRandom.current();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			int a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}
	
	@Test //O(n^2)
	void testSelectionSort() {
		assertArrayEquals(SA1, AllSort.SelectionSort(UA1), "Test 1: ");
		assertArrayEquals(SA2, AllSort.SelectionSort(UA2), "Test 2: ");
	}
	
	@Test //O(n + k)
	void testCountingSort() {
		assertArrayEquals(new int[] {1,1,2,2,4,5,7}, AllSort.CountingSort(new int[] {1,4,1,2,7,5,2}), "Test 0: ");
		assertArrayEquals(SA1, AllSort.CountingSort(UA1), "Test 1: ");
		assertArrayEquals(SA2, AllSort.CountingSort(UA2), "Test 2: ");
	}

	@Test //O(n log n)
	void testMergeSort() {
		assertArrayEquals(SA1, AllSort.MergeSort(UA1), "Test 1: ");
		assertArrayEquals(SA2, AllSort.MergeSort(UA2), "Test 2: ");
	}
	
	@Test //O(n log n)
	void testSortFunction() {
		assertArrayEquals(SA1, AllSort.SortFunction(UA1), "Test 1: ");
		assertArrayEquals(SA2, AllSort.SortFunction(UA2), "Test 2: ");
	}
	
	@Test //O(n^2)
	void testBubbleSort() {
		assertArrayEquals(SA1, AllSort.BubbleSort(UA1), "Test 1: ");
		assertArrayEquals(SA2, AllSort.BubbleSort(UA2), "Test 2: ");
	}
	
	@Test //O(n log n)
	void testQuickSort() {
		assertArrayEquals(SA1, AllSort.QuickSort(UA1), "Test 1: ");
		assertArrayEquals(SA2, AllSort.QuickSort(UA2), "Test 2: ");
	}
}
