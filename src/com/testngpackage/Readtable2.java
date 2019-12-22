package com.testngpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Readtable2 extends Mainclass{
  @Test
  public void ftest() {
	  driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
	  
	  List<WebElement> rows =  driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr[1]"));
	  
	  for(WebElement row : rows) {
		  WebElement column = row.findElement(By.xpath("td[2]"));
System.out.println(column.getText());
         }
	  }
  }

