package com.akshaynomulwar.Task31st_Dec;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_31 {

    @Description("Task of 31st dec class")
    @Test
    public void task_31st() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments(("--start-maximized"));

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");

        Thread.sleep(3000);

        WebElement emailInputBox;
        emailInputBox = driver.findElement(By.xpath("//input[@id=\"username\"]"));
        emailInputBox.sendKeys("augtest_040823@idrive.com");

        Thread.sleep(3000);


        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        passwordInputBox.sendKeys("123456");

        Thread.sleep(3000);

        WebElement signin_button = driver.findElement(By.xpath("//button[@id=\"frm-btn\"]"));
        signin_button.click();


      /*  WebElement error_msg;
        error_msg = driver.findElement(By.className("id-card-title"));
        Assert.assertEquals(error_msg.getText(),"Your free trial has expired");
        */

        Thread.sleep(3000);
        driver.quit();
    }

}
