package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class DropdownStatic extends DriverGet{
    public void acceptAlert(){

        driver.switchTo().alert().accept();
        System.out.println("Alert is accepted");
    }

    public void dropDownStatic(){
      getPage();

      //selenium dropdown with select tag
        WebElement staticDropdown = driver.findElement(By.xpath("(//*[@data-testid=\"svg-img\"])[17]"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(2);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("USD");
        System.out.println(dropdown.getFirstSelectedOption().getText());
    }

    public void updatedDropdownStaic(){
        getPage2();
        driver.findElement(By.xpath("(//*[@tabindex])[26]")).click();
        for(int i = 0; i<4; i++){
            driver.findElement(By.xpath("//*[@data-testid=\"Adult-testID-plus-one-cta\"]")).click();
        }
        driver.findElement(By.xpath("(//*[@data-testid=\"home-page-travellers-done-cta\"])")).click();
    }
    public void dynamicDropdown() throws InterruptedException {
        driver.findElement(By.xpath("(//input)[1]")).click();
        driver.findElement(By.xpath("//*[text() = \"AGR\"]"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text() = \"Indore\"]"));

    }

    public void AutoSuggestiveDropdown() throws InterruptedException {
        getPage();
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(5000);
        List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for(WebElement option :options)

        {

            if(option.getText().equalsIgnoreCase("India"))

            {

                option.click();

                break;

            }

        }
    }
    public void checkboxSelect(){
        getPage();
        Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id, 'friendsandfamily')]")).isSelected());
        if(driver.findElement(By.xpath("//input[contains(@id, 'friendsandfamily')]")).isSelected()!=false);
        driver.findElement(By.xpath("//input[contains(@id, 'friendsandfamily')]")).click();
    }
    public void checkCalendarDate(){
        getPage2();
        driver.findElement(By.xpath("//*[@data-testid = 'departure-date-dropdown-label-test-id']")).click();
        driver.findElement(By.xpath("(//*[contains(@class , 'r-y47klf')])[1]")).click();
    }
    public void SelectRadio(){
        getPage();
        if(driver.findElement(By.xpath("//*[@class = \"picker-second\"]")).getAttribute("style").contains("0.5")){
            System.out.println("Enabled");
            Assert.assertTrue(true);
        }
    }
    public void quit(){
        driver.quit();
    }
}
