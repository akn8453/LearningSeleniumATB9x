package com.akshaynomulwar.ex03_SeleniumBasics;


import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium07 {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");


        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());




    }

}
