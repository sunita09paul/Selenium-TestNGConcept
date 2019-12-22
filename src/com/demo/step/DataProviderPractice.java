package com.demo.step;

import org.testng.annotations.DataProvider;

public class DataProviderPractice {


	@DataProvider(name = "logindata")
public Object [][] getdata3(){
	return new Object[][]{
		{"Sunita","njkhk"},
	}
		
	}
	
}
