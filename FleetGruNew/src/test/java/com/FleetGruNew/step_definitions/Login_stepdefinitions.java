package com.FleetGruNew.step_definitions;

import com.FleetGruNew.pages.LoginPage;
import com.FleetGruNew.utilities.BrowserUtils;
import com.FleetGruNew.utilities.ConfigurationReader;
import com.FleetGruNew.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_stepdefinitions {

    LoginPage loginPage =new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        String url= ConfigurationReader.getProperty("fleetgru.url");
        Driver.getDriver().get(url);
    }
    @When("user enters to username {string}")
    public void user_enters_to_username(String string) {
        loginPage.usernameInput.sendKeys(string);

    }
    @When("user enters to password {string}")
    public void user_enters_to_password(String string) {
        loginPage.passwordInput.sendKeys(string);

    }


    @When("user clicks login button")
    public void user_clicks_login_button() {

       BrowserUtils.verifyElementDisplayed(loginPage.submitButton,20);


        loginPage.submitButton.click();

    }
    @Then("user should see {string}")
    public void user_should_see(String string) {

        Assert.assertTrue(loginPage.header.getText().equals(string));

    }
}
