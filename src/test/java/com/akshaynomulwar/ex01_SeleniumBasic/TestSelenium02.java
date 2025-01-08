package com.akshaynomulwar.ex01_SeleniumBasic;


import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class TestSelenium02 {

    @Test
    public void test_Selenium01(){
        //open a URL
        //Print the title
          EdgeDriver driver = new EdgeDriver();
         driver.get("https://app.vwo.com/#/login");
        // System.out.println(driver.getTitle());


        //new EdgeDriver(); ---> POST REQUEST (LocalHost 63017) Create session
        // Edge real browser
    }
}
