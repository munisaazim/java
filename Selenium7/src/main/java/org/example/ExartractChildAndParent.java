package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import java.util.*;

public class ExartractChildAndParent extends GetDriver{

    Actions action = new Actions(driver);
    @Test
    public void childAndParent(){
        String parentWindowHandler = driver.getWindowHandle();
        System.out.println(driver.switchTo().window(parentWindowHandler).getTitle());

        WebElement searchElement = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        action.moveToElement(searchElement).click().sendKeys("Hello").doubleClick().keyDown(Keys.ENTER).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text() = \"Today's Deals\"]")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Set<String> s = driver.getWindowHandles();
        Iterator <String> it = s.iterator();
        String childId = it.next();
        // String childId = it.next();
        // System.out.println("Child: " + parentId);
        //driver.switchTo().window(childId);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.switchTo().window(parentWindowHandler);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("nav-logo-sprites")).click();
        System.out.println(driver.switchTo().window(parentWindowHandler).getTitle());


    }



}
