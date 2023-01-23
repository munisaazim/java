package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.PanelUI;

public class GetDriver {
    WebDriver driver = new ChromeDriver();
    public void getUrl(){
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }

    public void close(){
        driver.quit();
    }
}
