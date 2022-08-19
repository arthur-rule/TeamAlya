package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before (order = 14)
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }

    @Before (value = "@student", order = 9)
    public void setupScenarioForStudents(){
        System.out.println("====this will apply to scenarios with @student");
    }

    @After
    public void  teardownScenario(){
        System.out.println("====Closing browser using cucumber @After");
        System.out.println("====Scenario ended/ Take screenshot if failed!");
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("-------------applying setup using @BeforeSetup");
    }

    @AfterStep
    public void  afterStep(){
        System.out.println("-------------applying tearDown using @AfterStep");
    }

}
