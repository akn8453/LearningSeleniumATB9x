package com.akshaynomulwar.ex15_Data_Driven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSelenium_40 {

    @DataProvider(name = "LoginData", parallel = true)
    public Object[][] getData() {
        return new Object[][]{
                new Object[]{"admin@gamil.com", "pass123"} ,
                new Object[]{"admin@gmail.com", "pass123"},
                new Object[]{"admin@gmail.com", "pass125"}

        };

    }


    @Test(dataProvider = "LoginData")
public void loginTest(String email, String password){
    System.out.println(email + " | " + password );



    }

}
