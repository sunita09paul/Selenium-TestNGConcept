package com.testngpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Javascriptpopup1 extends Mainclass{
	@Test
	public void javascriptpop() {
		 driver.get("http://testautomationpractice.blogspot.com/");
		 WebElement checkbox = driver.findElement(By.xpath("//button[text()='Click Me'] "));
		 checkbox.click();
		 
		 Alert alt = driver.switchTo().alert();
	//	 alt.accept();
		 alt.getText();
	}

}
