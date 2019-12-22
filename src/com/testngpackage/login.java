package com.testngpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class login extends Mainclass {
  @Test(enabled = false)
 public void simpleform() {
			driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
			
			WebElement checkbox = driver.findElement(By.xpath("//input[@class='cb1-element']"));
			
			checkbox.click();
			 boolean vaule = checkbox.isSelected();
			 System.out.println(vaule);
			
		}
		
	@Test(enabled = false)
	public void forword() throws InterruptedException {
		
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.navigate().refresh();
		driver.navigate().to("https://www.google.com");
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.getCurrentUrl();
		}
@Test(enabled = false)
public void dropdown() {
	
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	WebElement dropdownlist = driver.findElement(By.id("select-demo")) ;
	
	Select sc = new Select(dropdownlist);
	
	sc.selectByIndex(1);
			//sc.selectByValue("Saturday");
			//sc.selectByVisibleText("Thursday");

	WebElement selectedvalue = sc.getFirstSelectedOption();
	System.out.println(selectedvalue.getText());
	
}
@Test(enabled =false)
public void dropdownoptions() {
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
WebElement dropdownlist = driver.findElement(By.id("select-demo")) ;
	
	Select sc = new Select(dropdownlist);
	

	List<WebElement> alloptions =  sc.getOptions();
	
	for(WebElement option : alloptions) {
		System.out.println(option.getText());
	}
}
@Test
public void multidropdownselection() {
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	WebElement dropdownlist = driver.findElement(By.id("multi-select")) ;
		
		Select sc = new Select(dropdownlist);
		
		sc.selectByValue("Texas");
		sc.selectByValue("Ohio");
		
		List<WebElement> selectedOptions = sc.getAllSelectedOptions();
		for(WebElement option : selectedOptions) {
			System.out.println(option.getText());
		}
		
}
 }

