package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import parentCLass.BaseClass;

public class RegisterPage extends BaseClass {
    WebDriver driver;
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement male;
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement female;
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @FindBy(xpath = "//input[@id='register-button']")
    WebElement registerButton;


    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectGender(String gender) {
        if (gender.toUpperCase().equals("MALE")) {
            male.click();
        } else {
            female.click();
        }
    }
    public void setFirstName(String fName){
        inputText(firstName, fName);
        //firstName.sendKeys(fName);
    }
    public void setLastName(String lName){
        inputText(lastName,lName);
    }
    public void setEmail(String enterEmail){
        inputText(email,enterEmail);

    }
    public void setPassword(String enterPassword){
        inputText(password,enterPassword);
    }
    public void setConfirmPassword(String enterConfirmPassword){
        inputText(confirmPassword,enterConfirmPassword);
    }
    public  void clickRegisterButton(){
        clickElement(registerButton);

    }
}
