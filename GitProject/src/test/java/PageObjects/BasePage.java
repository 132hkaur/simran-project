package PageObjects;

import BrowserControl.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.time.Duration;

public class BasePage extends WebConnector {
    /**
     * method to find and return the element using the given xpath
     * @ param time
     * @ return
      */

public static WebElement FindElementByXpath(int time,String xpath) {
  return new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
}
}
