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

public class ForgotPassword {
    public WebDriver driver = new ChromeDriver();
    int waitNumber = 15;

    Duration seconds = Duration.ofSeconds(15);
    //WebDriverWait wait=new WebDriverWait(driver1, seconds);


    public void forgotPassword(){

       /* Login loginObject = new Login();

        loginObject.enterPage();

        loginObject.onBoardingWelcomeWithoutMain();

        loginObject.clickOnButtonSignIn();

        //wait.until(ExpectedConditions.textToBePresentInElement((WebElement) By.xpath("//*[@class = 'forgot']"), " Forgot your password? "));
        driver1.findElement(By.xpath("//*[text()= \" Forgot your password? \"]")).click();
        //loginObject.driver.findElement(By.xpath("//*[@type = 'email']")).sendKeys("munisa2000azim@gmail.com");
        driver1.findElement(By.xpath("//*[ text() = 'Back to sign in']")).click();

        loginObject.loginWithoutOnBoarding();

        System.out.println("Passed check of Forgot page");


        */


        driver.get("https://staging.engineer.ai/home");

        driver.findElement(By.xpath("//button[text() = \"Choose a base\"]")).click();
        driver.findElement(By.xpath("//*[@class = \"closeButton\"]")).click();
        driver.findElement(By.xpath("//*[@class = \"natashPanelOverlay\"]")).click();

        //driver.findElement(By.xpath("//*[@type = 'button'][1]")).click();

        //wait.until(ExpectedConditions.textToBePresentInElement((WebElement) By.xpath("//*[@class = 'forgot']"), " Forgot your password? "));
        driver.findElement(By.xpath("//*[text()= \" Forgot your password? \"]")).click();
        //loginObject.driver.findElement(By.xpath("//*[@type = 'email']")).sendKeys("munisa2000azim@gmail.com");
        driver.findElement(By.xpath("//*[ text() = 'Back to sign in']")).click();



        System.out.println("Passed check of Forgot page");

    }
}
