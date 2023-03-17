package AbstractComponent;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBar {
    WebDriver driver;
    JavascriptExecutor js;
    AbstractComponent abstractComponent;
    public NavigationBar(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;
    }
    @FindBy(xpath = "//*[@routerlink ='/dashboard/cart']") WebElement cartBtn;
    @FindBy(xpath = "//*[@routerlink ='/dashboard/myorders']") WebElement orderBtn;
    By order = By.xpath("//*[@routerlink ='/dashboard/myorders']");
    public void clickOnCart(){
        js.executeScript("arguments[0].click();",cartBtn);
    }
    public void clicknOnOrder(){
        js.executeScript("arguments[0].click();",orderBtn);
    }
}
