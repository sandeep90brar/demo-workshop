package testLayer;

import org.testng.annotations.Test;
import pageLayer.BooksPage;
import pageLayer.ComputersPage;
import parentCLass.BaseClass;

public class ComputersPageTest extends BaseClass {
    @Test(priority = 0)
    public void addCheapComp() {
        openURL("https://demowebshop.tricentis.com/");
        ComputersPage computersPage = new ComputersPage(driver);
        computersPage.clickComputers();
       // computersPage.clickDesktops();
        computersPage.clickDesktopInGrid();
        //computersPage.moveMouseToComputers();

        computersPage.setSortBy("Name: A to Z");
        computersPage.setDisplayPerPage("8");
        computersPage.setViewAs("Grid");
        clickElement(computersPage.getComputersUnder1000);
        computersPage.clickBuildYourOwnCheapComp();

    }
}
