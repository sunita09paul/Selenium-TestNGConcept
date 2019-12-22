package com.demo.step;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestClass {
  @DataProvider(name = "Testdata")
	 public Object [][]	 getData(){
			
			return new Object [][] {
				{"user1","pass1"},
				{"user2","pass2"},
};
  }
@DataProvider (name = "TestDataLogin")
public Object [][]getData1(){
	
	return new Object[][] {
		{"Sunita","Paul"},
		{"Sunita","Paul"},
	};
}





@DataProvider(name= "homepage data")
	public Object[][] getdatanew(){
		return new Object[][]
	}
	{"Sunita","gfhg"},
	{"fhgf","hgfghf"}
}





}
