package com.Testngfeatures;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {
  @Test(dataProvider = "loginValue")
  public void loginParameter(String uname,String pwd) {
	  System.out.println("Enter user name is :-"+ uname);
	  System.out.println("Enter Password is :-"+ pwd);
  }
  @DataProvider
  private Object[][] loginValue() {
	  return new Object[] [] {{"karthi","1234"},{"mani","4567"}};
	  

}
}
