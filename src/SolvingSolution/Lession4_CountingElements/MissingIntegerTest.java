package SolvingSolution.Lession4_CountingElements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MissingIntegerTest {

	@Test
	void testSolution() {
		assertEquals(5, MissingInteger.solution(new int[] {1,3,6,4,1,2}), "Test 1: ");
		assertEquals(4, MissingInteger.solution(new int[] {1,2,3}), "Test 2: ");
		assertEquals(1, MissingInteger.solution(new int[] {-1,-3}), "Test 3: ");
	}

}
