package com.Testngfeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
  @Test
  public void f() {
	  System.out.println("Java");
  }
  @Test
  public void f2() {
	  System.out.println("selenium");
  }
  @Test
  @Ignore// ignore method type1
  public void f3() {
	  System.out.println("Maven");
  }
  @Test (enabled = false)//ignore methid2
  public void f4() {
	  System.out.println("TestNG");
  }
}
