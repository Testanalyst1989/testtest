package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleStepDefinition {
    public WebDriver driver;

    @Given("^Go to GOOGLE browser$")
    public void go_to_GOOGLE_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @When("^Enter the Url http:www\\.facebook\\.com$")
    public void enter_the_Url_http_www_facebook_com()  {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.facebook.com/");

    }

    @Then("^it showing the facebook homepage$")
    public void it_showing_the_facebook_homepage() {
        // Write code here that turns the phrase above into concrete actions

        driver.quit();

    }

    @Given("^Go to Google browser$")
    public void go_to_Google_browser(){
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @When("^Enter the url http:www\\.rightmove\\.com$")
    public void enter_the_url_http_www_rightmove_com()  {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.rightmove.co.uk/");


    }

    @Then("^it showing the rightmove homepage$")
    public void it_showing_the_rightmove_homepage() {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }





    @When("^Enter the url http:www\\.zoopla\\.com$")
    public void enter_the_url_http_www_zoopla_com()  {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.zoopla.co.uk/");

    }

    @Then("^it showing the zoopla homepage$")
    public void it_showing_the_zoopla_homepage(){
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }


    @When("^Enter the url http:www\\.gumtree\\.com$")
    public void enter_the_url_http_www_gumtree_com()  {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.gumtree.com/");

    }

    @Then("^it showing the gumtree homepage$")
    public void it_showing_the_gumtree_homepage()  {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();

    }
    @Given("^Go to google browser$")
    public void go_to_google_browser()  {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @When("^Enter the url http:www\\.HSBC\\.COM$")
    public void enter_the_url_http_www_HSBC_COM()  {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.hsbc.com/");


    }

    @Then("^it showing the hsbc bank homepage$")
    public void it_showing_the_hsbc_bank_homepage() {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }

}
