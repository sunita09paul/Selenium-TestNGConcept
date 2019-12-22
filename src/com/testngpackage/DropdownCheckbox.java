package com.testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownCheckbox extends Mainclass{
	@Test(enabled= false)
	public void dropdownsection() {
		
		driver.get("https://demoqa.com/selectmenu/");
		
		WebElement speed = driver.findElement(By.xpath("//span[@id='speed-button']"));
		
		Select drpdwn = new Select(speed);
		drpdwn.selectByVisibleText("slow");
		
	}
	@Test
	public void checkbox() {
		driver.get("https://demoqa.com/checkboxradio/");

		WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkbox-nested-1']"));
		checkbox.click();
		
		
	}

}
