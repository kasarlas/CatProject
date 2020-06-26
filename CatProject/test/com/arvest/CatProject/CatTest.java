package com.arvest.CatProject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CatTest {
	
	private static Cat felix;
	private static Cat felix1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		felix = new Cat("Felix", "male", 6, 10.2, true);
		felix1 = new Cat("Felix", "female", 6, 10.2, false);
		
	}
	
	@Test
	//<method under test>_<GivenParameters>_<Result you Expert>()
	public void cat_GivenThreeParameters_ShouldConstructCat() {
		assertTrue(felix instanceof Cat);
		assertEquals("Felix", felix.getName());
		assertEquals("male", felix.getGender());
		assertEquals(6, felix.getAge());
		assertNotEquals(7, felix.getAge());
		assertEquals(10.2, felix.getWeight(),0);
		assertTrue(felix.isAMouser());
		System.out.println("Cat Name is " + felix.getName());

	}
	@Test
	//<method under test>_<GivenParameters>_<Result you Expert>()
	public void cat_Loop() {
	felix.jump(10);

	}
	@Test
	//<method under test>_<GivenParameters>_<Result you Expert>()
	public void cat_true() {
		assertTrue(felix.isAMouser());
		assertFalse(felix1.isAMouser());

	}
	@Test
	public void meow_givenStringandSize_shouldReturnarrayofString(){
		int length =10;
		String catSez = "meow";
		String[] strings = felix.meow(catSez, length);
		assertEquals(length, strings.length);
		for(int i=0; i<length; i++){
		assertEquals(catSez, strings[1]);
	}	
	}
}
