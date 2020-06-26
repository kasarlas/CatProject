package com.arvest.CatProject;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class PersianTest {
	private static Persian susan;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		susan = new Persian("Susan", "Female", 2, 10.2, true);
	}

	@Test
	public void testMeow() {
		susan.meow(10);
		assertEquals("Susan", susan.getName());
		assertEquals(10.2, susan.getWeight(), 0);//we have to use delta
	}

}
