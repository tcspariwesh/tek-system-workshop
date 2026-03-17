package com.tek.day6.unit.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathTest {
	Math math;

	@BeforeEach
	void setup() {//called before every test method
		math = new Math();// A -arrange
	}

	@Test
	void testAdd() {
		int result = math.add(2, 5);// A-> Act
		assertEquals(7, result); // A->assert
	}

	@Test
	void testAddNegativeNumbers() {
		int result = math.add(-2, -5);// A-> Act
		assertEquals(-7, result); // A->assert
	}

	@Test
	void testAddNegativeAndPositiveNumbers() {
		int result = math.add(2, -5);// A-> Act
		assertEquals(-3, result); // A->assert
	}
}
