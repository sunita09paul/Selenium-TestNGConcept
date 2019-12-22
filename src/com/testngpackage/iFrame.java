
package com.testngpackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class iFrame extends Mainclass{
  @Test
  public void f() {
	  
	  driver.get("https://www.toolsqa.com/iframe-practice-page/");
	  
	  driver.switchTo().frame("iframe1");
	  
	//  driver.switchTo().fra
	  driver.findElement(By.name("s")).sendKeys("Sunita");
	  
	  
  }
  
  
  
}

















