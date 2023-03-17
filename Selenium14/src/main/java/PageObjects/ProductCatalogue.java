package PageObjects;

import AbstractComponent.AbstractComponent;
import AbstractComponent.NavigationBar;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductCatalogue extends AbstractComponent {
    private WebDriver driver;
    private NavigationBar navigationBar;
    public ProductCatalogue(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        navigationBar = new NavigationBar(driver);
    }
    @FindBy(xpath = "//*[contains(@class, 'mb-3')]")
    private List<WebElement> listOfCourses;
    @FindBy(xpath = "//*[contains(@class, 'cartWrap')]")
    private List<WebElement> listOfOrders;
    @FindBy(xpath = ".ng-animating") WebElement spinner;
    @FindBy(xpath = "//*[@type ='button' and text()= 'Checkout']") WebElement checkout;
    By productsBy = By.xpath("//*[contains(@class, 'mb-3')]");
    By addToCart = By.xpath("//*[@class = 'card-body']//button[text() = \" Add To Cart\"]");
    By toastContainer = By.xpath("//*[@id = 'toast-container']");
    By checkoutText = By.xpath("//*[@type ='button' and text()= 'Checkout']");
    By orderXpath = By.xpath("//*[contains(@class, 'cartWrap')]");
    public List<WebElement>getProductList(){
        waitForElementToAppear(productsBy);
        return listOfCourses;
    }
    public WebElement getProductByName(String productName){
        WebElement prod = getProductList().stream().filter(listOfCourse->listOfCourse.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
        return prod;
    }
    public void addProductToCart(String productName){
        WebElement prod = getProductByName(productName);
        System.out.println(prod);
        prod.findElement(addToCart).click();
        waitForElementToAppear(toastContainer);
        waitForElementForDisappear(spinner);
    }
    public void clickOnCart(){
        navigationBar.clickOnCart();
        waitForElementToAppear(checkoutText);
        checkout.click();
    }
    public  List<WebElement> checkOrder(){
        navigationBar.clicknOnOrder();
        waitForElementToAppear(orderXpath);
        return listOfOrders;
    }
    public void checkOrderText(String productName){
        WebElement prod = checkOrder().stream().filter(listOfOrders->listOfOrders.findElement(By.xpath("//h3")).getText().equals(productName)).findFirst().orElse(null);
        Assert.assertTrue(prod.isDisplayed());
    }
}
