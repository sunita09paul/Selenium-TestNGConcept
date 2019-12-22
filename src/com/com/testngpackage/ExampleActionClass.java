package com.testngpackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

import com.testngpackage.Mainclass;

public class ExampleActionClass extends Mainclass{
  @Test
  public void f() {
	  
	  driver.get("https://demoqa.com/checkboxradio/");
	  /*
	  JavascriptExecutor  js = (JavascriptExecutor) driver;
	  js.executeScript("document.getelementId(//input[@class='firstname']).value='sunita';");
	  */
	  Actions  ac = new Actions(driver);
	  ac.moveToElement(target).perform();
	  
	  
	  
  }
}
