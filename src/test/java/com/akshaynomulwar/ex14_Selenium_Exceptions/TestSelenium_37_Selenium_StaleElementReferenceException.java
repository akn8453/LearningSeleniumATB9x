package com.akshaynomulwar.ex14_Selenium_Exceptions;


import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;


public class TestSelenium_37_Selenium_StaleElementReferenceException {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("---guest");
        driver = new EdgeDriver((edgeOptions));

    }

    @Description("Verify Scrolling")
    @Test
    public void test_actions() throws InterruptedException {
        try {
            driver.get("https://google.com");
            driver.manage().window().maximize();
            WebElement search_inputbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            driver.navigate().refresh(); //html page (DOM) is not refreshed
            // Driver will think that the element may or may not be available now
            // i have found the element before refresh
            search_inputbox.sendKeys("thetestingacademy" + Keys.ENTER);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @AfterTest
    public void closeBrowser(){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
    }


}
