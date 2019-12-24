package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ContactsStepDefs {

    @Then("the user should see the following menu options")
    public void the_user_should_see_the_following_menu_options(List<String> expectedList) {
        DashboardPage dashboardPage = new DashboardPage();

        List<String> actualList = new ArrayList<>();
        BrowserUtils.waitFor(2);

        for (int i = 0; i < dashboardPage.menuOptions.size(); i++) {
            actualList.add(dashboardPage.menuOptions.get(i).getText());
        }

        System.out.println(actualList);
        Assert.assertEquals(expectedList, actualList);



    }


}
