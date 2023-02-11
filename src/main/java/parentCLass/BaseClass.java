package parentCLass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.IInvokedMethod;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

public class BaseClass {
    public ChromeDriver driver;
    public ExtentReports ExtRep = null;
    public ExtentTest ExtTest = null;
    String fileWithPath = "C:\\Users\\sande\\Desktop\\Training\\Selenium\\Screenshot\\";

    @BeforeMethod
    public void openBrowser(Method method) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        System.out.println("Opened Browser - Chrome");
        ExtRep = ExtentManager.getInstance();
        ExtTest = ExtRep.startTest(method.getName());
    }

   // @AfterMethod
    public void closeBrowser() {
        driver.close();
        ExtRep.endTest(ExtTest);
        ExtRep.flush();
        System.out.println("Closed Browser....");
    }

    public void openURL(String URL) {
        driver.get(URL);
        System.out.println("Opened URL - " + URL);
    }

    public void clickElement(WebElement element) {
        element.click();
        ExtTest.log(LogStatus.INFO,"Clicked element");
    }

    public void inputText(WebElement element,String text) {
        element.sendKeys(text);
        System.out.println("Entered Data - " + text);
    }

    public void waitForElement() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void waitForElementPresent(WebElement ele) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(ele));
    }

    public void scrollToElement(WebElement ele) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(false);", ele);
    }

    public void takeScreenShot(String name) {
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmss");
        Date date = new Date();
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File(fileWithPath + name + "_" + formatter.format(date) + ".png");
        try {
            FileUtils.copyFile(SrcFile, DestFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void selectFromDropdown1(WebElement element,String text){
        Select dropdown=new Select(element);
        element.click();
        dropdown.selectByVisibleText(text);
    }


    public void mouseMoveToElement(WebElement element){
        Actions actions=new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
    public void enterData(String name){

    }
}

