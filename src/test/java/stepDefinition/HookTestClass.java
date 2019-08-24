package stepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HookTestClass {

    public static WebDriver driver;
       ConfigFileReader cfr = new ConfigFileReader();
    @Before
    public void beforeScenario(Scenario scenario){
        System.out.println("i run first");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sande\\IdeaProjects\\testtest\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        Log.startTestCase(scenario.getName());
        System.out.println("i run first completed");
    }
    @After
    public void afterScenario(){

        driver.quit();
    }





}
