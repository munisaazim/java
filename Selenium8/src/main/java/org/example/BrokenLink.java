package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLink extends GetDriver {
    public void brokenLink() throws IOException {
        int counter = 0;
        getUrl();

        String url = driver.findElement(By.xpath("//*[contains(text() , 'Broken')]")).getAttribute("href");
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("HEAD");
        connection.connect();
        int response = connection.getResponseCode();
        System.out.println("Response code: " + response);


        List < WebElement> lists = driver.findElements(By.xpath("//*[@class = 'gf-li']/a"));
        /*
        for(int i = 1; i<=lists.size();i++){
            lists.get(i).getAttribute("href");
            HttpURLConnection connectionLink = (HttpURLConnection) new URL(url).openConnection();
            connectionLink.setRequestMethod("HEAD");
            connectionLink.connect();
            if(connection.getResponseCode() >400){
                System.out.println("Link: " + lists.get(i).getText() + " "+connection.getResponseCode());
                Assert.assertTrue(false);
            }
        }
         */
        //SoftAssertion
        SoftAssert softAssert = new SoftAssert();

        for(int i = 1; i<=lists.size();i++){
            lists.get(i).getAttribute("href");
            HttpURLConnection connectionLink = (HttpURLConnection) new URL(url).openConnection();
            connectionLink.setRequestMethod("HEAD");
            connectionLink.connect();
            softAssert.assertTrue(connectionLink.getResponseCode()<400,  "Link: " + lists.get(i).getText() + " "+connection.getResponseCode());
        }
        softAssert.assertAll();
        driver.quit();
    }
}
