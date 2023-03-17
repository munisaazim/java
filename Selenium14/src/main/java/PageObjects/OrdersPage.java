package PageObjects;

import AbstractComponent.AbstractComponent;
import AbstractComponent.NavigationBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class OrdersPage extends AbstractComponent {
    private WebDriver driver;
    @FindBy(css = "tr td:nth-child(3)")
    List <WebElement> listOrders;
    By productsBy = By.cssSelector("tr td:nth-child(3)");
    private NavigationBar navigationBar;
    public OrdersPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        navigationBar = new NavigationBar(driver);

    }
    public void clickOnOrdersPage(){
        navigationBar.clicknOnOrder();
    }
    public List<WebElement>getProductList(){
        waitForElementToAppear(productsBy);
        return listOrders;
    }
    public Boolean verifyListofOrders(String productName){
        Boolean check = getProductList().stream().anyMatch(product->product.getText().equalsIgnoreCase(productName));
        return check;
    }
}
