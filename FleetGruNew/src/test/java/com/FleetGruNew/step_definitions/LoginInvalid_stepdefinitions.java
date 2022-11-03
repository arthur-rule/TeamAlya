package com.FleetGruNew.step_definitions;

import com.FleetGruNew.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginInvalid_stepdefinitions {
    LoginPage loginPage = new LoginPage();

    @Then("user should see  {string}")
    public void user_should_see(String string) {
        Assert.assertTrue(loginPage.alertMessage.getText().equals(string));
    }


}
