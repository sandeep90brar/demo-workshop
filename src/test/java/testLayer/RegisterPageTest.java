package testLayer;

import com.relevantcodes.extentreports.ExtentTest;
import org.testng.annotations.Test;
import pageLayer.HomePage;
import pageLayer.RegisterPage;
import parentCLass.BaseClass;

public class RegisterPageTest extends BaseClass {
    ExtentTest test;
    @Test
    public void registerPerson(){
        openURL("https://demowebshop.tricentis.com/");
        HomePage home = new HomePage(driver);
        home.clickOnRegisterLink();
        RegisterPage register = new RegisterPage(driver);
        register.selectGender("Male");
        register.setFirstName("Mandy");
        register.setLastName("BrarC");
        register.setEmail("mandy248@gmail.com");
        register.setPassword("123456m");
        register.setConfirmPassword("123456m");
        register.clickRegisterButton();



    }
}
