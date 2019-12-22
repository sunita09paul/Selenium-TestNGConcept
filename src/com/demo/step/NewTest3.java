package com.demo.step;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest3 {
	
	@Parameters({"envName", "browser", "browser1"})
  @Test(groups = {"smoke"}, enabled = false)
  public void Test(String envName, String browser, String browser1) {
	  System.out.println(envName);
	  System.out.println(browser);
	  System.out.println(browser1);
  }
	@Test( groups= {"smoke"}, enabled = false)
  public void Test2 (){
	  System.out.println("Test2");
  }
	
	@Test(groups= {"sanity"}, enabled = false)
	public void Test3() {
		System.out.println("Test3");
	}

	@DataProvider(name = "Testdata")
 public Object [][]	 getData(){
		
		return new Object [][] {
			{"user1","pass1"},
			{"user2","pass2"},
			{"user3","pass3"}
		};
	}
	
	@Test(dataProvider = "Testdata", groups= {"smoke"})
	public void Test5(String user , String password) {
		System.out.println(user);
		System.out.println(password);
	}
}













	
	
	
	
	
	
	
	
	
	
	
	
