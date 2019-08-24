package stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccesswebsiteStepDefinition {
    public WebDriver driver;

        @Given("^Open the facebook.com url$")
        public void open_the_google_browser(){
          System.setProperty("webdriver.chrome.driver",
                  "C:\\Users\\sande\\IdeaProjects\\testtest\\src\\test\\java\\stepDefinition\\chromedriver.exe");

           // System.setProperty("webdriver.geckodriver.driver","C:\\Users\\sande\\Desktop\\geckodriver-v0.23.0-win32.exe");
           driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
           // Thread.sleep(500);


        }


        @When("^open the login page$")
        public void access_the_facebook_website(){
            // Write code here that turns the phrase above into concrete actions
            driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110");

        }

        @Then("^Successfully open the facebook homepage and login page$")
        public void successfully_open_the_facebook_homepage(){
            // Write code here that turns the phrase above into concrete actions    throw new PendingException();}

            driver.quit();
        }

    }