package com.akshaynomulwar.ex15_Data_Driven;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSelenium_41 {

  @Test(dataProvider = "getData", dataProviderClass =  UtilExcel.class)
public void test_VWOLogin(String email, String password){

      System.out.println("Email - "+ email);
      System.out.println("Password - "+password);
}


}
