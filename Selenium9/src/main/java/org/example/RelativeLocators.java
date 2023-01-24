package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators extends GetDriver{
    public void relativeLocators(){
        enterPage();
        WebElement element = driver.findElement(By.xpath("//*[@href = \"https://www.soapui.org/\"]"));
        WebElement liTag = driver.findElement(with(By.tagName("li")).above(element));
        System.out.println(liTag.getText());

        WebElement elementHeader = driver.findElement(By.tagName("h1"));
        WebElement elementHeaderBelow = driver.findElement(with(By.xpath("//*[text() =  \"Radio Button Example\"]")).below(elementHeader));
        System.out.println(elementHeaderBelow.getText());
        close();
    }
}
