package org.check;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class Apple {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("i am before class");
	}
	@Before
	public void before() {
		System.out.println("i am before");
	}
	@Test
	public void TestA() {
		Assert.assertEquals("Verify result", false);
		System.out.println("i am test A");
	}
	@Test
	public void testB() {
	System.out.println("i am test B");
	}
	@Test
	public void testC() {
		System.out.println("i am test C");
	}
	@After
	public void after() {
		System.out.println("i am After");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("i am After Class");
	}
	
}
