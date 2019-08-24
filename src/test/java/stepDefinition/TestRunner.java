package stepDefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            features ="C:\\Users\\sande\\IdeaProjects\\testtest\\src\\test\\java\\features\\Facebookloginpom.feature",
            glue={"stepDefinition"},
            tags = {"~@smoke,@sanity"},
           // tags = {"~@smoke"},
            format = {"pretty", "html:target/destination" +
                   ""}
    )

    public class TestRunner {


}
