package org.example;

import jdk.javadoc.internal.doclets.toolkit.util.DocFile;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LocatorsTabsScreenshot extends GetDriver{
    public void multipleTabsAndRelativeLocators() throws IOException {
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        driver.switchTo().newWindow(WindowType.TAB);
        Set <String> windows = driver.getWindowHandles();
        Iterator <String> iterator = windows.iterator();
        String parentID = iterator.next();
        String childID = iterator.next();

        driver.get("https://www.amazon.com/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc");
        String childUrl = driver.getCurrentUrl();
        String [] split= childUrl.split("com");
        String splitOne = split[0];
        String splitTwo = split[1];
        System.out.println("Split1: " + splitOne);
        System.out.println("Split2: " + splitTwo);


        driver.switchTo().window(parentID);
        WebElement giftElement = driver.findElement(By.xpath("//*[@data-csa-c-content-id = 'nav_cs_gc']"));
        Assert.assertEquals(giftElement.getAttribute("href"),childUrl);
        System.out.println(driver.getCurrentUrl());
        File screenshot =  giftElement.getScreenshotAs(OutputType.FILE);
        // FileUtils.copyFile(screenshot, new File("new"));
        //FileUtils.copyFile(screenshot, new File("/Users/munisaazimkhodjaeva/Desktop/Selenium/Screenshot.png"));



    }
}
