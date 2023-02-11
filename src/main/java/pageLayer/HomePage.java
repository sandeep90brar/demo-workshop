package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import parentCLass.BaseClass;

public class HomePage extends BaseClass {
WebDriver driver;
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;

    @FindBy(xpath="//a[@class='ico-login']")
    WebElement loginLink1;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnLoginLink(){
        loginLink1.click();
        System.out.println("Clicked on Login Link.");
    }
    public void clickOnRegisterLink() {
        registerLink.click();
        System.out.println("Clicked on Register Link.");
    }
}
