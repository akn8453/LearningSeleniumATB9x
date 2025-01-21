package com.akshaynomulwar.ex06_Selenium_Xpath;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_20 {


    @Description("X_path Finding examples")
    @Test
    public void xpath_login () throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        Thread.sleep(3000);

        WebElement make_appointment_btn = driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));
        make_appointment_btn.click();

        Thread.sleep(3000);


        WebElement user_name = driver.findElement(By.xpath("//input[@id=\"txt-username\"]"));
        user_name.sendKeys("John Doe");

        Thread.sleep(3000);


        WebElement give_password = driver.findElement(By.xpath("//input[@id=\"txt-password\"]"));
        give_password.sendKeys("ThisIsNotAPassword");

        Thread.sleep(3000);


        WebElement click_login = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        click_login.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        Thread.sleep(3000);
        driver.quit();
    }
}
