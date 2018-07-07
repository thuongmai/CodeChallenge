package SolvingSolution.Lession4_CountingElements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PermCheckTest {

	@Test
	void testSolution() {
		assertEquals(0, PermCheck.solution(new int[]{4, 1, 3}), "Test 1: ");
		assertEquals(1, PermCheck.solution(new int[]{4, 1, 2, 3}), "Test 2: ");
	}

}
