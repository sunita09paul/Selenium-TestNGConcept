package com.testngpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Windowpopdemo extends Mainclass{
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
	  
	  String pearentwin = driver.getWindowHandle();
	// System.out.println(driver.getTitle());
	  
	  WebElement btn = driver.findElement(By.xpath("//a[text()='Follow Twitter & Facebook']"));
	  btn.click();
	  
	  Set<String> childwin = driver.getWindowHandles();
	 
	  for (String win : childwin) {
		  String title = driver.switchTo().window(win).getTitle();
		  if (title.contains("Twitter")) {
			  break;
			  }
	  }
	  System.out.println(driver.getTitle());
	  WebElement textbox = driver.findElement(By.id("username_or_email"));
	  
	  textbox.sendKeys("Selenium@gmail.com");
	  Thread.sleep(3000);
	  driver.close();
	  
	  
	driver.switchTo().window(pearentwin);
	  
  }
}
