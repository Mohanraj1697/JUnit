package org.test;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon extends BaseClass{

	public static void main(String[] args) {
		browserLaunch("chrome");
		
		urlLaunch("https://www.amazon.in/");
		
		implicitlyWait(20);
		WebElement a = driver.findElement(By.xpath("//input[@type='text']"));
		sendKeys(a, "redmi");
		WebElement b = driver.findElement(By.xpath("//input[@type='submit']"));
		b.click();
		
		List<WebElement> c = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (int i = 0; i < c.size(); i++) {
			WebElement s = c.get(i);
			String t = s.getText();
			System.out.println(t);
		}
		List<WebElement> d = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for (int i = 0; i < d.size(); i++) {
			WebElement s1 = d.get(i);
			String t1 = s1.getText();
			System.out.println(t1);
		}
		System.out.println("================================");
		WebElement a1 = driver.findElement(By.xpath("(//span[@aria-hidden='true'])[11]"));
		String text = a1.getText();
		System.out.println(text.toString());
	
	}
}
