package com.akshaynomulwar.Task7th_Jan_2;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task_2 {

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
        driver.get("https://www.browserstack.com/users/sign_in");
        driver.manage().window().maximize();

        Thread.sleep(2000);
/*
        WebElement click_login = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
        click_login.click();

        Thread.sleep(5000);
*/
        WebElement user_name = driver.findElement(By.xpath("//input[@id=\"user_email_login\"]"));
        user_name.sendKeys("akn8453@gmail.com");

        Thread.sleep(2000);

        WebElement give_password = driver.findElement(By.xpath("//input[@id=\"user_password\"]"));
        give_password.sendKeys("Shivaay@#");

        Thread.sleep(2000);

        WebElement sign_in = driver.findElement(By.xpath("//input[@id=\"user_submit\"]"));
        sign_in.click();

        Thread.sleep(2000);

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
