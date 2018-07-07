package SolvingSolution.Lession4_CountingElements;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MaxCountersTest {
	@Test
	void testSolution() {
		assertEquals(Arrays.asList(3,2,2,4,2), MaxCounters.solution(5, new int[] {3,4,4,6,1,4,4}), "Test 1: ");
	}
}
