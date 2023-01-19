package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Main {
    public static void main(String[] args){
        //Launching local chrome driver
        //System.setProperty("webdriver.chrome.driver" , "/Users/munisaazimkhodjaeva/Desktop/Drivers/Chrome/chromedriver");

        //Launching local firefox driver
        //System.setProperty("webdriver.firefox.driver", "/Users/munisaazimkhodjaeva/Desktop/Drivers/Firefox/geckodriver");

        //Launching local edge driver
        //System.setProperty("webdriver.edge.driver", "/Users/munisaazimkhodjaeva/Desktop/Drivers/Edge/edge");

        //Launching Chrome driver
        //WebDriver driver = new ChromeDriver();

        //Launching Firefox driver
        //WebDriver driver = new FirefoxDriver();

        //Lauching Edge driver
        //WebDriver driver = new EdgeDriver();

        //Launching Safari
        WebDriver driver = new SafariDriver();

        driver.get("https://www.udemy.com/");
        driver.getTitle();
        String getTitle = driver.getTitle();
        System.out.println(getTitle);

        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());

        driver.close();
        driver.quit();

    }
}