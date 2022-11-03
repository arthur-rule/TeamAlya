package com.FleetGruNew.step_definitions;

import com.FleetGruNew.pages.LoginPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class enterKeyLogin_stepdefinitions {

    LoginPage loginPage = new LoginPage();
    @When("user press the enter key")
    public void user_press_the_enter_key() {
        loginPage.submitButton.sendKeys(Keys.ENTER);
    }
}
