package PageObjects;

import AutomationFramework.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class OrderPage extends CommonPage {
    private By printedSummerDress = By.xpath("//img[@title='Printed Summer Dress']");
    private By printedSummerDressSize = By.xpath("//select[@id='group_1']");
    private By printedSummerDressColor = By.xpath("//a[@id='color_14']");
    private By printedSummerDressAddToCart = By.xpath("//*[@id='add_to_cart']/button/span");
    private By proceedToCheckout = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");
    private By proceedNext = By.xpath("//*[@id='center_column']/p[2]/a[1]/span");
    private By userEmail = By.xpath("//input[@id='email_create']");
    private By submitCreateAnAccount = By.xpath("//button[@id='SubmitCreate']");
    private By radioButton = By.xpath("//input[@id='id_gender1']");
    private By firstNamePath = By.xpath("//input[@id='customer_firstname']");
    private By lastNamePath = By.xpath("//input[@id='customer_lastname']");
    private By passwordPath = By.xpath("//input[@id='passwd']");
    private By dayOfBirth = By.xpath("//select[@id='days']");
    private By monthOfBirth = By.xpath("//select[@id='months']");
    private By yearOfBirth = By.xpath("//select[@id='years']");
    private By signUpCheckBox = By.xpath("//input[@id='newsletter']");
    private By specialOffersCheckBox = By.xpath("//input[@id='optin']");
    private By firstNameToAddress = By.xpath("//input[@id='firstname']");
    private By lastNameToAddress = By.xpath("//input[@id='lastname']");
    private By address = By.xpath("//input[@id='address1']");
    private By city = By.xpath("//input[@id='city']");
    private By state = By.xpath("//select[@id='id_state']");
    private By postalCode = By.xpath("//input[@id='postcode']");
    private By country = By.xpath("//select[@id='id_country']");
    private By mobilePhone = By.xpath("//input[@id='phone_mobile']");
    private By assignAnAddress = By.xpath("//input[@id='alias']");
    private By registerAccount = By.xpath("//button[@id='submitAccount']");
    private By goToShipping = By.xpath("//*[@id='center_column']/form/p/button");
    private By checkBoxTermsOfService = By.xpath("//div[@id='uniform-cgv']");
    private By gotoPayment = By.xpath("//button[@name='processCarrier']");
    private By payByBankWire = By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a");
    private By orderConfirmation = By.xpath("//*[@id='cart_navigation']/button/span");
    private By verifyPayment = By.xpath("//*[@id='center_column']/div/p");
    private By goBackToOrders = By.xpath("//*[@id='center_column']/p/a");
    private By backHome = By.xpath("//*[@id='center_column']/ul/li[2]/a");

    public void addToCart() {
        highlightElement(printedSummerDress);
        clickElement(printedSummerDress);
        highlightElement(printedSummerDressSize);
        selectAnElement(printedSummerDressSize, 1);
        highlightElement(printedSummerDressColor);
        clickElement(printedSummerDressColor);
        waitForElement(printedSummerDressAddToCart, 30);
        clickElement(printedSummerDressAddToCart);
        waitForElement(proceedToCheckout, 10);
        clickElement(proceedToCheckout);
        clickElement(proceedNext);
    }

    public void insertAnEmail() {
        clickElement(userEmail);
        setRandomValueWithEmail(userEmail);
        clickElement(submitCreateAnAccount);
    }

    public void selectGender() {
        waitForElement(radioButton, 5);
        highlightElement(radioButton);
        clickElement(radioButton);
    }

    public void insertFirstName() {
        highlightElement(firstNamePath);
        clickElement(firstNamePath);
        setValue(firstNamePath, TestData.firstName);
    }

    public void insertLastName() {
        highlightElement(lastNamePath);
        clickElement(lastNamePath);
        setValue(lastNamePath, TestData.lastName);
    }

    public void insertPassword() {
        highlightElement(passwordPath);
        clickElement(passwordPath);
        setRandomValue(passwordPath);
    }

    public void selectDayOfBirth(int day) {
        highlightElement(dayOfBirth);
        selectAnElement(dayOfBirth, day);
    }

    public void selectMonthOfBirth() {
        highlightElement(monthOfBirth);
        selectAnElement(monthOfBirth, 1);
    }

    public void selectYearOfBirth() {
        highlightElement(yearOfBirth);
        selectAnElement(yearOfBirth, 1);
    }

    public void checkBox() {
        highlightElement(signUpCheckBox);
        clickUsingJS(signUpCheckBox);
        highlightElement(specialOffersCheckBox);
        clickUsingJS(specialOffersCheckBox);
    }

    public void setPersonalData() {
        setFirstName();
        setLastName();
        setAddress();
        setCity();
        setState();
        setPostalcode();
        setCountry();
        setMobilePhone();
        setFullAddress();
    }

    public void setMobilePhone() {
        highlightElement(mobilePhone);
        clickElement(mobilePhone);
        setValue(mobilePhone, TestData.mobileNumber);
    }

    public void setFirstName() {
        scrollToElement(firstNameToAddress);
        highlightElement(firstNameToAddress);
        setValue(firstNameToAddress, TestData.firstName);
    }

    public void setLastName() {
        highlightElement(lastNameToAddress);
        setValue(lastNameToAddress, TestData.lastName);
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
        selectAnElement(state, 1);
    }

    public void setPostalcode() {
        highlightElement(postalCode);
        setValue(postalCode, TestData.postalCode);
    }

    public void setCountry() {
        highlightElement(country);
        selectAnElement(country, 1);
    }

    public void setFullAddress() {
        clickElement(assignAnAddress);
        setValue(assignAnAddress, TestData.fullAddress);
    }

    public void setAccountRequiredValues() {
        selectGender();
        insertFirstName();
        insertLastName();
        insertPassword();
        selectDayOfBirth(1);
        selectMonthOfBirth();
        selectYearOfBirth();
        checkBox();
        setPersonalData();
    }

    public void registrationAnAccount() {
        clickElement(registerAccount);
        clickElement(goToShipping);
        waitForElement(checkBoxTermsOfService, 5);
        clickElement(checkBoxTermsOfService);
        clickElement(gotoPayment);
        waitForElement(payByBankWire, 5);
        clickElement(payByBankWire);
    }

    public void confirmMyOrder() {
        clickElement(orderConfirmation);
    }

    public void verifyPayment() {
        WebElement orderVerification = initElement(verifyPayment);
        String text = orderVerification.getText();
        Assert.assertEquals(text, "Your order on My Store is complete.");
    }

    public void backToOrders() {
        scrollToElement(goBackToOrders);
        waitForElement(goBackToOrders, 10);
        clickElement(goBackToOrders);
    }

    public void backToHomePage() {
        scrollToElement(backHome);
        clickElement(backHome);
    }
}
