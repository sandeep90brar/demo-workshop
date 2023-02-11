package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import parentCLass.BaseClass;

public class LogInPage extends BaseClass {
    WebDriver driver;
    @FindBy(xpath = "//a[@class='ico-login']")
    public WebElement login;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement loginEmail;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement loginPassword;
    @FindBy(xpath = "//input[@class='button-1 login-button']")
    public
    WebElement loginButton;
    public LogInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickLogInLink(){

        clickElement(login);
    }
    public void setLoginEmail(String email){
        inputText(loginEmail,email);

    }
    public  void setLoginPassword(String password){
        inputText(loginPassword,password);
    }
 public void clickLoginButton(){
        clickElement(loginButton);
}
}
