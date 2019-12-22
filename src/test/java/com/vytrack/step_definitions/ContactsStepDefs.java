package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import io.cucumber.java.en.Then;

import java.util.List;

public class ContactsStepDefs {

    @Then("the user should see the following menu options")
    public void the_user_should_see_the_following_menu_options(List<String> list) {
        LoginPage page= new LoginPage();

        System.out.println(list.size());
        System.out.println(list);


    }



}
