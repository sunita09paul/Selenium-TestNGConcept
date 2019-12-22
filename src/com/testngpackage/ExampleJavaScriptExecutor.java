package com.testngpackage;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;

public class ExampleJavaScriptExecutor extends Mainclass {
	
	//Enter the text without using the Sendkeys method
	
	public void firstmethis() {
		
		driver.get("stgvetty.co.in");
		JavascriptExecutor  js = (JavascriptExecutor) driver;
       js.executeScript("History.go(0)");
       
       
		
		
	}
	
	
	

}
