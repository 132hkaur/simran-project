package BrowserControl;

import Utilities.ConstantUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class WebConnector {
 public static WebDriver driver;
 public static void openBrowser() {
  if (ConstantUtils.Browser_NAME.equalsIgnoreCase("firefox")){
   FirefoxOptions fo = new FirefoxOptions();
   fo.addArguments("start-Maximized");
   driver = new FirefoxDriver(fo);
  } else {
   ChromeOptions co = new ChromeOptions();
   co.addArguments("start-maximized");
   driver = new ChromeDriver(co);
  }
   // if using Implicit wait it has to be defined here
   // driver.manage().timeouts().implicitly wait(20, Time unit.seconds);
  }
  public static void closeBrowser() {

  driver.quit();

  }

 }








