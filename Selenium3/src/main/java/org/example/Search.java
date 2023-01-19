package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class Search extends DriverCheck{

    public void SearchElement(){
        driver.findElement(By.xpath("//*[@class = 'searchButton']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@class = 'searchinput']/input")).sendKeys("Uber");
        driver.findElement(By.xpath("//*[@class = 'searchinput']/input")).sendKeys(Keys.ENTER);
        System.out.println("element is searched");
    }

}
