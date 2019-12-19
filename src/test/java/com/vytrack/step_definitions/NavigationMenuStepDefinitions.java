package com.vytrack.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefinitions {

    @When("the user goes to Fleet, Vehicles")
    public void the_user_goes_to_Fleet_Vehicles() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("opening Fleet, Vehicles");
    }

    @Then("the URL should be https:\\/\\/qa{int}.vytrack.com\\/entity\\/Extend_Entity_Carreservation")
    public void the_URL_should_be_https_qa_vytrack_com_entity_Extend_Entity_Carreservation(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Verify the user lands on https://qa2.vytrack.com/entity/Extend_Entity_Carreservation");
    }

    @When("the user goes to Activities, Calendar Events")
    public void the_user_goes_to_Activities_Calendar_Events() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("opening Activities, Calendar Events");
    }

    @Then("the URL should be https:\\/\\/qa{int}.vytrack.com\\/calendar\\/event")
    public void the_URL_should_be_https_qa_vytrack_com_calendar_event(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Verify the user lands on https://qa2.vytrack.com/calendar/event");
    }

    @When("the user goes to Marketing, Campaigns")
    public void the_user_goes_to_Marketing_Campaigns() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("opening Marketing, Campaigns");
    }

    @Then("the URL should be https:\\/\\/qa{int}.vytrack.com\\/campaign\\/")
    public void the_URL_should_be_https_qa_vytrack_com_campaign(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Verify the user lands on https://qa2.vytrack.com/campaign/");
    }




}
