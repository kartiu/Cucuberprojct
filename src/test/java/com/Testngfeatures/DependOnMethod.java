package com.Testngfeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependOnMethod {
  @Test (dependsOnMethods = "f1")
  @Ignore
  public void f() {
	  System.out.println("java");
  }
  
  @Test
  
  public void f1() {
	  System.out.println("selenium");
  }
  @Test (dependsOnMethods = "f4")
  public void f2() {
	  System.out.println("Maven");
  }
  @Test
  public void f4() {
	  System.out.println("TestNG");
  }
}
