package com.akshaynomulwar.ex07_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium_22 {


    @Description("WebTables")
    @Test
    public void xpath_login() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/webtable1.html");

        // Find the x path of the web table
        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));

        // Rows and columns
        List<WebElement> rows_tables = table.findElements(By.tagName("tr"));
        for( int i = 0; i < rows_tables.size(); i++){
            List<WebElement> col = rows_tables.get(i).findElements(By.tagName("td"));
            for(WebElement c: col) {
                System.out.println(c.getText());
            }
        }

    }
}