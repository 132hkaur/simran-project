package PageObjects;

import BrowserControl.WebConnector;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownPage extends WebConnector {

    /***** Locators /*****/
    private String dropdownXpath = "//select[@class='product_sort_container']";
    private String selectedOptionXpath = "//span[@class='active_option']";

    /***Getters and Setters***/
    /**
     * method to check the number of options in dropdown box
     *
     * @param expectedCount
     */
    public void checkNumberOfOptions(int expectedCount) {
        WebElement dropdown = BasePage.FindElementByXpath(10, dropdownXpath);
        List<WebElement> options = dropdown.findElements(By.tagName("option"));
        Assert.assertEquals(expectedCount, options.size());

    }

    public void clickproductsortdropdown() {
        BasePage.FindElementByXpath(10, dropdownXpath).click();
    }

    public void selectOptionfromproductsortdropdown(String option) {
        WebElement productsortdropdown = BasePage.FindElementByXpath(10, dropdownXpath);
        Select select = new Select(productsortdropdown);
        select.selectByVisibleText(option);

        }
   public void checkselectedoption(String expectedoption){
       String actualoption = BasePage.FindElementByXpath(10,selectedOptionXpath).getText();
       Assert.assertEquals(expectedoption, actualoption);

   }
    }
