package com.FleetGruNew.step_definitions;

import com.FleetGruNew.pages.LoginPage;
import com.FleetGruNew.pages.ProfileMenuPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logout_stepdefinitions {

    ProfileMenuPage profileMenuPage = new ProfileMenuPage();
    LoginPage loginPage= new LoginPage();

    @When("user click to profile menu")
    public void user_click_to_profile_menu() {

        profileMenuPage.dropdownMenu.click();

    }
    @When("user clicks to log out button")
    public void user_clicks_to_log_out_button() {

        profileMenuPage.logoutButton.click();

    }
    @Then("user should see login page")
    public void user_should_see_login_page() {

        loginPage.loginPageHeader.getText().equals("Login");

    }


}
