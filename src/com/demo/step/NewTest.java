package com.demo.step;

import org.testng.annotations.Test;

import com.demo.properties.test.GetProperties;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	public static WebDriver driver;
	GetProperties prop = new GetProperties();
	
  @Test
  public void f() {
	  String username = prop.getProperties("username");
	  String password = prop.getProperties("password");
	  
	  System.out.println(username);
	  System.out.println(password);
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Automation\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  String url = prop.getProperties("url");
	  System.out.println(url);
	  driver.get(url);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
