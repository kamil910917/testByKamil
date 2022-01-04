package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverInit {
    private static WebDriver driver = null;

    public static void initialize() {
        WebDriverManager.chromedriver().setup();
        setDriver(new ChromeDriver());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    public static WebDriver getInstance() {
        return driver;
    }

    public static void setDriver(WebDriver instance) {
        driver = instance;
    }
}