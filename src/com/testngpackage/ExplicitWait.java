package com.testngpackage;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait extends Mainclass{
	private static final Function ExpectedConditions = null;

	@Test
	public void practiseone() {
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
	WebElement Clickbutton = driver.findElement(By.xpath("//button[text()='Click me to start timer'] "));
		
	Clickbutton.click();
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	WebElement element = wait.until(ExpectedConditions.)
	
	WebElement ele=  driver.findElement(By.xpath("//p[text()='WebDriver'] "));
	
	
	
	boolean status = ele.isDisplayed();
	System.out.println(status);
	}

}
