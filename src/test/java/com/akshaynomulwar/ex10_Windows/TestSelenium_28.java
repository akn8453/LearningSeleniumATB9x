package com.akshaynomulwar.ex10_Windows;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class TestSelenium_28 {


    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("---guest");
        driver = new EdgeDriver((edgeOptions));
    }

    @Description("Verify actions")
    @Test
    public void test_actions() throws  InterruptedException {
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);
        driver.manage().window().maximize();

       String parentWindow = driver.getWindowHandle();

       driver.findElement(By.linkText("Click Here")).click();

       Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Window Handles: " + windowHandles);

        for(String handle : windowHandles){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("New Window"));
            {
                System.out.println("Test Passed");
                break;
            }
        }

    }
}
