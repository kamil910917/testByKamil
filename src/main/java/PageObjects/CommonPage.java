package PageObjects;

import AutomationFramework.TestData;
import Driver.DriverInit;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class CommonPage {

    private int waitTime = 15; //dependent on sandbox performance
    private By userEmail = By.xpath("//input[@id='email_create']");
    private By submitCreateAnAccount = By.xpath("//button[@id='SubmitCreate']");
    private By radioButton = By.xpath("//div[@id='uniform-id_gender1']");
    private By firstNamePath = By.xpath("//input[@id='customer_firstname']");
    private By lastNamePath = By.xpath("//input[@id='customer_lastname']");
    private By passwordPath = By.xpath("//input[@id='passwd']");
    private By dayOfBirth = By.xpath("//select[@id='days']");
    private By monthOfBirth = By.xpath("//select[@id='months']");
    private By yearOfBirth = By.xpath("//select[@id='years']");
    private By signUpCheckBox = By.xpath("//input[@id='newsletter']");
    private By specialOffersCheckBox = By.xpath("//input[@id='optin']");
    private By address = By.xpath("//input[@id='address1']");
    private By city = By.xpath("//input[@id='city']");
    private By state = By.xpath("//select[@id='id_state']");
    private By postalCode = By.xpath("//input[@id='postcode']");
    private By country = By.xpath("//select[@id='id_country']");
    private By mobilePhone = By.xpath("//input[@id='phone_mobile']");
    private By assignAnAddress = By.xpath("//input[@id='alias']");

    public WebElement initElement(By locator) {
        return DriverInit.getInstance().findElement(locator);
    }

    public void clickElement(By element) {
        highlightElement(element);
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
        initElement(locator).sendKeys(generateRandomString() + "@gmail.com");
    }

    public void setRandomValue(By locator) {
        highlightElement(locator);
        initElement(locator).clear();
        initElement(locator).sendKeys(generateRandomString());
    }

    public String generateRandomString() {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(20);
        for (int i = 0; i < 12; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        String random = sb.toString();
        return random;
    }

    public void selectPicklistValue(By locator, int index) {
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

    public void switchToBaseWindow(String window) {
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

    public void acceptAlert() {
        DriverInit.getInstance().switchTo().alert().accept();
    }

    public void doubleClick(By locator) {
        Actions actions = new Actions(DriverInit.getInstance());
        actions.doubleClick(DriverInit.getInstance().findElement(locator)).perform();
    }

    public void insertRandomEmailAndAcceptAccountCreate() {
        clickElement(userEmail);
        setRandomValueWithEmail(userEmail);
        clickElement(submitCreateAnAccount);
    }

    public void selectGender() {
        highlightElement(radioButton);
        waitForElement(radioButton, 5);
        clickUsingJS(radioButton);
    }

    public void insertFirstName() {
        setValue(firstNamePath, TestData.firstName);
    }

    public void insertLastName() {
        setValue(lastNamePath, TestData.lastName);
    }

    public void insertPassword() {
        clickElement(passwordPath);
        setRandomValue(passwordPath);
    }

    public void selectDayOfBirth(int day) {
        selectPicklistValue(dayOfBirth, day);
    }

    public void selectMonthOfBirth(int month) {
        selectPicklistValue(monthOfBirth, month);
    }

    public void selectYearOfBirth(int year) {
        selectPicklistValue(yearOfBirth, year);
    }

    public void signUpToNewsletterCheckBox() {
        clickUsingJS(signUpCheckBox);
    }

    public void receiveSpecialOffersFromOurPartnersCheckBox() {
        clickUsingJS(specialOffersCheckBox);
    }

    public void yourPersonalInformation(int dayIndex, int monthIndex, int yearIndex) {
        selectGender();
        insertFirstName();
        insertLastName();
        insertPassword();
        selectDayOfBirth(dayIndex);
        selectMonthOfBirth(monthIndex);
        selectYearOfBirth(yearIndex);
        signUpToNewsletterCheckBox();
        receiveSpecialOffersFromOurPartnersCheckBox();
    }

    public void signIn() {
        yourPersonalInformation(2, 1, 1);
        yourAddress();
    }

    public void yourAddress() {
        setAddress();
        setCity();
        setState();
        setPostalCode();
        setCountry();
        setMobilePhone();
        setFullAddress();
    }

    public void setAddress() {
        highlightElement(address);
        setValue(address, TestData.street);
    }

    public void setCity() {
        highlightElement(city);
        setValue(city, TestData.city);
    }

    public void setState() {
        highlightElement(state);
        selectPicklistValue(state, 1);
    }

    public void setPostalCode() {
        highlightElement(postalCode);
        setValue(postalCode, TestData.postalCode);
    }

    public void setCountry() {
        highlightElement(country);
        selectPicklistValue(country, 1);
    }

    public void setMobilePhone() {
        highlightElement(mobilePhone);
        clickElement(mobilePhone);
        setValue(mobilePhone, TestData.mobileNumber);
    }

    public void setFullAddress() {
        clickElement(assignAnAddress);
        setValue(assignAnAddress, TestData.fullAddress);
    }
}