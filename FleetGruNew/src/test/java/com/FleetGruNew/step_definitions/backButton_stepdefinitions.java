package com.FleetGruNew.step_definitions;

import com.FleetGruNew.pages.LoginPage;
import com.FleetGruNew.pages.ProfileMenuPage;
import com.FleetGruNew.utilities.Driver;
import io.cucumber.java.en.When;

public class backButton_stepdefinitions {

    ProfileMenuPage profileMenuPage = new ProfileMenuPage();
    LoginPage loginPage= new LoginPage();

    @When("user clicks to back button")
    public void user_clicks_to_back_button() {

        Driver.getDriver().navigate().back();

    }
}
