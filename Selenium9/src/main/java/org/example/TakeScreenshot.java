package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot extends GetDriver{
    public void takeScreenshot() throws IOException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement element = driver.findElement(By.xpath("//*[text() = 'REST API']"));

        File screenshot =  element.getScreenshotAs(OutputType.FILE);
       // FileUtils.copyFile(screenshot, new File("new"));
        FileUtils.copyFile(screenshot, new File("/Users/munisaazimkhodjaeva/Desktop/Selenium/Screenshot.png"));
    }
}
