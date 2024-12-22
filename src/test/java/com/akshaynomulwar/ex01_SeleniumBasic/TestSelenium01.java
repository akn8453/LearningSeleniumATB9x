package com.akshaynomulwar.ex01_SeleniumBasic;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {


    @Test
    public void test_Selenium01(){
        //open a URL
        //Print the title
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());

    }

}
