package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.ui.Wait;

public class Hooks {

    @Before
    public void setup(){
        Driver.get().manage().window().maximize();
        BrowserUtils.waitFor(4);

        String url= ConfigurationReader.get("url");
        Driver.get().get(url);

        System.out.println("\nThis is coming before scenario");
    }

    @After
    public void teardown(){
        System.out.println("This is coming from after scenario\n");
        Driver.closeDriver();
    }

    @After("@sales_manager")
    public void tearDown(){
        System.out.println("This is coming from after scenario for sales managers\n");
    }

}
