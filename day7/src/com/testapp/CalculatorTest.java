package com.testapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		
		assertEquals(25, new Calculator().add(12, 13));
	}
	

}

