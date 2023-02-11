package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import parentCLass.BaseClass;

public class ComputingAndInternetPage extends BaseClass {
    WebDriver driver;
    @FindBy(xpath = "//input[@id='addtocart_13_EnteredQuantity']")
    WebElement quantity;
    @FindBy(xpath = "//input[@id='add-to-cart-button-13']")
    public
    WebElement addToCartComputingBook;
    @FindBy(xpath = "//input[@class='button-2 email-a-friend-button']")
    WebElement emailFriend;
    @FindBy(xpath = "//input[@class='button-2 add-to-compare-list-button']")
    WebElement compareList;
    @FindBy(xpath = "//a[contains(text(),'Add your review')]")
    WebElement addReviews;
    @FindBy(xpath = "//p[contains(text(),'The product has been added to your ')]")
    WebElement msgAddToCart;
    public ComputingAndInternetPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setQuantity(String qty) {
        quantity.clear();
        quantity.sendKeys(qty);
    }
    public void verifyAddToCart(){
        String msg="The product has been added to your shopping cart";
        if(msgAddToCart.getText().equals(msg)){
            System.out.println("Test Passed");
        }
        else{
            System.out.println("test failed");
        }
    }
}
