package testLayer;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import pageLayer.BooksPage;
import parentCLass.BaseClass;

public class BooksPageTest extends BaseClass {

    @Test(priority = 0)
    public void addComputingBook() {
        openURL("https://demowebshop.tricentis.com/");
        ExtTest.log(LogStatus.PASS,"Opened URl");
        BooksPage books = new BooksPage(driver, ExtTest);
        clickElement(books.booksLink);
        books.setSortBy("Price: Low to High");
        books.setDisplayPerPage("8");
        books.setViewAs("List");
        books.clickElement(books.booksUnder25);
        books.clickElement(books.ComputingAndInternetBook);
        driver.navigate().back();
    }

    @Test(priority = 1)
    public void addFictionBook() {
        openURL("https://demowebshop.tricentis.com/");
        BooksPage books = new BooksPage(driver,ExtTest);
        books.clickElement(books.booksLink);
        books.setSortBy("Name: Z to A");
        books.setDisplayPerPage("4");
        books.setViewAs("Grid");
        books.clickElement(books.booksUnder25);
        books.clickElement(books.fictionBook);
        driver.navigate().back();
    }

    @Test(priority = 2)
    public void addHealthBook() {
        openURL("https://demowebshop.tricentis.com/");
        BooksPage books = new BooksPage(driver,ExtTest);
        books.clickElement(books.booksLink);
        books.setSortBy("Name: Z to A");
        books.setDisplayPerPage("12");
        books.setViewAs("Grid");
        books.clickElement(books.booksUnder25);
        books.clickElement(books.healthBook);

    }
}