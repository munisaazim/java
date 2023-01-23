package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BadSSL {
    ChromeOptions options = new ChromeOptions();
    FirefoxOptions options1 = new FirefoxOptions();

    public void badSSL(){
        options.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(options);
        FirefoxOptions driver1 = new FirefoxOptions(options1);

        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
