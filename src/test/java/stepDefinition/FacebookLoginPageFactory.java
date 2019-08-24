package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.FacebookLoginPage;

public class FacebookLoginPageFactory {


    @FindBy(id="email")
    static WebElement emailInput;
    @FindBy(id="pass")
    static WebElement pwdInput;
    @FindBy(xpath = "//input[@value='Log In']")
    //@FindBy(id = "u_0_2")
    static WebElement loginInput;

  /*  @FindBy(xpath = "//input[@name='firstname']")
    static WebElement firstNameInput;
    @FindBy(id="")*/

    public static void loginpage(String usr, String pwd){
        emailInput.sendKeys(usr);
        pwdInput.sendKeys(pwd);
        System.out.println("ABC");
        //loginInput.click();
    }


}
