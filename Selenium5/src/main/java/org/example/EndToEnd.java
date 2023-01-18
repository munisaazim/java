package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Date;

import static atu.testng.reports.ATUReports.getWebDriver;

public class EndToEnd extends DriverGet{

    public Duration duration = Duration.ofSeconds(5);

    public void openPage(){

        getPage2();
    }

    //Getting One Round --> Radio button

    public void selectOneRound(){
        driver.findElement(By.xpath("//*[text()='round trip']")).click();
        driver.findElement(By.xpath("//*[text() = 'one way']")).click();
        if(driver.findElement(By.xpath("//*[text() = 'one way']")).isEnabled()==true){
            System.out.println("One way Radio button is selected");
            Assert.assertTrue(true);
        }
    }

    //Selecting Destinations (From/To)
    public void selectDestination() throws InterruptedException {
        driver.findElement(By.xpath("(//input)[1]")).click();
        driver.findElement(By.xpath("//*[text() = \"Agra\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text() = \"Indore\"]")).click();
        System.out.println("Selected destination");

    }

    //Selecting Number of Passengers
    public void selectPassengers() throws InterruptedException {
        driver.findElement(By.xpath("(//*[@tabindex])[26]")).click();
        Thread.sleep(5000);
        for(int i = 0; i<4; i++){
            driver.findElement(By.xpath("//*[@data-testid=\"Adult-testID-plus-one-cta\"]")).click();
        }
        driver.findElement(By.xpath("(//*[@data-testid=\"home-page-travellers-done-cta\"])")).click();
        System.out.println("Passengers number is selected");
    }

    //Selecting Currency Type
    public void selectCurrency(){
        WebElement staticDropdown = driver.findElement(By.xpath("(//*[@data-testid=\"svg-img\"])[17]"));
        Actions act = new Actions(driver);
        act.sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN)).perform();
        System.out.println("Currency is selected");
        /*
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(2);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("USD");
        System.out.println(dropdown.getFirstSelectedOption().getText());
         */
    }

    //Choosing FLight Date(Start Date)
    public void checkCalendarDate(){
        getPage2();
        driver.findElement(By.xpath("//*[@data-testid = 'departure-date-dropdown-label-test-id']")).click();
        driver.findElement(By.xpath("(//*[contains(@class , 'r-y47klf')])[1]")).click();
    }

    //Select Who Gonna Fly
    public void selectWhoFly(){
        driver.findElement(By.xpath("//*[text() = \"Family & Friends\"]")).click();
        System.out.println("Passengers who fly is selected");
    }

    //Search Particular Flight
    public void selectSearch(){
        driver.findElement(By.xpath("//*[text() = \"Search Flight\"]/..")).click();
        //new WebDriverWait(getWebDriver(), duration).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text() = \"Search Flight\"]"))).click();
        System.out.println("Passengers who fly is selected");
        System.out.println("Search is clicked");
    }

    //TestNG Checkinh new page is opened
    public void checkNoFlight(){
        Assert.assertEquals(driver.findElement(By.xpath("((//*[@data-testid='svg-img'])[5]/..//div)[1]")).getAttribute("innerHTML"), "Unfortunately, there are no flights available.");
    }

    public void exit(){
        driver.quit();
    }


}
