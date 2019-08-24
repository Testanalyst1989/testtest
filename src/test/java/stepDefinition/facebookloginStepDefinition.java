package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.FacebookLoginPage;
import static stepDefinition.HookTestClass.*;

public class facebookloginStepDefinition {

//    WebDriver driver;
    WebElement fbUserName;
    WebElement fbPassword;
    WebElement fblogin;
    WebElement Driver;
FacebookLoginPage login = new FacebookLoginPage();
ConfigFileReader myconfig = new ConfigFileReader();



   /* @When("^I access  facebook website$")
    public void i_access_facebook_website() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^I see facebook Login Page$")
        driver.get("https://www.facebook.com/");

    }

    @Then("^I see Username Textbox$")
    public void i_see_Username_Textbox()  {

       //driver.findElement(By.id("email")).sendKeys("testtest@gmail.com");

       // Assert.assertEquals("email",fbUserName);
       // Assert.assertEquals(driver.getTitle().contains("fbUserName"),true);
        fbUserName = driver.findElement(By.id("email"));
        junit.framework.Assert.assertEquals(true,fbUserName.isDisplayed());
        fbUserName.sendKeys("testtest@gmail.com");



    public void i_see_facebook_Login_Page()  {

       driver = new ChromeDriver();

    }

    @Then("^I see Password Textbox$")
    public void i_see_Password_Textbox() {
        // Write code here that turns the phrase above into concrete actions
          fbPassword = driver.findElement(By.name("pass"));
        Assert.assertEquals(true,fbPassword.isDisplayed());
        fbPassword.sendKeys("12345");


    }

    @Then("^I see Login Button$")
    public void i_see_Login_Button()  {

       fblogin = driver.findElement(By.id("u_0_2"));
        Assert.assertEquals(true,fblogin.isDisplayed());
        fblogin.click();


    }*/

    @Given("^i am Access facebook website page$")
    public void i_am_Access_facebook_website_page() {

        driver.get(myconfig.getApplicationUrl("facebookURL"));
    }

    @When("^i access webelement using Xpath$")
    public void i_access_webelement_using_Xpath(){

        login.captureEmailInput(driver).sendKeys("deepapuli@gmail.com");
        login.capturepwdInput(driver).sendKeys("12345");
    }

    @Then("^i see personal facebook page$")
    public void i_see_personal_facebook_page() {

       login.captureLoginbutton(driver).click();
       CaptureScreenShot cs = new CaptureScreenShot();
       cs.capScrSht(driver,"scr1");

    }
}
