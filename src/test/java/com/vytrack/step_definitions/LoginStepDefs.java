package com.vytrack.step_definitions;


import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import javax.security.auth.login.Configuration;
import java.awt.dnd.DragGestureEvent;

public class LoginStepDefs {

    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        System.out.println("User on Login Page");
        //Driver.get() ---> this gets the webdriver;
        //Driver.get() ---> driver

    }

    @When("the user enters driver credentials")
    public void the_user_enters_driver_credentials() {
        System.out.println("User enters driver credentials");
        String driverUsername= ConfigurationReader.get("driver_username");
        String driverPassword=ConfigurationReader.get("driver_password");
        LoginPage loginPage= new LoginPage();

        loginPage.userName.clear();
        loginPage.password.clear();
        loginPage.login(driverUsername, driverPassword);

        loginPage.waitUntilLoaderScreenDisappear();


        String actualTitle= Driver.get().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);

    }


    @When("the user enters sales manager credentials")
    public void the_user_enters_sales_manager_credentials() {
        String driverUsername= ConfigurationReader.get("sales_manager_username");
        String driverPassword=ConfigurationReader.get("sales_manager_password");
        LoginPage loginPage= new LoginPage();
        loginPage.userName.clear();
        loginPage.password.clear();
        loginPage.login(driverUsername, driverPassword);


        loginPage.waitUntilLoaderScreenDisappear();

        String actualTitle= Driver.get().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);

        System.out.println("User enters sales manager credentials");

    }

    @When("the user enters store manager credentials")
    public void the_user_enters_store_manager_credentials() {
        String driverUsername= ConfigurationReader.get("store_manager_username");
        String driverPassword=ConfigurationReader.get("store_manager_password");
        LoginPage loginPage= new LoginPage();
        loginPage.userName.clear();
        loginPage.password.clear();
        loginPage.login(driverUsername, driverPassword);


        loginPage.waitUntilLoaderScreenDisappear();

        String actualTitle= Driver.get().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);

        System.out.println("User enters store manager credentials");

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

        System.out.println("User successfully logged in");
    }


}
