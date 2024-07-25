package com.Testngfeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class GroupingTest {
  @Test(groups = "main")
  public void f() {
	  System.out.println("main test1");
  }
  @Test(groups = "before")
  public void beforeMethod() {
	  System.out.println("B.method");
  }

  @Test(groups ="after")
  public void afterMethod() {
	  System.out.println("A.method");
  }

  @Test(groups = "before")
  public void beforeClass() {
	  System.out.println("B.class");
  }

  @Test(groups = "after")
  public void afterClass() {
	  System.out.println("A.class");
  }

  @Test(groups = "before")
  public void beforeTest() {
	  System.out.println("B.test");
  }

  @Test(groups = "after")
  public void afterTest() {
	  System.out.println("A.test");
  }

  @Test(groups = "before")
  public void beforeSuite() {
	  System.out.println("B.suite");
  }

  @Test(groups = "after")
  public void afterSuite() {
	  System.out.println("A.suite");
  }

}
