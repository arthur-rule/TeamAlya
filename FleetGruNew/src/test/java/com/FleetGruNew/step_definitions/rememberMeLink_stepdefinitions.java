package com.FleetGruNew.step_definitions;

import com.FleetGruNew.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class rememberMeLink_stepdefinitions {

    LoginPage loginPage= new LoginPage();
    @When("user should see  {string} link")
    public void user_should_see_link(String string) {
        Assert.assertTrue(loginPage.rememberText.isDisplayed());
    }
    @When("user select Remember Me checkbox")
    public void user_select_remember_me_checkbox() {
        loginPage.rememberCheckbox.click();

    }
    @Then("user should see clickable")
    public void user_should_see_clickable() {

        loginPage.rememberCheckbox.isSelected();

    }
}
