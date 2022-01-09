package Tests;

import Driver.DriverInit;
import PageObjects.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class SetUpTests {
    private WebDriver driver;
    protected HomePage homePage = new HomePage();
    protected RegistrationPage registrationPage = new RegistrationPage();
    protected OrderPage orderPage = new OrderPage();
    protected PageFooter pageFooter = new PageFooter();
    protected CatalogPage catalogPage = new CatalogPage();
    protected ContactPage contactPage = new ContactPage();
    protected String baseWindow;

    @BeforeClass
    public void setUpDriver() {
        DriverInit.initialize();
        driver = DriverInit.getInstance();
        baseWindow = DriverInit.getInstance().getWindowHandle();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get("http://automationpractice.com/index.php");
    }

//    @AfterClass
//    public void closeDriver() {
//        driver.quit();
//    }
}