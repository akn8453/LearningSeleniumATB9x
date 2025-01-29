package com.akshaynomulwar.Task3rd_Jan;


import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

public class Task_WebTables {

    @Description("WebTables")
    @Test
    public void xpath_login() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");

        Thread.sleep(3000);

        WebElement user_name = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        user_name.sendKeys("admin");

        Thread.sleep(3000);

        WebElement give_password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        give_password.sendKeys("Hacker@4321");

        Thread.sleep(3000);

        WebElement click_login = driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"));
        click_login.click();

        Thread.sleep(3000);

        WebElement table = driver.findElement(By.xpath("//div[@class='oxd-table orangehrm-employee-list']/div[2]"));

        Thread.sleep(3000);
        //driver.quit();


        // Rows and columns
        List<WebElement> rows_tables = table.findElements(By.xpath("//div[@class=\"oxd-table-card\"]"));
        System.out.println("Total rows" + rows_tables.size());

        for( int i = 0; i < rows_tables.size(); i++){
            List<WebElement> col = rows_tables.get(i).findElements(By.xpath("//div[@class=\"oxd-table-card\"]//div[@class=\"oxd-table-cell oxd-padding-cell\"]"));
            for(WebElement c: col) {
                System.out.println(c.getText());
            }
        }
    }
}