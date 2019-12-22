package com.testngpackage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//Javvascript pop up
import org.testng.annotations.Test;

public class javascriptpopup extends Mainclass {
  @Test
  public void alertpop() throws InterruptedException {
	  
	  driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	  
WebElement atr = driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));

    atr.click();
	  
      Alert alt = driver.switchTo().alert();
    //  alt.dismiss();
      Thread.sleep(3000);
      alt.sendKeys("Sumit");
      alt.accept();
      alt.getText();
      
      
  }
}



