package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDriver {
    WebDriver driver = new ChromeDriver();

    public void enterPage(){
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }
    public void close(){
        driver.quit();
    }
}
