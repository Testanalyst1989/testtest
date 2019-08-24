package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage {

public WebElement captureEmailInput(WebDriver driver){
    //System.out.println("email element identified");
    return driver.findElement(By.id("email"));


}
public WebElement capturepwdInput(WebDriver driver){
    //System.out.println("pass element identified");
    return driver.findElement(By.id("pass"));
}



public WebElement captureLoginbutton(WebDriver driver){
    return driver.findElement(By.xpath("//input[@id='pass']"));
}
public void loginFacebook(String email, String pwd, WebDriver driver){

    captureEmailInput(driver).sendKeys(email);
    System.out.println("email element sent");
    capturepwdInput(driver).sendKeys(pwd);
    System.out.println("pass element sent");
    captureLoginbutton(driver).click();
    System.out.println("login element sent");


}

}
