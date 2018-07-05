package SolvingSolution.Lession3_TimeComplexity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TapeEquilibriumTest {

	@Test
	void testSolution() {
		assertEquals(1, TapeEquilibrium.solution(new int[] {3, 1, 2, 4, 3}), "Test 1: ");
	}

}
