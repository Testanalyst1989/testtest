package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import static stepDefinition.HookTestClass.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.net.URL;
import java.sql.Driver;

public class ExamplesFeatureStepDefinition {


//this is step definition for firstfile.feature//
    @Given("^I am a Google Chrome user$")

    public void i_am_a_Google_Chrome_user()  {

        System.out.println("iam in given");
    }



    @When("^I access \"([^\"]*)\" website$")
    public void i_access_website(String Url) {
        // Write code here that turns the phrase above into concrete actions
        driver.get(Url);
       // myDriver.get(Url);

    }
        @Then("^I see title as \"([^\"]*)\"$")
    public void i_see_title_as(String title) {
        Assert.assertEquals(driver.getTitle().contains(title),true);
           // Assert.assertEquals(myDriver.getTitle().contains("facebook"),true);


    }

    }








