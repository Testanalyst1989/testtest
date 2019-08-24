package stepDefinition;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class CaptureScreenShot {
    public void capScrSht(WebDriver driver, String screenShotName){

        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(source,new File("C:\\Users\\sande\\IdeaProjects\\testtest\\src\\test\\java\\stepDefinition\\"+screenShotName+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
