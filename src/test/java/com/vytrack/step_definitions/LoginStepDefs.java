package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
       // Thread.sleep(5000);
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I open browser and navigate to vytrack login page");
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I put user1 username and UserUser123 password and click login button");
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I verify that little changed to Dashboard");
    }


    @When("the user enters the sales manager information")
    public void theUserEntersTheSalesManagerInformation() {
    }

    @When("the user enters the stores manager information")
    public void theUserEntersTheStoresManagerInformation() {
    }
}
