package SolvingSolution.Lession6_Sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxProductOfThreeTest {
	@Test
	void testSolution() {
		assertEquals(60, MaxProductOfThree.solution(new int[] { -3, 1, 2, -2, 5, 6 }), "Test 1: ");
		assertEquals(900, MaxProductOfThree.solution(new int[] { -10, -9, 3, 4, 6, 10 }), "Test 2: ");
		assertEquals(500, MaxProductOfThree.solution(new int[] { -10, -5, 3, 4, 6, 10 }), "Test 3: ");
	}
}
