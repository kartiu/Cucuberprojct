package com.Testngfeatures;

import org.testng.annotations.Test;

public class TimeoutTest {
  @Test(timeOut = 2000)
  public void f() throws InterruptedException {
	  
	  System.out.println("login");
	  System.out.println("Home");
	  Thread.sleep(1000);//pass
	  //Thread.sleep(3000);// throws internal.thread.ThreadTimeoutException
	  //Thread.sleep(2000);//fail
	  System.out.println("Element1");
	  System.out.println("Element2");
  }
  
}
