package com.FleetGruNew.step_definitions;

import com.FleetGruNew.pages.LoginPage;
import com.FleetGruNew.pages.ProfileMenuPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class profileMenu_stepdefinitions {

    ProfileMenuPage profileMenuPage = new ProfileMenuPage();

    @Then("user should see own username {string}")
    public void user_should_see_own_username(String string) {

        Assert.assertTrue(profileMenuPage.userMenu.getText().equals(string));

    }
}
