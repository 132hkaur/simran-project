package StepDefinitions;

import BrowserControl.WebConnector;
import PageObjects.DropdownPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DropdownStepDefinitions extends WebConnector {
    DropdownPage dropdownPage = new DropdownPage();

    @Then("the user should see the {int} options in the dropdown box")
    public void the_user_should_see_the_options_in_the_dropdown_box(Integer count) {
        dropdownPage.checkNumberOfOptions(count);
    }

    @When("the user click on the product sort dropdown")
    public void the_user_click_on_the_product_sort_dropdown() {
        dropdownPage.clickproductsortdropdown();
    }

    @When("the user select {string} option from product sort dropdown")
    public void the_user_select_option_from_product_sort_dropdown(String option) {
        dropdownPage.clickproductsortdropdown();
    }

    @Then("the user should see {string} option is selected")
    public void the_user_should_see_option_is_selected(String option) {

    }

}




