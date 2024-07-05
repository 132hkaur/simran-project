package StepDefinitions;

import BrowserControl.WebConnector;
import PageObjects.LoginPage;
import Utilities.ConstantUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginstepDefinitions extends WebConnector {
    LoginPage loginPage= new LoginPage();
    @Given("the user navigate to {string} page")
    public void the_user_navigate_to_page(String string) {
    driver.get(ConstantUtils.Base_URL);
    }
    @When("the user login with {string} username and {string} password")
    public void the_user_login_with_username_and_password(String username, String password) {
   loginPage.setUserName(username);
   loginPage.setPassword(password);

    }
    @When("the user click on login button")
    public void the_user_click_on_login_button() {
        loginPage.clickLoginButton();
    }
    @Then("the user should see {string}")
    public void the_user_should_see(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));
    }
    @When("the user click on main menu")
    public void the_user_click_on_main_menu() {
    loginPage.clickmainmenu();
    }
    @When("the user click on logout")
    public void the_user_click_on_logout() {
        loginPage.clicklogoutButton();
    }


}





