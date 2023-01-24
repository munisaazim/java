package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class CookieAndScrollAndBrokenLink extends GetDriver {
    public void maximizeWindow(){
        driver.manage().window().maximize();
    }
    public void cookieAndScrollAndBrokenLink() throws IOException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 700)");

        //DeleteCookie
        driver.manage().deleteAllCookies();

        //Finding and deleting all broken links
        String url = driver.findElement(By.xpath("(//*[@class = \"navFooterVerticalRow navAccessibility\"]//ul//a)[1]")).getAttribute("href");
        List < WebElement> lists = driver.findElements(By.xpath("//*[@class = \"navFooterVerticalRow navAccessibility\"]//ul//a"));
        int output = 0;
        for(int i =1; i<lists.size(); i++){
            lists.get(i).getAttribute("href");
            HttpURLConnection connectionLink = (HttpURLConnection) new URL(url).openConnection();
            connectionLink.setRequestMethod("HEAD");
            connectionLink.connect();
            if(connectionLink.getResponseCode()>400){
                System.out.println("Broken Links" + lists.get(i).getText() + " "+connectionLink.getResponseCode());
            }
            else {
                System.out.println("No Broken Links");
            }
        }

    }
}
