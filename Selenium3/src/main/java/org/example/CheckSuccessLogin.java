package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class CheckSuccessLogin extends DriverCheck{

    public void checkSuccessLogin(){
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.findElement(By.xpath("//*[@class = 'userPanel']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@class = 'mydashBoard']/span")).getAttribute("innerHTML"), "Dashboard");
    }
    public void goToDashboard(){
        driver.findElement(By.xpath("//*[@class = 'mydashBoard']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("(//*[@class = \"dashHeading\"])[1]")).getAttribute("innerHTML"), "Saved Card <!---->");
    }
    public void profileLogout(){
        driver.findElement(By.xpath("//*[@class = 'userProfile']")).click();
        driver.findElement(By.xpath("//*[@class = 'userLogout']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@class = \"loginRight\"]//h3/span")).getAttribute("innerHTML"), "Sign In ");
    }
}
