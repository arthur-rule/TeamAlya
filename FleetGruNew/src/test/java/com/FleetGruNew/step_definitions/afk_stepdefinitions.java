package com.FleetGruNew.step_definitions;


import com.FleetGruNew.utilities.Driver;
import io.cucumber.java.en.When;

public class afk_stepdefinitions {

    @When("user will not take action for {int} minutes")
    public void user_will_not_take_action_for_minutes(Integer int1) throws InterruptedException {
        Thread.sleep(int1*60*1000);
        Driver.getDriver().navigate().refresh();
    }


}
