package com.demo.step;

import org.testng.annotations.Test;

public class NewTest1 {
  private static final String Expected = null;
private static final String invocationCount = null;
@Test(priority=2, enabled=false)
  public void loginwithinvalidcredeintials() {
	  System.out.println("invalid login");
  }
  @Test(priority=0, groups= {"smoke"})
  public void loginwithvalidcredeintials() {
	  System.out.println("Valid login");
  }
  
  @Test(priority = 1, groups= {"smoke"})
  public void Test() {
	  System.out.println("Test");
  }
  
  @Test(timeOut = 2000) 
  public void test() {
  System.out.println("Timeout");
  }
  @Test(expectedExceptions = ArithmeticException.class)
  public void logi() {
	  int i=10/0;
	  }
  @Test(invocationCount= 3, threadPoolSize =8)
  public void DemoTest() {
	  System.out.println("SunitSWaraj");
  }
 /*
  @Test((invocationCount= 5 , invocationTimeOut =2000))
  public void Test2() {
	  System.out.println("Test");
  */
  @Test(successPercentage =80)
  public void Test3() {
	  System.out.println("Test");
	  }
  @Test
  public void Test4() {
	  int i= 10/0;
  }
  
  @Test(dependsOnMethods = "Test4" , alwaysRun= true)
  public void Test5() {
	  System.out.println("Printthis dependent ,method");
	  
  }
}
