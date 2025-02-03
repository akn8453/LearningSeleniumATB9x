package com.akshaynomulwar.ex08_Selenium_SVG;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium_24 {


    @Description("WebTables")
    @Test
    public void xpath_login() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.amcharts.com/svg-maps/?map=india");

        //*[local-name()="svg"]/*[name()="g"][7]/*[name()="g"]/*[name()="g"]/*[name()="path"]

        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for(WebElement state : states){
            System.out.println(state.getAttribute("aria-label"));
            if(state.getAttribute("aria-label").contains("Tripura")){
                state.click();
            }
        }

    }
}
