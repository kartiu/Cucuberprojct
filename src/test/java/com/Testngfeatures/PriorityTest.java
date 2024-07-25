package com.Testngfeatures;

import org.testng.annotations.Test;

public class PriorityTest {
  @Test (priority = -1)
  public void f() {
	  System.out.println("Maven creation");
  }
  @Test (priority = 2)
  public void f1() {
	  System.out.println("library for testing");
  }
  @Test //if not priority set that particular priority value is zero
  public void f2() {
	  System.out.println("Testing Installation");
  }
  @Test (priority = 1, invocationCount = 3)
  public void f3() {
	  System.out.println("Testing Dependency");
  }
}
