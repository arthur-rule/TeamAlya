package com.fleetApp.step_definitions;

import com.fleetApp.pages.ProfilMenuPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ProfilMenu_stepdefinitions {

    ProfilMenuPage profilMenuPage = new ProfilMenuPage();

    @Then("user should see own username {string}")
    public void userShouldSeeOwnUsername(String string) {


        //Assert.assertEquals(profilMenuPage.userMenu.getText(),string);
        Assert.assertTrue(profilMenuPage.userMenu.getText().equals(string));
    }
}
