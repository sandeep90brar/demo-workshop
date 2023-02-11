package pageLayer;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import parentCLass.BaseClass;

public class BooksPage extends BaseClass {
    WebDriver driver;
    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Books')]")
    public
    WebElement booksLink;
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortBy;
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement displayPerPage;
    @FindBy(xpath = "//select[@id='products-viewmode']")
    WebElement viewAs;
    @FindBy(xpath = "//ul[@class='price-range-selector']//li[1]")
    public
    WebElement booksUnder25;
    @FindBy(xpath = "//ul[@class='price-range-selector']//li[2]")
    public

    WebElement booksFrom25to50;
    @FindBy(xpath = "//ul[@class='price-range-selector']//li[3]")
    WebElement booksOver50;
    @FindBy(linkText = "Computing and Internet")
    public
    WebElement ComputingAndInternetBook;
    @FindBy(linkText = "Copy of Computing and Internet EX")
    WebElement copyOFComputingBook;
    @FindBy(linkText = "Fiction")
    public
    WebElement fictionBook;
    @FindBy(linkText = "Fiction EX")
    WebElement fictionExBook;
    @FindBy(linkText = "Health Book")
    public
    WebElement healthBook;
    @FindBy(linkText = "Science")
    WebElement scienceBook;
    @FindBy(xpath = "//div[@data-productid='13']//input[@class='button-2 product-box-add-to-cart-button']")
    WebElement addToCartComputingBook;
    @FindBy(xpath = "//div[@data-productid='45']//input[@class='button-2 product-box-add-to-cart-button']")
    WebElement addToCartFictionBook;
    @FindBy(xpath = "//div[@data-productid='22']//input[@class='button-2 product-box-add-to-cart-button']")
    WebElement addToCartHealthBook;

    public void setSortBy(String text) {
        selectFromDropdown1(sortBy, text);
    }

    public void setDisplayPerPage(String text) {
        selectFromDropdown1(displayPerPage, text);
    }

    public void setViewAs(String text) {
        selectFromDropdown1(viewAs, text);
    }


    public BooksPage(WebDriver driver, ExtentTest ExtTest) {
        this.driver = driver;
        this.ExtTest = ExtTest;
        PageFactory.initElements(driver, this);
    }

}
