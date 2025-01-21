package com.akshaynomulwar.Task30th_Dec;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Task_Katalon {


    @Description("Login to the katalon site")
    @Test
    public void katalon_login() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        /*
        <a
        id="btn-make-appointment"
        href="./profile.php#login"
        class="btn btn-dark btn-lg">Make Appointment
        </a>
         */

        WebElement appointment_button = driver.findElement(By.id("btn-make-appointment"));
        appointment_button.click();

        Thread.sleep(3000);

        /*
        <input
        type="text" class="form-control"
        id="txt-username"
        name="username"
        placeholder="Username"
        value="" autocomplete="off">
         */

        WebElement emailInputBox = driver.findElement(By.id("txt-username"));
        emailInputBox.sendKeys("John Doe");

        Thread.sleep(3000);


        /*
        <input
        type="password"
        class="form-control"
        id="txt-password"
        name="password"
        placeholder="Password"
        value="" autocomplete="off"
        >
         */

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("ThisIsNotAPassword");

        Thread.sleep(3000);


        /*
        <button
        id="btn-login"
        type="submit"
        class="btn btn-default">
        Login
        </button>
         */

        WebElement login_button = driver.findElement(By.id("btn-login"));
        login_button.click();

        Thread.sleep(3000);

        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.quit();

    }

}
