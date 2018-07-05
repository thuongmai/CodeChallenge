package SolvingSolution.Lession3_TimeComplexity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PermMissingElemTest {

	@Test
	void testSolution() {
		assertEquals(4, PermMissingElem.solution(new int[] {2, 3, 1, 5}), "Test 1 Simple Test: ");
		assertEquals(1, PermMissingElem.solution(new int[] {3, 2, 4, 5}), "Test 2 Missing First: ");
		assertEquals(5, PermMissingElem.solution(new int[] {2, 3, 1, 4}), "Test 3 Missing Last: ");	
	}

}
