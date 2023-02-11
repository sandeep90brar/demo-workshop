package testLayer;

import org.testng.annotations.Test;
import pageLayer.ComputersPage;
import pageLayer.NotebooksPage;
import parentCLass.BaseClass;

public class NotebookPageTest extends BaseClass {
    @Test(priority = 0)
    public void add14InchLaptop() {
        openURL("https://demowebshop.tricentis.com/");
        ComputersPage computersPage = new ComputersPage(driver);
        computersPage.clickComputers();
        computersPage.clickNotebooks();
        computersPage.setSortBy("Price: High to Low");
        computersPage.setDisplayPerPage("4");
        computersPage.setViewAs("List");
        NotebooksPage notebooksPage=new NotebooksPage(driver);
        notebooksPage.click14InchLaptop();

}}
