package PageObjects;

import AbstractComponent.AbstractComponent;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractComponent {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@type = 'email']") private WebElement email;
    @FindBy(xpath = "//*[@type = 'password']") private WebElement password;
    @FindBy(xpath = "//*[@name = 'login']") private WebElement login;
    @FindBy(xpath = "//*[contains(@class, 'flyInOut')]") private WebElement invalidBoxError;
    By errorMessage = By.xpath("//*[contains(@class, 'flyInOut')]");
    String url = "https://rahulshettyacademy.com/client";
    String emailText = "munisa2000azim@gmail.com";
    String passwordText = "muni5536.";
    String nonValidEmailText = "munisa200azim@gmail.com";
    String nonValidPasswordText = "muni5536.";
    public void enter(){
        driver.get(url);
    }
    public void loginPage(){
        email.sendKeys(emailText);
        password.sendKeys(passwordText);
        login.click();
    }
    public void nonValidCredentialsLoginPage(){
        email.sendKeys(nonValidEmailText);
        password.sendKeys(nonValidPasswordText);
        login.click();
        waitForElementToAppear(errorMessage);
        Assert.assertTrue(invalidBoxError.isDisplayed());
    }
}
