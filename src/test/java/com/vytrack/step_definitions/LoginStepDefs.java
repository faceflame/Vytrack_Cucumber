package com.vytrack.step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("User on Login Page");
    }

    @When("the user enters driver credentials")
    public void the_user_enters_driver_credentials() {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("User enters driver credentials");
    }


    @When("the user enters sales manager credentials")
    public void the_user_enters_sales_manager_credentials() {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("User enters sales manager credentials");

    }
    @When("the user enters store manager credentials")
    public void the_user_enters_store_manager_credentials() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User enters store manager credentials");

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("User successfully logged in");
    }





}
