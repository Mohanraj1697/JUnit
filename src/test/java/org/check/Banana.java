package org.check;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Banana {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("i am before class");
	}
	@Before
	public void before() {
		System.out.println("i am before");
	}
	@Test
	public void TestZ() {
		System.out.println("i am test Z");
	}
	@Test
	public void testX() {
		System.out.println("i am test X");
	}
	@Ignore
	@Test
	public void testY() {
		System.out.println("i am test Y");
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
