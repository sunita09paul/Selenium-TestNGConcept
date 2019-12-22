package com.demo.step;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest5 {
	
  @BeforeSuite
  public void test() {
	  System.out.println("Before Suite");
  }
  
  @BeforeTest
  public void test1() {
	  System.out.println("Before Test");
  }
  @BeforeClass
  public void test2() {
	  System.out.println("Beforeclass");
  }
  
  @BeforeMethod
  public void test3() {
	  System.out.println("BeforeMethod");
  }
  @Test
  public void test9() {
	  System.out.println("In Test");
  }
  @AfterSuite
  public void test4() {
	  System.out.println("Before Suite");
  }
  
  @AfterTest
  public void test5() {
	  System.out.println("Before Test");
  }
  @AfterClass
  public void test6() {
	  System.out.println("Beforeclass");
  }
  
  @AfterMethod
  public void test7() {
	  System.out.println("BeforeMethod");
  }
  }
