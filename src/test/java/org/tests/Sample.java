package org.tests;

import java.sql.Driver;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("beforclass run");
	}
	
	@Before
	public void befor() {
		driver.manage().window().maximize();
		Date d=new Date();
		System.out.println("==start time=="+d);
		System.out.println("before run");
	}
	
	@Test
	public void test() throws InterruptedException {
		
		driver.get("https://www.currys.com/");
		
		Actions a=new Actions(driver);
		
		WebElement txtemail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtemail.sendKeys("rajmohan1651997@gmail.com");
		WebElement btcancel = driver.findElement(By.xpath("//div[@class='omnisend-form-6329e322c4cd34322319c16f-close-action-wrapper']"));
		btcancel.click();
		WebElement clicklogin = driver.findElement(By.xpath("//a[@class='header__action-item-link hidden-pocket hidden-lap']"));
		Thread.sleep(3000);
		clicklogin.click();
		WebElement txtemail1 = driver.findElement(By.xpath("//input[@name='customer[email]']"));
		txtemail1.sendKeys("rajmohan1651997@gmail.com");
		WebElement txtpass = driver.findElement(By.xpath("//input[@name='customer[password]']"));
		txtpass.sendKeys("Mohan@97");
		WebElement btnlogin = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		btnlogin.click();
		
		WebElement txtpaint = driver.findElement(By.xpath("(//a[@class='nav-bar__link link'])[1]"));
		Thread.sleep(3000);
		a.moveToElement(txtpaint).perform();
		WebElement txtstepone = driver.findElement(By.xpath("(//a[@class='mega-menu__link link'])[1]"));
		Thread.sleep(3000);
		a.moveToElement(txtstepone).perform();
		a.click(txtstepone).perform();
//		WebElement txtget = driver.findElement(By.xpath("//div[@class='collection__meta-inner']//child::h1[text()='Heavy Body Acrylic']"));
//		String txt1 = txtget.getText();
//		System.out.println(txt1);
		List<WebElement> txtproductname = driver.findElements(By.xpath("//a[@class='product-item__title text--strong link']"));
		for (WebElement x : txtproductname) {
			String txt = x.getText();
			System.out.println(txt);
			System.out.println("=====================================================================");
		}
		List<WebElement> txtproductprice = driver.findElements(By.xpath("//span[@class='price']"));
		for (WebElement x : txtproductprice) {
			String txt2 = x.getText();
			System.out.println(txt2);
			System.out.println("=====================================================================");
		}
		
		
		System.out.println("test1 Runned---------------");
		
	}
	@Test
	public void test2() {
		driver.get("https://www.currys.com/");
		WebElement btcancel = driver.findElement(By.xpath("//div[@class='omnisend-form-6329e322c4cd34322319c16f-close-action-wrapper']"));
		Actions a=new Actions(driver);
		a.click().perform();
		WebElement clicklogin = driver.findElement(By.xpath("//a[@class='header__action-item-link hidden-pocket hidden-lap']"));
		clicklogin.click();
		WebElement txtemail1 = driver.findElement(By.xpath("//input[@name='customer[email]']"));
		txtemail1.sendKeys("rajmohan@gmail.com");
		WebElement txtpass = driver.findElement(By.xpath("//input[@name='customer[password]']"));
		txtpass.sendKeys("Mohan@97");
		WebElement btnlogin = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		btnlogin.click();
		
		
		
		
		System.out.println("test2---------------");
	}
	@After
	public void after() {
		Date d=new Date();
		System.out.println("==finish time=="+d);
		System.out.println("after run");
		
		
	}
	
	@AfterClass
	public static void AfterClass() {
		driver.quit();
		System.out.println("afterclass run");
	}
	
	
	
	
	
	
}
