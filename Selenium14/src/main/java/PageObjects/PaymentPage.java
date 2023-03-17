package PageObjects;

import AbstractComponent.AbstractComponent;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends AbstractComponent {
    WebDriver driver;
    public PaymentPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[text() = 'CVV Code ']/ancestor::div[@class =\"field small\"]//input")
    private WebElement cvvCode;
    @FindBy(xpath = "//*[text() = 'Name on Card ']/ancestor::div[@class ='field']//input")
    private WebElement nameOfCard;
    @FindBy(xpath = "//*[@placeholder = 'Select Country']")
    private WebElement nameOfCountry;
    @FindBy(xpath = "//*[text()= ' Uzbekistan'")
    private WebElement countryChooseName;
    @FindBy(xpath = "//a[contains(@class, 'action__submit')]")
    private WebElement placeOrder;
    @FindBy(xpath = "//*[text() = \" Thankyou for the order. \"]")
    private WebElement thankYou;
    By countryName = By.xpath("//*[text()= ' Uzbekistan']");
    public void fillInDetails(String cvvCodeName, String nameCard, String country){
        cvvCode.sendKeys(cvvCodeName);
        nameOfCard.sendKeys(nameCard);
        nameOfCountry.sendKeys(country);
        waitForElementToAppear(countryName);
        countryChooseName.click();
        placeOrder.click();
    }
    public void checkText(){
        Assert.assertTrue(thankYou.isDisplayed());
    }
}
