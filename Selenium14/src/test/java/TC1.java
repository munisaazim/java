import PageObjects.LoginPage;
import PageObjects.PaymentPage;
import PageObjects.ProductCatalogue;
import TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC1 extends BaseTest {
    LoginPage loginPage;
    String productName = "zara coat 3";
    ProductCatalogue productCatalogue;
    PaymentPage paymentPage;
    String nameOfCart = "OFB";
    String nameOfCvv = "123";
    String nameOfCountry = "Uzbekistan";

    @BeforeTest
    public void setUp() throws IOException {
        launchApplication();
        loginPage = new LoginPage(driver);
        paymentPage = new PaymentPage(driver);
        productCatalogue = new ProductCatalogue(driver);
        loginPage.enter();
    }
    @Test
    public void runTests(){
        loginPage.loginPage();
        productCatalogue.addProductToCart(productName.toUpperCase());
        productCatalogue.clickOnCart();
        paymentPage.fillInDetails(nameOfCvv, nameOfCart, nameOfCountry);
        paymentPage.checkText();
    }
    @AfterTest
    public void quitDriver(){
        quit();
    }
}
