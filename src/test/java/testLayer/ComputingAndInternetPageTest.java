package testLayer;

import org.testng.annotations.Test;
import pageLayer.ComputingAndInternetPage;
import parentCLass.BaseClass;

public class ComputingAndInternetPageTest extends BaseClass {
    @Test
    public void addToCartComputingBook() {
        openURL("https://demowebshop.tricentis.com/computing-and-internet/");
        ComputingAndInternetPage compInt = new ComputingAndInternetPage(driver);
        compInt.setQuantity("5");
        System.out.println("entered qty:3");
        compInt.addToCartComputingBook.click();
        compInt.verifyAddToCart();

    }
}