package org.example;

import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class ScrollPage extends GetDriver {

    public void scrollPage(){
        getUrl();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 700)");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop = 5000");
        close();

    }
}
