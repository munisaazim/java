package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class CountLinks extends GetDriver{
    @Test
    public void countLinks(){

        WebElement footer = driver.findElement(By.id("navFooter"));

        WebElement footerInner = footer.findElement(By.xpath("(//*[@class = 'navFooterLinkCol navAccessibility'])[1]"));

        String newTab  = Keys.chord(Keys.CONTROL, Keys.ENTER);


        //Count number of links of entire page

        int numberALl=  driver.findElements(By.tagName("a")).size();

        System.out.println("All links: " + numberALl);

        //Count number of links on footer

        int number = footer.findElements(By.tagName("a")).size();

        System.out.println("Footer all links: " + number);
    }
    @Test
    public void clickInnerFootElement(){

        WebElement footer = driver.findElement(By.id("navFooter"));

        WebElement footerInner = footer.findElement(By.xpath("(//*[@class = 'navFooterLinkCol navAccessibility'])[1]"));
        //Finding all links on footer section(particular part) and click on it

        int numberInnerFooter = footerInner.findElements(By.tagName("a")).size();

        System.out.println("Inner footer elements: " + numberInnerFooter);

        //Iterating and clicking on links
        for (int i =1; i<numberInnerFooter; i++){
            String newTab  = Keys.chord(Keys.CONTROL, Keys.ENTER);
            footerInner.findElements(By.tagName("a")).get(i).sendKeys(newTab);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        Set <String> names = driver.getWindowHandles();
        Iterator <String> it = names.iterator();

        while (it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }
    }

}
