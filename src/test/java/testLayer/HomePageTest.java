package testLayer;

import org.testng.annotations.Test;
import pageLayer.HomePage;
import pageLayer.RegisterPage;
import parentCLass.BaseClass;

public class HomePageTest extends BaseClass {


    @Test
    public void registerUserTest() {
        openURL("https://demowebshop.tricentis.com/");
        HomePage home = new HomePage(driver);
        home.clickOnRegisterLink();
        RegisterPage register = new RegisterPage(driver);
        register.selectGender("Male");
    }

}