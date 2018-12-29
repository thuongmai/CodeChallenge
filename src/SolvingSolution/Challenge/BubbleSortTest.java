package SolvingSolution.Challenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleSortTest {
	int[] expectedArr = new int[] {1, 2, 4, 5, 8};
	@Test
	void test() {
		assertArrayEquals(expectedArr, BubbleSort.BubbleSort(new int[] {5, 1, 4, 2, 8}), "Test 1");
	}

}
