package com.Testngfeatures;

import org.testng.annotations.Test;

public class ExpectedException {
  @Test(expectedExceptions = NullPointerException.class)
  public void f() {
	  String pswd=null;
	  System.out.println(pswd.length());
  }
}
