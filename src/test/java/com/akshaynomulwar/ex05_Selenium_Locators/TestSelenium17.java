package com.akshaynomulwar.ex05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17 {


    @Description("Mini project using App.vwo.com")
    @Test
    public void test_negative_vwo_login() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments(("--start-maximized"));

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");
     //   driver.navigate().to("https://app.vwo.com");

        //1.Find the email input box and enter the email

        // <input ---> open HTML Tag
        // Type = "email" ---> Key == value (attributes)
        // class="text-input w(100)%
        // name = "username"
        // id = "login-username"
        //data=qa "howcewoqisi"

      WebElement emailInputBox = driver.findElement(By.id("login-username"));
      emailInputBox.sendKeys("admin@admin.com");


        //2. Find the password inputbox and enter the password

        /*
        <input
         type="password"
         class="text-input W(100%)"
          name="password" id="login-password"
          data-qa="jobodapuxe" data-gtm-form-interact-field-id="2"
          >
         */

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("admin");




        //3. Find the submit button and click on it.


        /*
        <button
        type="submit"
        id="js-login-btn"
        class="btn btn--positive btn--inverted W(100%)
        H(48px) Fz(16px)" onclick="login.login(event)"
        data-qa="sibequkica"
        >
         */

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        Thread.sleep(3000);


        //4. Find the invalid error msg and verify

        /*
        <
        div class="notification-box-description"
        id="js-notification-box-msg"
        data-qa="rixawilomi">
        Your email, password,
        IP address or location did not match</div
        >
         */

       WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

    }
}


