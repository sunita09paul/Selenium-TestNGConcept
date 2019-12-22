package com.testngpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownMultipleSelection  extends Mainclass {

	@Test
	public void dropdowmultiple() {
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement buttonclk = driver.findElement(By.id("multi-select"));
		
		
		Select drpdwn = new Select(buttonclk);
		
		List<WebElement> values = drpdwn.getOptions();
		for(WebElement drpvalues : values ) {
			System.out.println(drpvalues.getText());
		}
		
		
		
		
	}
}
