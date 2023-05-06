package org.unit;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JUnitTestCaseDay1 {
	
	static WebDriver driver;
	
	@BeforeClass   
	public static void beforeClass() { 
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
		System.out.println("Before Class");
	}
	
	@Before 
	public  void before() {
		Date d = new Date();
		System.out.println("Test Start time......"+d);
		System.out.println("Before");
	}
	@Test
	public void test1() throws InterruptedException {
		driver.navigate().to("https://www.facebook.com/");
		WebElement createbtn = driver.findElement(By.xpath("//a[contains(@ajaxify,'/reg')]"));
	//Verify url
		String title = driver.getTitle();
		boolean contains = title.contains("Facebook");
		Assert.assertTrue(contains);
		System.out.println("Verify Url...."+contains);
		
		createbtn.click();
		Thread.sleep(5000);
		
		WebElement fstname = driver.findElement(By.xpath("(//input[contains(@id,'u')])[1]"));
		fstname.sendKeys("vijaya");
	//Verify Firstname
	    String attribute = fstname.getAttribute("value");
	    boolean contains2 = attribute.contains("vijaya");
	    Assert.assertEquals("vijaya", attribute);
	    System.out.println("Verify Firstname....."+contains2);
	    
		WebElement lstname = driver.findElement(By.xpath("(//input[contains(@id,'u')])[2]"));
		lstname.sendKeys("ragavan");
	//Verify Lastname
		String attribute2 = lstname.getAttribute("value");
		boolean contains3 = attribute2.contains("ragavan");
		Assert.assertEquals("ragavan", attribute2);
		System.out.println("Verify Lastname...."+contains3);
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		email.sendKeys("arnold@gmail.com");
	//Verify Email
		String attribute3 = email.getAttribute("value");
		boolean contains4 = attribute3.contains("arnold@gmail.com");
		Assert.assertEquals("arnold@gmail.com", attribute3);
		System.out.println("Verify Email....."+contains4);
		
		WebElement email1 = driver.findElement(By.xpath("(//input[contains(@name,'reg')])[2]"));
		email1.sendKeys("arnold@gmail.com");
		String attribute4 = email1.getAttribute("value");
		boolean contains5 = attribute4.contains("Arnold@gmail.com");
		Assert.assertEquals("arnold@gmail.com", attribute4);
		System.out.println("Verify Email1...."+contains5);
		
		WebElement password = driver.findElement(By.xpath("(//input[contains(@name,'reg')])[3]"));
		password.sendKeys("38348389");
	//Verify Password
		String attribute5 = password.getAttribute("value");
		boolean contains6 = attribute5.contains("38348389");
		Assert.assertEquals("38348389", attribute5);
		System.out.println("Verify password...."+contains6);
		
		WebElement date = driver.findElement(By.xpath("(//select[contains(@class,'_9407')])[1]"));
		Select s = new Select(date);
		s.selectByIndex(9);
	//Verify Date
		boolean selected = date.isSelected();
		Assert.assertTrue(selected);
		System.out.println("Verify Date...."+selected);  // Incomplete
		
		
		WebElement month = driver.findElement(By.xpath("(//select[contains(@class,'_8esg')])[2]"));
		Select s1= new Select(month);
		s1.selectByValue("1");
		
		WebElement year = driver.findElement(By.xpath("(//select[contains(@class,'_5dba')])[3]"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("2022");
		
		WebElement checkbox = driver.findElement(By.xpath("(//label[contains(@class,'_58mt')])[2]"));
		checkbox.click();
		
		System.out.println("Test1");
	}
	@Ignore
	@Test  //--->>> It is used to write a code as a TestCase
	public void test2() {
		driver.navigate().to("https://www.facebook.com/");
		WebElement txtuser = driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]"));
		txtuser.sendKeys("navagar");
		WebElement txtpass = driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[2]"));
		txtpass.sendKeys("ragavan");
		WebElement loginbtn = driver.findElement(By.xpath("//button[contains(@id,'u')]"));
		loginbtn.click();
		
		System.out.println("Test2");
	}
	
	@Ignore  //-->>> if we want to skip any TestCase just mention @Ignore anatation upon the @Test anatation
	@Test  //--->>> It acts like main method so that we are not using main method in JUnit framework
	public void test3() {
		System.out.println("Test3");
		

	}
	
	@After  //--->>> This is used to set a end time 
	public void after() {
		Date d = new Date();
		
		System.out.println("Test end time......"+d);
		
		System.out.println("After");
	}
	
	@AfterClass  //--->>> This anatation used to quit the browser
	public static void AfterClass() {
//		driver.quit();
		
		System.out.println("After Class");
	}
}
