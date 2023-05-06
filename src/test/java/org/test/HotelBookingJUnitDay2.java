  
package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class HotelBookingJUnitDay2 extends AdactinElementJUnit {
	
	@BeforeClass
	public static void beforeClass() {
		browserLaunch("chrome");
 
		implicitlyWait(10);

		System.out.println("Before Class");

	}

	@Before
	public void before() {
		Date d = new Date();
		System.out.println("Test Start Time......"+d);
		System.out.println("Before");

	}
	@Test
	public void xTest() throws InterruptedException {
		
		HotelBookingJUnitDay2 hbj = new HotelBookingJUnitDay2();
		
		selectByIndex(hbj.getLocation(),3);
	// Verify Hotel Location
		String attribute6 = getAttribute(hbj.getLocation());
		boolean contains = attribute6.contains("Brisbane");
		Assert.assertTrue(contains);
		System.out.println("Verify Location...."+contains);
		

		selectByValue(hbj.getHotel(),"Hotel Sunshine");
	//Verify Hotel
		String attribute7 = getAttribute(hbj.getHotel());
		boolean contains2 = attribute7.contains("Hotel Sunshine");
		Assert.assertTrue(contains2);
		System.out.println("Verify Hotel....."+contains2); 

		
		selectByVisibleText(hbj.getRoomtype(),"Super Deluxe");
	// Verify Room Type
		String attribute5 = getAttribute(hbj.getRoomtype());
		boolean contains3 = attribute5.contains("Super Deluxe");
		Assert.assertTrue(contains3);
		System.out.println("Verify Room Type....."+contains3);
		

		selectByValue(hbj.getRoomcount(),"2");
	//Verify Room Type
		String attribute4 = getAttribute(hbj.getRoomcount());
		boolean contains7 = attribute4.contains("2");
		Assert.assertTrue(contains7);
		System.out.println("Verify Room Count...."+ contains7);
		
		clear(hbj.getCheckin());
		
		sendKeys(hbj.getCheckin(),"11/01/2023");
	// Verify Checkin Date
		String attribute = getAttribute(hbj.getCheckin());
		boolean contains4 = attribute.contains("11/01/2023");
		Assert.assertEquals("11/01/2023",attribute);
		System.out.println("Verify Checkin Date......"+contains4);
		
		clear(hbj.getCheckout());
		
		sendKeys(hbj.getCheckout(),"18/01/2023");
	//Verify Checkout Date
		String attribute2 = getAttribute(hbj.getCheckout());
		boolean contains5 = attribute2.contains("18/01/2023");
		Assert.assertEquals("18/01/2023",attribute2);
		System.out.println("Verify Checkout Date....."+contains5);
	
		selectByValue(hbj.getAdultcount(),"2");
	//Verify Adult Count
		String attribute3 = getAttribute(hbj.getAdultcount());
		boolean contains6 = attribute3.contains("2"); 
		Assert.assertTrue(contains6);
		System.out.println("Verify Adult Count...."+contains6);
	
		selectByIndex(hbj.getChildcount(),0);
	// Verify Child Count
		String attribute8 = getAttribute(hbj.getChildcount());
		boolean contains8 = attribute8.contains("0");
		Assert.assertTrue(contains8);
		System.out.println("Verify Child Count...."+contains8);
	   
		click(hbj.getSearchbtn());
		Thread.sleep(5000);
		
		System.out.println("zTest");
	}
	
	@Test
	public void vTest() throws InterruptedException {
		
		urlLaunch("https://adactinhotelapp.com/");
		
	// verify url by using Assert methods
		String currentUrl = getCurrentUrl();
		boolean contains = currentUrl.contains("adactinhotelapp");
		Assert.assertTrue("Verify url",contains); 
		System.out.println("Verify url....."+contains);
		
		HotelBookingJUnitDay2 hbo = new HotelBookingJUnitDay2();
		
		sendKeys(hbo.getTxtuser(),"12345sam");
		
	// Verify Username
		String attribute = getAttribute(hbo.getTxtuser());
		boolean contains2 = attribute.contains("12345sam");
		Assert.assertEquals("12345sam",attribute);
		System.out.println("Verify Username......"+ contains2);
		
		sendKeys(hbo.getTxtpass(),"sankar12345");
		
	// Verify Password
		String attribute2 = getAttribute(hbo.getTxtpass());
		boolean contains3 = attribute.contains("sankar12345");
		Assert.assertEquals("sankar12345",attribute2);
		System.out.println("Verify Password....."+contains3);
		
		click(hbo.getLoginbtn());
		Thread.sleep(5000);
		 System .out.println("vTest");

	}
	@Test
	public void zTest() throws InterruptedException {
		
		HotelBookingJUnitDay2 hbd = new HotelBookingJUnitDay2();
		
		click(hbd.getRadiobutton());
	//Verify Radio button
		boolean enabled = isEnabled(hbd.getRadiobutton());
		Assert.assertTrue(enabled);
		System.out.println("Verify Radio button....."+enabled);
		
		click(hbd.getContinuebtn());
		Thread.sleep(5000);
		
		sendKeys(hbd.getFirstname(),"vijaya");
	//Verify Firstname
		String attribute = getAttribute(hbd.getFirstname());
		boolean contains = attribute.contains("vijaya");
		Assert.assertEquals("vijaya",attribute);
		System.out.println("Verify Firstname......"+contains);
		
		
		sendKeys(hbd.getLastname(),"ragavan");
	//Verify lastname
		String attribute2 = getAttribute(hbd.getLastname());
		boolean contains2 = attribute2.contains("ragavan");
		Assert.assertEquals("ragavan",attribute2);
		System.out.println("Verify Lastname....."+contains2);
		
		sendKeys(hbd.getAddress(),"No.22,Peterburg street,Birsbane,Australia");
		
		String attribute3 = getAttribute(hbd.getAddress());
		boolean contains3 = attribute.contains("No.22,Peterburg street,Birsbane,Australia");
		Assert.assertEquals("No.22,Peterburg street,Birsbane,Australia",attribute3);
		System.out.println("Verify Address...."+contains3);
		
		sendKeys(hbd.getCcdno(),"9876543210123456");
	//Verify card number
		String attribute8 = getAttribute(hbd.getCcdno());
		boolean contains4 = attribute8.contains("9876543210123456");
		Assert.assertEquals("9876543210123456",attribute8);
		System.out.println("Verify Card number....."+contains4);
		
		selectByValue(hbd.getCardtype(),"MAST");
	//Verify card
		String attribute5 = getAttribute(hbd.getCardtype());
		boolean contains5 = attribute5.contains("MAST");
		Assert.assertEquals("MAST",attribute5);
		System.out.println("Verify Card Type....."+contains5);
		
		selectByValue(hbd.getExmonth(),"12");
	//verify expairy month
		String attribute4 = getAttribute(hbd.getExmonth());
		boolean contains7 = attribute4.contains(attribute4);
		Assert.assertEquals(attribute4, "12");
		System.out.println("verify eEx Month"+contains7);
		
		selectByVisibleText(hbd.getExyear(),"2022");
	// Verify Expairy Year
		String attribute6 = getAttribute(hbd.getExyear());
		boolean contains6 = attribute6.contains(attribute6);
		Assert.assertEquals(attribute6, "2022");
		System.out.println("Verify Ex Year....."+contains6);
		
		sendKeys(hbd.getCvvnum(),"933");
	//Verify Cvv Number
		String attribute7 = getAttribute(hbd.getCvvnum());
		boolean contains8 = attribute7.contains(attribute7);
		Assert.assertEquals(attribute7, "933");
		System.out.println("Verify Cvv Number....."+contains7);
		
		
		click(hbd.getBookbtn());
		Thread.sleep(5000);
		
		System.out.println("xTest");

	}
	@After
	public void after() {
		System.out.println("Test End Time......"+new Date());
		System.out.println("After");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	

}
