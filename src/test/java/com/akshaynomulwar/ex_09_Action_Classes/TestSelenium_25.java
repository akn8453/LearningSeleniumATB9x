package com.akshaynomulwar.ex_09_Action_Classes;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestSelenium_25 {

    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("---guest");
        driver = new EdgeDriver((edgeOptions));
    }

    @Description("Verify actions")
    @Test
    public void test_actions() throws  InterruptedException{

        String URL = "https://awesomeqa.com/practice.html";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement firstname = driver.findElement((By.name("firstname")));
        // Keyboard
        //keydown + shitft -> sendkeys -> keyup

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(firstname,"the testing acadmey")
                .keyUp(Keys.SHIFT)
                .keyUp(Keys.SHIFT).build().perform();

    }

    @AfterTest
    public void closeBrowser(){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
        driver.quit();
    }

}
