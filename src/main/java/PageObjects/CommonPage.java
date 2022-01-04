package PageObjects;

import Driver.DriverInit;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.util.TimeUtils;
import org.xml.sax.Locator;

import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class CommonPage {
    private int waitTime = 15; //dependent on sandbox performance

    public WebElement initElement(By locator) {
        return DriverInit.getInstance().findElement(locator);
    }

    public void clickElement(By element) {
        waitForElement((element), waitTime);
        initElement(element).click();
    }

    public void scrollToElement(By locator) {
        WebElement element = DriverInit.getInstance().findElement(locator);
        ((JavascriptExecutor) DriverInit.getInstance()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickUsingJS(By locator) {
        JavascriptExecutor executor = (JavascriptExecutor) DriverInit.getInstance();
        executor.executeScript("arguments[0].click();", initElement(locator));
    }

    public void highlightElement(By locator) {
        ((JavascriptExecutor) DriverInit.getInstance()).executeScript("arguments[0].style.border='3px solid green'", initElement(locator));

    }

    public void waitForElement(By locator, int timeInterval) {
        new WebDriverWait(DriverInit.getInstance(), timeInterval).until(ExpectedConditions.elementToBeClickable(locator));
        new WebDriverWait(DriverInit.getInstance(), timeInterval).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void setValue(By locator, String inputValue) {
        waitForElement(locator, waitTime);
        scrollToElement(locator);
        try {
            initElement(locator).click();
        } catch (ElementClickInterceptedException ignored) {
            clickUsingJS(locator);
        }
        highlightElement(locator);
        initElement(locator).clear();
        initElement(locator).sendKeys(inputValue);
    }

    public void setRandomValueWithEmail(By locator) {
        highlightElement(locator);
        initElement(locator).clear();
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(20);
        for (int i = 0; i < 12; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());

            sb.append(AlphaNumericString.charAt(index));
        }
        initElement(locator).sendKeys(sb + "@gmail.com");
    }

    public void setRandomValue(By locator) {
        highlightElement(locator);
        initElement(locator).clear();
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(20);
        for (int i = 0; i < 9; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());

            sb.append(AlphaNumericString.charAt(index));
        }
        initElement(locator).sendKeys(sb);
    }

    public void selectAnElement(By locator, int index) {
        highlightElement(locator);
        Select selectElement = new Select(initElement(locator));
        selectElement.selectByIndex(index);
    }

    public void switchWindow() {
        Set<String> handles = DriverInit.getInstance().getWindowHandles();
        for (String handle : handles) {
            DriverInit.getInstance().switchTo().window(handle);
        }
        DriverInit.getInstance().manage().window().maximize();
    }

    public void switchToWindows(String window) {
        DriverInit.getInstance().switchTo().window(window);
    }


    public void closeWindow() {
        DriverInit.getInstance().close();
    }


    public void hoverAnElement(By locator) {
        Actions action = new Actions(DriverInit.getInstance());
        action.moveToElement(initElement(locator)).perform();
    }

    public void backCommand() {
        DriverInit.getInstance().navigate().back();
    }

    public void moveToElement(By locator) {
        Actions builder = new Actions(DriverInit.getInstance());
        WebElement element = DriverInit.getInstance().findElement(locator);
        Actions mouseOver = builder.moveToElement(element);
    }

    public void acceptAlert() {
        DriverInit.getInstance().switchTo().alert().accept();
    }

}