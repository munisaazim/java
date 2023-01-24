package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandleMultipleTabs extends GetDriver{

    public void  handleMultipleTabs(){

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        //Switching Window ------> Tutorial

        driver.switchTo().newWindow(WindowType.WINDOW);

        Set<String> handles=driver.getWindowHandles();

        Iterator<String> it=handles.iterator();

        String parentWindowId = it.next();

        String childWindow =it.next();

        driver.switchTo().window(childWindow);

        driver.get("https://rahulshettyacademy.com/");

        String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))

                .get(1).getText();

        driver.switchTo().window(parentWindowId);

        WebElement name=driver.findElement(By.cssSelector("[name='name']"));

        name.sendKeys(courseName);

    }
    public void handlemultipleTabs(){

        //Switching between TABS personal view

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.switchTo().newWindow(WindowType.TAB);
        Set <String> windows = driver.getWindowHandles();
        Iterator <String> iterator = windows.iterator();
        String parentID = iterator.next();
        String child = iterator.next();

        driver.get("https://www.restapitutorial.com/");
        String text = driver.getCurrentUrl();
        driver.switchTo().window(parentID);
        System.out.println(driver.getCurrentUrl());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text() = 'REST API']")));
        System.out.println(driver.findElement(By.xpath("//*[text() = 'REST API']")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//*[text() = 'REST API']")).getAttribute("href"), text);

    }
}
