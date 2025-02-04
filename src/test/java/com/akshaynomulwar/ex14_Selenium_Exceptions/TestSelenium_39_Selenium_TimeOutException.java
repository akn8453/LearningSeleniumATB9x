package com.akshaynomulwar.ex14_Selenium_Exceptions;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;

public class TestSelenium_39_Selenium_TimeOutException {

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
        driver.get("https://google.com");
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='abc']")));

            WebElement search_inputbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            //  driver.manage().window().maximize();
            search_inputbox.sendKeys("youtube" + Keys.ENTER);
        } catch (TimeoutException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End of the code");

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
