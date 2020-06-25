package com.arvest.CatProject;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class BritishShorthairTest {
	private static BritishShorthair sam;
	private static BritishShorthair sam1;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sam = new BritishShorthair("Sam", "male", 6, 10.2, true);
		sam1 = new BritishShorthair("Sam", "male", 6, 10.2, false);
	}

	@Test
	public void testMeow() {
		sam.meow(10);
//		fail("Not yet implemented");
		assertEquals("Sam", sam.getName());
		assertTrue(sam.isAMouser());
		assertFalse(sam1.isAMouser());
	}

}
