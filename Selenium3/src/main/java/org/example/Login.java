package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends DriverCheck{
    /*
    //Use them when you need enter without ForgotPage
    public void enterPage(){
        driver.get("https://staging.engineer.ai/home");
    }
    public void onBoardingWelcome(){
        enterPage();
        driver.findElement(By.xpath("//button[text() = \"Choose a base\"]")).click();
        driver.findElement(By.xpath("//*[@class = \"closeButton\"]")).click();
        driver.findElement(By.xpath("//*[@class = \"natashPanelOverlay\"]")).click();
    }

    public void onBoardingWelcomeWithoutMain(){
        enterPage();
        driver.findElement(By.xpath("//*[@class = \"natashPanelOverlay\"]")).click();
    }

    public void clickOnButtonSignIn(){
        driver.findElement(By.xpath("//*[@type = 'button'][1]")).click();
    }
    public  void login(){
        onBoardingWelcome();
        driver.findElement(By.xpath("//*[@type = 'button'][1]")).click();
        driver.findElement(By.xpath("//*[@id = \"loginEmailInput\"]")).sendKeys("munisa2000azim@gmail.com");
        driver.findElement(By.xpath("//*[@name = \"password\"]")).sendKeys("muni5536");
        driver.findElement(By.xpath("(//button[@type = \"submit\"])[2]")).click();
    }

     */
    public void loginWithoutOnBoardingWithButton() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.xpath("(//*[@type = 'button'])[1]")).click();;
        driver.findElement(By.xpath("//*[@id = \"loginEmailInput\"]")).sendKeys("munisa2000azim@gmail.com");
        driver.findElement(By.xpath("//*[@name = \"password\"]")).sendKeys("muni5536");
        driver.findElement(By.xpath("(//button[@type = \"submit\"])[2]")).click();
    }

    public void loginWithoutOnBoardingWithoutButton(){
        driver.findElement(By.xpath("//*[@id = \"loginEmailInput\"]")).sendKeys("munisa2000azim@gmail.com");
        driver.findElement(By.xpath("//*[@name = \"password\"]")).sendKeys("muni5536");
        driver.findElement(By.xpath("(//button[@type = \"submit\"])[2]")).click();
    }
}
