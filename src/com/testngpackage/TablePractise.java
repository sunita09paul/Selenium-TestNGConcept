package com.testngpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.testngpackage.Mainclass;

public class TablePractise extends Mainclass{
  @Test
  public void function1() {
	  driver.get("https://www.toolsqa.com/automation-practice-table/");
	  
	  List<WebElement> allrows = driver.findElements(By.xpath("//table/tbody/tr[1]"));
	  
	  for(WebElement row : allrows) {
		  
		  List <WebElement> columns = row.findElements(By.xpath("td"));
		  
		  for(WebElement column : columns) {
			  System.out.println(column.getText());
			  
		  }
		  }
	  }
}
