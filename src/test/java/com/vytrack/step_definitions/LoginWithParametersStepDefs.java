package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithParametersStepDefs {

    @When("user logs in {string} and {string}")
    public void user_logs_in_and(String username, String password) {

        LoginPage loginPage= new LoginPage();
        loginPage.login(username, password);

    }

    @Then("the title should contain {string}")
    public void the_title_should_contain(String ExpectedPageTitle) {
        LoginPage loginPage= new LoginPage();
        loginPage.waitUntilLoaderScreenDisappear();
        String actualPageTitle=Driver.get().getTitle();


        Assert.assertTrue(actualPageTitle.contains(ExpectedPageTitle));
    }
    @Given("a driver is logged in")
    public void a_driver_is_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        String username= ConfigurationReader.get("driver_username");
        String password= ConfigurationReader.get("driver_password");
        new LoginPage().login(username, password);

    }

    @When("the user goes to {string} {string}")
    public void the_user_goes_to(String tab, String module) {
        new DashboardPage().navigateToModule(tab, module);

            }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer count) {
        ContactsPage page= new ContactsPage();
        page.waitUntilLoaderScreenDisappear();
        Integer actualCount= Integer.parseInt(page.pageCount.getAttribute("value"));

        Assert.assertEquals(count, actualCount);



    }



}
