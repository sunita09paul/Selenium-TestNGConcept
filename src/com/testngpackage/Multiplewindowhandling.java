package com.testngpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Multiplewindowhandling extends Mainclass {
	@Test
	public void windowhandle() {
		
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		
		String parentwin = driver.getWindowHandle();
		
		WebElement btn = driver.findElement(By.id("followall"));
		btn.click();
		
		Set<String> childwin= driver.getWindowHandles();
		/*
		Iterator it = childwin.iterator();
		
		String windows = (String) it.next();
		driver.switchTo().window(windows);
		*/
		for (String win : childwin) {
			String title = driver.switchTo().window(win).getTitle();
			System.out.println(driver.getTitle());
			if(title.contains("Twitter")) {
				break;
			}
		}
	}

}
