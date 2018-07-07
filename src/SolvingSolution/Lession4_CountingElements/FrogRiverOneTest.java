package SolvingSolution.Lession4_CountingElements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FrogRiverOneTest {

	@Test
	void testSolution() {
		assertEquals(6, FrogRiverOne.solution(5, new int[] {1,3,1,4,2,3,5,4}), "Test 1: ");
	}

}
