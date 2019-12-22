package com.testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WindowpopdemoTest extends Mainclass {
  @Test
  public void f() {
	  
	  driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
	  
	  String parentwin = driver.getWindowHandle();
	  
	  WebElement btn = driver.findElement(By.xpath("//a[text()='  Follow On Twitter ']"));
	  btn.click();
	  
	  String childwin = driver.getWindowHandle();
	  
	  System.out.println(driver.getTitle());
	  
	  driver.manage().window().maximize();
	  
	  WebElement checkboox = driver.findElement(By.xpath("//input[@name='remember_me']"));
	  checkboox.click();
	  
	  boolean val = checkboox.isSelected();
	  System.out.println(val);
	  
	  driver.switchTo().window(parentwin);
 }
}
