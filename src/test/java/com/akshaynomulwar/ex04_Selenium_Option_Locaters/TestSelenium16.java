package com.akshaynomulwar.ex04_Selenium_Option_Locaters;

import io.qameta.allure.Description;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium16 {



    @Description("Option Class")
    @Test
    public void test_Selenium01() throws  Exception{

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=1920,1080");
        edgeOptions.addExtensions(new File("src/test/java/com/akshaynomulwar/ex04_Selenium_Option_Locaters/adblocker.crx"));

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("72.10.160.172:31575");
        edgeOptions.setCapability("proxy",proxy);

        WebDriver driver = new EdgeDriver((edgeOptions));
        driver.get("https://youtube.com");
    }

}
