package com.arvest.CatProject;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class BritishShorthairTest extends CatTest {
		
	private static Cat Jumb;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//super.setUpBeforeClass();
		Jumb = new Cat("Sam", "Female", 3, 9.2, true);
		
	}

	@Test //Annotations
	public void mehom() {
		assertTrue(Jumb instanceof BritishShorthair);
		assertEquals("Sam", Jumb.getName());

	}

}
