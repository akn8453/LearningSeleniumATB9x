package com.akshaynomulwar.ex03_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class TestSelenium03 {
    @Description("Open the App.vwo.com and get the title")
    @Test

    public void test_Selenium01(){

        // Selenium 3
        // You need to setup the Driver(browser)
        //system.getproperty("webdriver.gecko.driver","path)

        // Selenium 4
        // Selenium Manager - utility - Which can download the driver automaticially
        // start and stop itself.
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");


    }
}
