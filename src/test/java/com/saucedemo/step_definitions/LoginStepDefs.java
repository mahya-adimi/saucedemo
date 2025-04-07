package com.saucedemo.step_definitions;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.utilities.BrowserUtils;
import com.saucedemo.utilities.ConfigurationReader;
import com.saucedemo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("The user logs in as standard_user")
    public void the_user_logs_in_as_standard_user() {
        loginPage.loginWithStandardUser();
    }

    @Then("The user should be able to see {string} title")
    public void theUserShouldBeAbleToSeeTitle(String title) {
        BrowserUtils.displayElementWithText(title);
    }


    @When("The user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("The warning message is {string}")
    public void the_warning_message_is(String warningMessage) {
        BrowserUtils.displayElementWithText(warningMessage);
    }
}
