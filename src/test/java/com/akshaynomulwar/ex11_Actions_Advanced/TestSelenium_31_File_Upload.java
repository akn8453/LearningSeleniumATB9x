package com.akshaynomulwar.ex11_Actions_Advanced;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSelenium_31_File_Upload {

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
        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));
        String working_dir = System.getProperty("user.dir");
        System.out.println(working_dir);
        uploadFileInput.sendKeys(working_dir + "/src/test/java/com/akshaynomulwar/ex11_Actions_Advanced/TestData.txt");
        driver.findElement(By.name("submit")).click();

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
