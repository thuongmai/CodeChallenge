package SolvingSolution.Challenge_Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import SolvingSolution.Challenge.DynamicProgramming;

class DynamicProgrammingTest {

	@Test
	void testNaiveSolve() {
		assertEquals(1134903170 , DynamicProgramming.NaiveSolve(45), "Test 1: ");
	}

	@Test
	void testDynamicSolve() {
		assertEquals(8 , DynamicProgramming.DynamicSolve(5), "Test 2: ");
	}
	
	@Test
	void testOptimizedSpaceSolve() {
		assertEquals(8 , DynamicProgramming.OptimizedSpaceSolve(5), "Test 2: ");
	}
}
