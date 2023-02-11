package testLayer;

import org.testng.annotations.Test;
import pageLayer.LogInPage;
import parentCLass.BaseClass;

public class LogInPageTest extends BaseClass {
    @Test
    public void login() {
        openURL("https://demowebshop.tricentis.com/");
        LogInPage logInPage = new LogInPage(driver);
        logInPage.clickLogInLink();
        logInPage.setLoginEmail("mandy786@gmail.com");
        logInPage.setLoginPassword("123456m");
        logInPage.loginButton.click();

    }


}