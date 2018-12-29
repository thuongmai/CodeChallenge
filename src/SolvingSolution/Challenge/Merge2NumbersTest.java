package SolvingSolution.Challenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Merge2NumbersTest {

	@Test
	void test() {
		assertEquals(1526, Merge2Numbers.solution(12, 56), "Test 1");
		assertEquals(16273845, Merge2Numbers.solution(12345, 678), "Test 2");
		assertEquals(16273890, Merge2Numbers.solution(123, 67890), "Test 3");
		assertEquals(-1, Merge2Numbers.solution(100000, 100000), "Test 4");
	}

}
