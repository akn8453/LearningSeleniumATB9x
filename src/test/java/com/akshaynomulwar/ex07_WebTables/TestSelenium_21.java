package com.akshaynomulwar.ex07_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestSelenium_21 {

    @Description("WebTables")
    @Test
    public void xpath_login() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/webtable.html");


         //table[@id="customers"]/tbody/tr[5]//td[2]/following-sibling::td
         //xpath - //table[@id="customers"]/tbody/tr[
        // i
        //]/td[
        //j
        //]

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";


        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        for(int i =2 ; i<=row; i++){
            for(int j = 1; j<=col; j++){

                String dynamic_path = first_part+i+second_part+j+third_part;
               // System.out.println(dynamic_path);
                String data = driver.findElement((By.xpath(dynamic_path))).getText();
                System.out.println(data);
                if(data.contains("Helen Bennett")){
                    String Country_Path = dynamic_path+"/following-sibling::td";
                    String country_text = driver.findElement(By.xpath(Country_Path)).getText();
                    System.out.println("----------------");
                    System.out.println("Helen Bennett is in - " + country_text);

                }

            }
        }
    }



}
