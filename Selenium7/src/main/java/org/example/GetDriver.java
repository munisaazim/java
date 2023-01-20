package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDriver {

    static WebDriver driver = new ChromeDriver();

    public static void enterPage(){
        driver.get("https://www.amazon.com/");
    }

    public static void quit(){
        driver.quit();
    }

    public void enterPageTwo(){
        driver.get("");
    }
}
