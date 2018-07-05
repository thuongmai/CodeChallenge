package SolvingSolution.Lession3_TimeComplexity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FrogJmpTest {

	@Test
	void testFrogJump() {
		assertEquals(3, FrogJmp.solution(10,85,30), "Test 1: ");
		assertEquals(142730189, FrogJmp.solution(3,999111321,7), "Test 2: ");
	}

}
