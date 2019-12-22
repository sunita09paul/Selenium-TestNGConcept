package com.testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo1 {
  @BeforeMethod
  public void setupapplication() {
	  System.out.println("Launch the browser");
  }
  
  @Test(groups= {"regression"})
  public void login() {
	 System.out.println("Todays other team member changes");

	  System.out.println("Login for applications");
  }
  @Test(groups = {"beta"})
  public void applicant () {
	  System.out.println("Create new appicant");
  }
  @Test(groups = {"regression"})
  public void allcheck() {
	  System.out.println("validate the all check");
  }
  @AfterMethod
  public void closepage() {
	  System.out.println("close the browser history");
  }
  @Test
  public void test1() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		driver.manage().window().maximize();
		WebElement checkbox = driver.findElement(By.id("isAgeSelected"));
		checkbox.click();
		
	boolean value =	checkbox.isSelected();
	System.out.println(value);
  }
  }

