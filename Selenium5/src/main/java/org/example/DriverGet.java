package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGet {
    public static WebDriver driver = new ChromeDriver();

    public void getPage(){
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
    }

    public void getPage2(){
        driver.get("https://www.spicejet.com/");
    }
}
