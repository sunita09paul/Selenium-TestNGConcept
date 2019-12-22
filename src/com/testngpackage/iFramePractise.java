package com.testngpackage;

import org.openqa.selenium.By;

public class iFramePractise extends Mainclass {
	
	public void iframehandle() {
		
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		
		driver.switchTo().frame("iframe1");
		
		WebElement lnk = driver.findElement(By.xpath(xpathExpression))
	}

}
