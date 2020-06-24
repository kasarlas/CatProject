package com.arvest.CatProject;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CatTest {
	
	private static Cat felix;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		felix = new Cat("Felix", "male", 6, 10.2, true);
		
	}

	@Test
	//<method under test>_<GivenParameters>_<Result you Expert>()
	public void cat_GivenThreeParameters_ShouldConstructCat() {
		assertTrue(felix instanceof Cat);
		assertEquals("Felix", felix.getName());
		assertEquals("male", felix.getGender());
		assertEquals(6, felix.getAge());
		assertNotEquals(7, felix.getAge());
		//assertEquals(10, felix.getWeight());
		System.out.println("Cat Name is " + felix.getName());
		System.out.println("Felix age is " + felix.getAge());
		System.out.println("Felix gender is " + felix.getGender());
		System.out.println("Felix Weight is " + felix.getWeight());
			
	}
	
	}


