package com.Testngfeatures;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
  @Test
  @Parameters({"uname","pwd"})
  public void login(String uname,String pwd) {
	
	  System.out.println("Enter user name is :-"+ uname);
	  System.out.println("Enter Password is :-"+ pwd);
  }
  
}
