package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class Mouse extends GetDriver{

    @Test
    public void mouseLoginMove(){
        enterPage();
        Actions action = new Actions(driver);
        WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
        action.moveToElement(move).contextClick().build().perform();

        WebElement searchElement = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        action.moveToElement(searchElement).click()/*.keyDown(Keys.SHIFT)*/.sendKeys("Hello").doubleClick().build().perform();

        String s = Keys.chord(Keys.CONTROL, "a");
        searchElement.sendKeys(s);
        searchElement.sendKeys(Keys.DELETE);

    }
}
