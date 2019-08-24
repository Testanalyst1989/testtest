package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookloginpomstepdefinition {
    WebElement forgottext;
    WebDriver driver;

    @Given("^i am in facebook page$")
    public void I_am_in_facebook_page(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

    }
    @Given("click on the forgotten account link$")

    public void click_on_the_forgotten_account_link(){

        driver.findElement(By.linkText("Forgotten account?")).click();
    }

    @When("^Enter the Credentials Click on search$")
    public void Enter_the_Credentials_Click_on_search(){

        forgottext=driver.findElement(By.xpath("//input[@id='identify_email']"));
        forgottext.sendKeys("deepapuli@gmail.com");





    }

    @Then("^i see Reset your password page$")
    public void i_see_Reset_your_password_page(){



    }





}
