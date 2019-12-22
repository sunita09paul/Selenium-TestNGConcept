package com.testngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Mainclass {
	
	public static WebDriver driver = null;

	@BeforeMethod
  public void initilize() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Automation\\chromedriver.exe\\");
	   
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  }

  @AfterMethod(enabled =false)
  public void closebrowser() {
	  driver.close();
  }

}




