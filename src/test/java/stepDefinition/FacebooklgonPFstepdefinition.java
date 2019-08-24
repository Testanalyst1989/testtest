package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.FacebookLoginPage;
import static stepDefinition.HookTestClass.*;

public class FacebooklgonPFstepdefinition {

   // WebDriver driver;
   @Given("^i am Demo google chrome user$")
    public void i_am_Demo_google_chrome_user() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");


       // driver = new ChromeDriver();
       System.out.println("open google chrome");
        Thread.sleep(3000);

    }

    @When("^i access facebook website$")
    public void i_access_facebook_website() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        System.out.println("i already run");
        Thread.sleep(3000);


    }

    @Then("^i provide valid credentials$")
    public void i_provide_valid_credentials() throws InterruptedException {
        System.out.println("Manual Entry started");
       // driver.findElement(By.id("email")).sendKeys("testing@gmail.com");
       // driver.findElement(By.id("pass")).sendKeys("12345");
       // System.out.println("Manual Entry Executed 1");
       // driver.findElement(By.xpath("//input[@value='Log In']")).click();
      //  System.out.println("Manual Entry Executed 2");
       PageFactory.initElements(driver, FacebookLoginPage.class);
        System.out.println("Manual Entry Executed 3");
        Thread.sleep(3000);

        new FacebookLoginPageFactory().loginpage("testing@gmail.com","12345");
        FacebookLoginPageFactory.loginInput.click();
        System.out.println("Manual Entry Executed 4");


    }

    @Then("^i should  open facebook home page$")
    public void i_should_open_facebook_home_page() {
    }

}
