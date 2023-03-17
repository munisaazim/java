import PageObjects.LoginPage;
import PageObjects.OrdersPage;
import PageObjects.PaymentPage;
import PageObjects.ProductCatalogue;
import TestComponents.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC2 extends BaseTest {
    LoginPage loginPage;
    String productName = "zara coat 3";
    ProductCatalogue productCatalogue;
    PaymentPage paymentPage;
    OrdersPage ordersPage;
    @BeforeTest
    public void setUp() throws IOException {
        launchApplication();
        loginPage = new LoginPage(driver);
        paymentPage = new PaymentPage(driver);
        productCatalogue = new ProductCatalogue(driver);
        ordersPage = new OrdersPage(driver);
        loginPage.enter();
    }
    @Test
    public void runTillOrderSubmit(){
        loginPage.loginPage();
        productCatalogue.addProductToCart(productName.toUpperCase());
    }
    @Test(dependsOnMethods = {"runTillOrderSubmit"})
    public void checkOrder(){
      ordersPage.clickOnOrdersPage();
      Assert.assertTrue(ordersPage.verifyListofOrders(productName));
    }
    public void quitDriver(){
        quit();
    }
}
