package org.check;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Capcicum {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("i am before class");
	}
	@Before
	public void before() {
		System.out.println("i am before");
	}
	@Test
	public void TestR() {
		Assert.assertEquals("contains", false);
		System.out.println("i am test R");
	}
	@Test
	public void testQ() {
		System.out.println("i am test Q");
	}
	@Ignore
	@Test
	public void testP() {
		System.out.println("i am test P");
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
