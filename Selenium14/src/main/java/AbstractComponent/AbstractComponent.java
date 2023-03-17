package AbstractComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractComponent {
    WebDriver driver;
    WebDriverWait wait;

    public AbstractComponent(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void waitForElementToAppear(By xpath){
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
    }
    public void waitForElementForDisappear(WebElement element){
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
}
