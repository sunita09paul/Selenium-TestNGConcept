package com.testngpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ReadTable extends Mainclass{
  @Test
  public void f() {
	  
	  driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
	  
	  List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
	  
	  //(table//tbody//tr)
		for (WebElement row : rows) {
			List<WebElement> column = row.findElements(By.xpath("td"));
			for(WebElement col : column) {
				System.out.println(col.getText());
			}
		}
		
		
		
		
  }
  
  //*****//table//tbody//tr/td[text()='sunita']-----want to single column value
  
  //*****table//tbody//tr[1]---------read the single row
	/*
  @Test
		public void firstrow() {
			
			List<WebElement> rows = driver.findElements(By.xpath(xpathExpression));
		}
	*/		  
  }
  
  
  
  
  
  
  
  

