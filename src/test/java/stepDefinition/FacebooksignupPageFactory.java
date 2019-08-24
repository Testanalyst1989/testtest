package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FacebooksignupPageFactory {

    @FindBy(name = "firstname")
    static WebElement fbfirstname;
    @FindBy(name = "lastname")
    static WebElement fbsuraname;
    @FindBy(id = "u_0_s")
    static WebElement fbemailID;
    @FindBy(name = "reg_passwd__")
    static WebElement fbpassword;
    @FindBy(name = "birthday_day")
    static WebElement fbday;
    @FindBy(name = "birthday_month")
    static WebElement fbmonth;
    @FindBy(name = "birthday_year")
    static WebElement fbyear;


    public void fbsignup(String firstname, String lastname) {
        fbfirstname.sendKeys("deepa");
        fbsuraname.sendKeys("puli");
        fbemailID.sendKeys("test1@gmail.com");
        fbpassword.sendKeys("12345");

    }

    public static void selectDayFromDropdown(String dayString) {
        Select dayselect = new Select(fbday);
        dayselect.selectByValue("1");

    }
    public static void selectMonthFromDropdown(String monthString){
        Select monthselect = new Select(fbmonth);
        monthselect.selectByIndex(11);
    }
    public static void selectYearFromDropdown(String yearString){
        Select yearselect = new Select(fbyear);
        yearselect.selectByVisibleText("1990");
    }
}
