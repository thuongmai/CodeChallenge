package SolvingSolution.Lession6_Sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void testSolution() {
		assertEquals(1, Triangle.solution(new int[] { 10, 2, 5, 1, 8, 20 }), "Test 1: ");
		assertEquals(0, Triangle.solution(new int[] { 10, 50, 5, 1 }), "Test 1: ");
	}

}
