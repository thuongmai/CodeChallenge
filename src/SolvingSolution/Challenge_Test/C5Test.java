package SolvingSolution.Challenge_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import SolvingSolution.Challenge.C5;

class C5Test {

	@Test
	void testFindArrayWithSum() {
		assertEquals(0, C5.FindArrayWithSum(new int[] { 1, 2, 3, 9 }, 8), "Test 1: ");
		assertEquals(1, C5.FindArrayWithSum(new int[] { 1, 2, 4, 4 }, 8), "Test 2: ");
	}
	
	@Test
	void testFind2() {
		assertEquals(0, C5.Find2(new int[] { 1, 2, 3, 9 }, 8), "Test 3: ");
		assertEquals(1, C5.Find2(new int[] { 1, 2, 4, 4 }, 8), "Test 4: ");
	}
	
	@Test
	void testFind3() {
		assertArrayEquals(new int[] {1,3}, C5.Find3(new int[] { 1, 5, 3, 4 }, 9), "Test 5: ");
	}

}
