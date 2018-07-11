package SolvingSolution.Lession6_Sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AllSearchTest {

	int[] a = new int[] {1,2,3,4,5,6};
	int[] b = new int[10000000];
	
	AllSearchTest() {
		for (int i = 0; i < b.length; i++)
			b[i] = i;
	}
	
	@Test //Take O(n)
	void testBinarySearch() {
		assertEquals(4, AllSearch.BinarySearch(a, 5), "Test 1: ");
		assertEquals(587539, AllSearch.BinarySearch(b, 587539), "Test 2: ");
	}

}
