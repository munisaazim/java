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

public class ForgotPassword {
    public WebDriver driver = new ChromeDriver();
    public void forgotPassword(){
        driver.get("https://staging.engineer.ai/home");

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
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.findElement(By.xpath("(//*[@class = 'icon-cancel'])[4]")).click();
                System.out.println("Hello");
            }

        }

        }

        System.out.println("Passed check of Forgot page");

    }
}
