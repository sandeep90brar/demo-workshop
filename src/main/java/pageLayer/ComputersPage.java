package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import parentCLass.BaseClass;

public class ComputersPage extends BaseClass {
    WebDriver driver;
    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(text(),'Computers')]")
    public
    WebElement computers;
    @FindBy(xpath = "//img[@title='Show products in category Desktops']")
    WebElement getDesktopInGrid;
    @FindBy(xpath = "//ul[@class='sublist firstLevel active']//li[1]")
    public
    WebElement desktop;
    @FindBy(xpath = "//img[@title='Show products in category Notebooks']")
    WebElement notebooks;
    @FindBy(xpath = "//ul[@class='sublist firstLevel active']//li[3]")
    WebElement accessories;
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortBy;
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement displayPerPage;
    @FindBy(xpath = "//select[@id='products-viewmode']")
    WebElement viewAs;
    @FindBy(xpath = "//ul[@class='price-range-selector']//li[1]")
    public
    WebElement getComputersUnder1000;
    @FindBy(xpath = "//ul[@class='price-range-selector']//li[2]")
    public
    WebElement getComputersFrom1000To1200;
    @FindBy(xpath = "//ul[@class='price-range-selector']//li[3]")
    WebElement getComputersAbove1200;
    @FindBy(xpath = "//div[@class='product-grid']//a[contains(text(),'cheap computer')]")
    WebElement buildYourOwnCheapComp;
    @FindBy(xpath = "//div[@class='product-grid']//a[contains(text(),'expensive computer')]")
    WebElement buildYourOwnExpensiveComp;
    @FindBy(xpath = "//div[@class='product-grid']//a[contains(text(),'Simple')]")
    WebElement simpleComp;
    @FindBy(xpath = "//div[@class='product-grid']//a[contains(text(),'Elite')]")
    WebElement eliteComp;
    @FindBy(xpath = "//div[@class='product-grid']//a[contains(text(),'Desktop PC with CDRW')]")
    WebElement cdrwComp;
    @FindBy(xpath = "//div[@class='product-grid']//div[@data-productid='16']//a[contains(text(),'Build')]")
    WebElement buildYourOwnComp;
@FindBy(xpath = "//img[@title='Show products in category Notebooks']")
WebElement getNotebooks;
@FindBy(xpath = "//img[@title='Show products in category Accessories']")
WebElement getAccessories;
    public ComputersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickComputers(){
        clickElement(computers);
    }

    public void clickDesktopInGrid(){
        clickElement(getDesktopInGrid);
    }

    public void clickBuildYourOwnCheapComp() {
        clickElement(buildYourOwnCheapComp);
    }

    public void clickBuildYourOwnExpensiveComp() {
        clickElement(buildYourOwnExpensiveComp);
    }

    public void clickSimpleComp() {
        clickElement(simpleComp);
    }

    public void clickBuildEliteComp() {
        clickElement(eliteComp);
    }

    public void clickCdrwComp() {
        clickElement(cdrwComp);
    }

    public void clickBuildYourOwnComp() {
        clickElement(buildYourOwnComp);
    }



    public void moveMouseToComputers() {
        mouseMoveToElement(computers);
    }

    public void clickDesktops() {
        clickElement(desktop);
    }

    public void clickNotebooks() {
        clickElement(notebooks);
    }

    public void clickAccessories() {
        clickElement(accessories);
    }

    public void setSortBy(String text) {
        selectFromDropdown1(sortBy, text);
    }

    public void setDisplayPerPage(String text) {
        selectFromDropdown1(displayPerPage, text);
    }

    public void setViewAs(String text) {
        selectFromDropdown1(viewAs, text);
    }
}
