package org.example;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ForgotPassword extends  DriverCheck{
    public void forgotPassword() throws InterruptedException {
        driver.findElement(By.xpath("//button[text() = \"Choose a base\"]")).click();

        driver.findElement(By.xpath("(//*[@class = 'icon-cancel'])[4]")).click();
        driver.findElement(By.xpath("//*[@class = \"natashPanelOverlay\"]")).click();
        driver.findElement(By.xpath("//*[@type = 'button'][1]")).click();
        if(driver.findElement(By.xpath("//*[@class = 'forgot']")).isDisplayed());
        {
            driver.findElement(By.xpath("//*[@class = 'forgot']")).click();
            driver.findElement(By.xpath("//*[@class = 'forgot']")).click();
            driver.findElement(By.xpath("//*[@type = 'email']")).sendKeys("munisa2000azim@gmail.com");
            driver.findElement(By.xpath("//*[@type = 'email']")).clear();
            if(driver.findElement(By.xpath("//*[@class = 'alreadyHave login']")).isDisplayed());{
            driver.findElement(By.xpath("//*[@class = 'linkcolor']")).click();
            if(driver.findElement(By.xpath("//*[@class = 'new-CloseButton']")).isDisplayed());{
                //sleeping examples
                // version 1
                // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                //version 2 with throws InterruptedException
                //Thread.sleep(100);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.findElement(By.xpath("(//*[@class = 'icon-cancel'])[4]")).click();
                System.out.println("Hello");
            }

        }

        }

    }
}
