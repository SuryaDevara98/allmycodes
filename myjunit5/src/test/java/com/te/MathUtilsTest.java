package com.te;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mu = new MathUtils();
		mu.add(10, 20);
		int actual = mu.add(10, 20);
		assertEquals(30, actual, "This method gives addition of two numbers");
	}

	@Test
	void testSub() {
		MathUtils mu = new MathUtils();
		mu.sub(10, 20);
		int actual = mu.sub(10, 20);
		assertEquals(-10, actual, "This method gives minus of two numbers");
	}

	@Test
	void testMultiply() {
		MathUtils mu = new MathUtils();
		mu.multiply(1, 20);
		int actual = mu.multiply(1, 20);
		assertEquals(20, actual, "This method gives multiply of two numbers");
	}

}
