package PageObjects;

import BrowserControl.WebConnector;

public class LoginPage extends WebConnector {
 /*****Locators*****/
 private String usernameFieldXpath = "//input[@id='user-name']";
 private String passwordFieldXpath = "//input[@id='password']";
 private String loginButtonXpath = "//input[@id='login-button']";
 private String mainmenuXpath = "//button[@id='react-burger-menu-btn']";
 private String logoutButtonXpath = "//a[@id='logout_sidebar_link']";
/****Getters and Setters ******/
 /**
  * set username field
  *
  * @ param username
  */

 public void setUserName(String username) {
  BasePage.FindElementByXpath(10, usernameFieldXpath).clear();
  BasePage.FindElementByXpath(10, usernameFieldXpath).sendKeys(username);
 }

 public void setPassword(String password) {
  BasePage.FindElementByXpath(10, passwordFieldXpath).clear();
  BasePage.FindElementByXpath(10, passwordFieldXpath).sendKeys(password);
 }

 /**
  * click on login button
  */
 public void clickLoginButton() {
  BasePage.FindElementByXpath(10, loginButtonXpath).click();
 }

 public void clickmainmenu() {
  BasePage.FindElementByXpath(10, mainmenuXpath).click();
 }

 /**
  * click logout button
  *
  */
 public void clicklogoutButton (){
  BasePage.FindElementByXpath(10, logoutButtonXpath).click();



 }

}


