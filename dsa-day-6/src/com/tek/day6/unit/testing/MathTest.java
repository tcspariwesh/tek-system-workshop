package com.tek.day6.unit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest {

	@Test
	void testAdd() {
		Math math = new Math();//A -arrange
		int result = math.add(2, 5);//A-> Act
		assertEquals(7, result);		//A->assert
	}
	
	@Test
	void testAddNegativeNumbers() {
		Math math = new Math();//A -arrange
		int result = math.add(-2, -5);//A-> Act
		assertEquals(-7, result);		//A->assert
	}
	@Test
	void testAddNegativeAndPositiveNumbers() {
		Math math = new Math();//A -arrange
		int result = math.add(2, -5);//A-> Act
		assertEquals(-3, result);		//A->assert
	}
}
