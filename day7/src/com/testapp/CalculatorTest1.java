package com.testapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest1 {
	int a;
	
	@BeforeAll
	public static void callOnceBefore() {
		System.out.println("called before once");
	}
	
	@AfterAll
	public static void callOnceAfter() {
		System.out.println("called after once");
	}
	
	@BeforeEach
	public void callBefore() {
		a=10;
		System.out.println("calling before");
	}

	@AfterEach
	public void allAfter() {
		System.out.println("calling after");
	}
	@Test
	void testAdd() {
		System.out.println(a);
		assertEquals(25, new Calculator().add(12, 13));
		++a;
		System.out.println(a);
	}

	@Test
	void testDifference() {
		System.out.println(a);
		assertEquals(25, new Calculator().difference(30, 5));
		++a;
	}

	@Test
	void testMultiply() {
		System.out.println(a);
		assertEquals(25, new Calculator().multiply(5, 5));
		++a;
	}

}
