package com.demo.step;

import org.testng.annotations.Test;

public class NewTest4 {
	
  @Test(dataProvider="TestData", dataProviderClass=DataProviderTestClass.class)
  public void f(String user1, String pass1) {
	  System.out.println(user1);
	  System.out.println(pass1);
	  
  }
  
  @Test(dataProvider = "TestDataLogin", dataProviderClass = DataProviderTestClass.class ) 
	  public void f2(String user , String pass) {
	  System.out.println(user);
	  System.out.println(pass);
  }
}
