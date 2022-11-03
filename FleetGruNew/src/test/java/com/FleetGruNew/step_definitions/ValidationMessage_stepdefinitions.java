package com.FleetGruNew.step_definitions;

import com.FleetGruNew.pages.LoginPage;
import com.FleetGruNew.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class ValidationMessage_stepdefinitions {
    LoginPage loginPage = new LoginPage();

    @Then("user should see validation message {string}")
    public void user_should_see_validation_message(String string) {

        Assert.assertTrue(loginPage.usernameInput.getAttribute("validationMessage").equals(string));

    }

    @Then("user should see message {string}")
    public void userShouldSeeMessage(String string) {
        Assert.assertTrue(loginPage.passwordInput.getAttribute("validationMessage").equals(string));
    }
}
