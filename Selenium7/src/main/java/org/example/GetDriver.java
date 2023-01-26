package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class GetDriver {

    static WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void enterPage(){
        driver.get("https://www.amazon.com/");
    }
    @AfterTest
    public static void quit(){
        driver.quit();
    }

    public void enterPageTwo(){
        driver.get("");
    }
}
