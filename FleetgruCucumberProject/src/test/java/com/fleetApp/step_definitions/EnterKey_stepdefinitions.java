package com.fleetApp.step_definitions;

import com.fleetApp.pages.LoginPage;
import com.github.javafaker.App;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class EnterKey_stepdefinitions {
    LoginPage loginPage = new LoginPage();

    @When("user press the enter key")
    public void user_press_the_enter_key() {
        loginPage.submitButton.sendKeys(Keys.ENTER);

    }
    @When("user enters to username {string}")
    public void user_enters_to_username(String string) {
        loginPage.usernameInput.sendKeys(string);
    }
    @When("user enters to password {string}")
    public void user_enters_to_password(String string) {
        loginPage.passwordInput.sendKeys(string);
    }


}
