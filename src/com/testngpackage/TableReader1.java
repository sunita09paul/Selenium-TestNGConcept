package com.testngpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableReader1 extends Mainclass{
	
	public void tableReader() {
		driver.get("http://testautomationpractice.blogspot.com/");
		
		List<WebElement> row = driver.findElement(By.xpath(//table/tbody/tr));
				
				for(WebElement rows : row) {
					
					List<WebElement> column = rows.findElements(By.xpath(td))
					
					
				}
	}

}











