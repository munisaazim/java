package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class DeleteCookie {
    WebDriver driver = new ChromeDriver();

    public void maximimizeAndDeleteCookie() throws IOException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed(" ");
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("//Users//munisaazimkhodjaeva//Desktop//Screenshot"));
        driver.quit();
    }
}
