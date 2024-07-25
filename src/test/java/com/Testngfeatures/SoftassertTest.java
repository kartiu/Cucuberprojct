package com.Testngfeatures;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftassertTest {//softassert verification
  @Test
  public void f() 
  {
	  int a=10;
	  int b=101;
	  SoftAssert s=new SoftAssert();
	  s.assertEquals(a, b);
	  
  }
  @Test
  public void f2() 
  {
	  int a=10;
	  int b=101;
	  SoftAssert s1=new SoftAssert();
	  s1.assertEquals(a, b);
	  
  }
}
