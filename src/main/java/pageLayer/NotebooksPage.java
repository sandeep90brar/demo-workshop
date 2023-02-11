package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import parentCLass.BaseClass;

public class NotebooksPage extends BaseClass {
    WebDriver driver;
    @FindBy(xpath = "//a[contains(text(),'14.1-inch Laptop')]")
    WebElement get141InchLaptop;
    public void click14InchLaptop(){
        clickElement(get141InchLaptop);
    }

    public NotebooksPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
