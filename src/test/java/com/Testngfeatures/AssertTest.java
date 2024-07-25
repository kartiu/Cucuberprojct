package com.Testngfeatures;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {//assert validation
  @Test
  public void f1() {
	  int a=10;
	  int b=101;
	  Assert.assertEquals(a, b);
  }
  
  @Test
  public void f2() {
	  int a=10;
	  int b=10;
	  Assert.assertEquals(a, b);
  }
}
