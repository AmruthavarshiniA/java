package com.testapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {
	
	private ShoppingCart cart=new ShoppingCart();
	Product p1;
	Product p2;

	@BeforeEach
	public void addDefaults() {
		p1=new Product("soap",10);
		p2=new Product("book",12);
		cart.AddItem(p1);
		cart.AddItem(p2);
	}
	
	@Test
	void testAddItem() {
		assertEquals(2, cart.getItemsCount());
	}
	
	@Test
	void testRemove() throws ProductNotFoundException {
		cart.removeProduct(p1);
		assertEquals(1,cart.getItemsCount());
	}
	
	@Test
	void testBalance() {
		assertEquals(22.0, cart.getBalance());
	}

}
