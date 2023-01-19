package org.example;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {
    public WebDriver driver = new ChromeDriver();

    //Maximing default size of browser
    public void changeSize(){
        driver.manage().window().maximize();
        driver.get("https://scholar.google.com/");
        driver.navigate().to("https://staging.engineer.ai/home");
        driver.navigate().back();
        driver.navigate().forward();
    }
}
