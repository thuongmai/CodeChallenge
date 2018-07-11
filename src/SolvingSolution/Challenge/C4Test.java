package SolvingSolution.Challenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class C4Test {

	@Test
	void testSolution() {
		assertEquals("24A0-R74K", C4.solution("2-4A0r7-4k", 4), "Test 1: ");
		assertEquals("24-A0R-74K", C4.solution("2-4A0r7-4k", 3), "Test 2: ");
	}

}
