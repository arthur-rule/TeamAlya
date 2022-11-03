package com.FleetGruNew.step_definitions;

import com.FleetGruNew.pages.LoginPage;
import com.FleetGruNew.pages.ProfileMenuPage;
import com.FleetGruNew.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;

public class closeTab_stepdefinitions {
    ProfileMenuPage profileMenuPage = new ProfileMenuPage();
    LoginPage loginPage= new LoginPage();


    @When("user open login page on new tab")
    public void user_open_login_page_on_new_tab() throws InterruptedException {


    }
    @When("user refresh the page at old tab")
    public void user_refresh_the_page_at_old_tab() {

    }

}
