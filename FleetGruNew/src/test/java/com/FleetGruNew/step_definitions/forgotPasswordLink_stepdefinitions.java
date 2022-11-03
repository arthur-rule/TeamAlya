package com.FleetGruNew.step_definitions;


import com.FleetGruNew.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class forgotPasswordLink_stepdefinitions {
    LoginPage loginPage = new LoginPage();

    @When("user clicks to Forgot your password? link")
    public void user_clicks_to_forgot_your_password_link() throws InterruptedException {

        loginPage.forgotPasswordLink.click();

    }
    @Then("user should see {string} page")
    public void user_should_see_page(String string) throws InterruptedException {

        Assert.assertTrue(loginPage.forgotHeader.getText().equals(string));

    }


}
