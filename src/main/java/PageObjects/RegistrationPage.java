package PageObjects;

import AutomationFramework.TestData;
import Driver.DriverInit;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationPage extends CommonPage {

    private By wishList = By.xpath("//a[@title='My wishlists']");
    private By yourLogo = By.xpath("//a[@title='My Store']");
    private By updateButton = By.xpath("//a[@title='Update']/span");
    private By updateFirstname = By.xpath("//input[@id='firstname']");
    private By updateLastname = By.xpath("//input[@id='lastname']");
    private By updateAddress = By.xpath("//input[@id='address1']");
    private By updateCity = By.xpath("//input[@id='city']");
    private By updateState = By.xpath("//select[@id='id_state']");
    private By updateZipCode = By.xpath("//input[@id='postcode']");
    private By updatePhone = By.xpath("//input[@id='phone_mobile']");
    private By additionalInformation = By.xpath("//textarea[@class='validate form-control']");
    private By updateAssignAddress = By.xpath("//input[@id='alias']");
    private By saveUpdate = By.xpath("//button[@id='submitAddress']");
    private By verifyAddress = By.xpath("//ul[@class='last_item item box']/li[1]");
    private By verifyStreet = By.xpath("//ul[@class='last_item item box']/li[4]");
    private By verifyMobilePhone = By.xpath("//ul[@class='last_item item box']/li[8]");
    private By newWishList = By.xpath("//input[@id='name']");
    private By submitWishList = By.xpath("//button[@id='submitWishlist']");
    private By verifyWishNo1 = By.xpath("//div[@id='block-history']/table/tbody/tr[1]/td/a");
    private By verifyWishNo2 = By.xpath("//div[@id='block-history']/table/tbody/tr[2]/td/a");
    private By deleteAddress = By.xpath("//a[@title='Delete']");
    private By alertNoAvailableAddress = By.xpath("//p[@class='alert alert-warning']");
    private By backButton = By.xpath("//a[@class='btn btn-defaul button button-small']");
    private By deleteWish = By.xpath("//i[@class='icon-remove']");
    private By firstNameUpdate = By.xpath("//ul[@class='last_item item box']/li[2]/span[1]");
    private By lastNameUpdate = By.xpath("//ul[@class='last_item item box']/li[2]/span[2]");
    private By submitAccount = By.xpath("//button[@id='submitAccount']");
    private By myAddresses = By.xpath("//a[@title='Addresses']");
    public static By orderHistory = By.xpath("//h1[text()='Order history']");
    public static By creditSlips = By.xpath("//h1[contains(text(),'Credit slips')]");
    public static By myAddress = By.xpath("//h1[contains(text(),'My addresses')]");
    public static By yourPersonalInformation = By.xpath("//h1[contains(text(),'Your personal information')]");
    public static By myWishLists = By.xpath("//h1[contains(text(),'My wishlists')]");

    public void insertEmailToCreateAnAccount() {
        insertRandomEmailAndAcceptAccountCreate();
    }

    public void authenticationAndSignIn() {
        signIn();
        clickElement(submitAccount);
    }

    public void verifyRegistrationProcess() {
        Assert.assertEquals(DriverInit.getInstance().findElement(By.xpath("//*[contains(text(),'Welcome to your account.')]")).getText(), "Welcome to your account. Here you can manage all of your personal information and orders.");
    }

    public void verifyDisplayOfAccountBookmarks(String referenceName, By locator) {
        clickElement(By.xpath("//a[@title='" + referenceName + "']"));
        Assert.assertTrue(DriverInit.getInstance().findElement(locator).isDisplayed());
        backCommand();
    }

    public void addressUpdate() {
        clickElement(myAddresses);
        clickElement(updateButton);
        setValue(updateFirstname, TestData.firstNameUpdate);
        setValue(updateLastname, TestData.lastNameUpdate);
        setValue(updateAddress, TestData.streetUpdate);
        setValue(updateCity, TestData.cityUpdate);
        selectPicklistValue(updateState, 6);
        setValue(updateZipCode, TestData.postalCodeUpdate);
        setValue(updatePhone, TestData.mobilePhoneUpdate);
        setValue(additionalInformation, "test");
        setValue(updateAssignAddress, TestData.fullAddressUpdate);
        clickElement(saveUpdate);
    }

    public void verifySuccessfullyAddressUpdate() {
        Assert.assertEquals(DriverInit.getInstance().findElement(firstNameUpdate).getText(), TestData.firstNameUpdate);
        Assert.assertEquals(DriverInit.getInstance().findElement(lastNameUpdate).getText(), TestData.lastNameUpdate);
        Assert.assertEquals(DriverInit.getInstance().findElement(verifyStreet).getText(), TestData.streetUpdate);
        Assert.assertEquals(DriverInit.getInstance().findElement(verifyMobilePhone).getText(), TestData.mobilePhoneUpdate);
        Assert.assertEquals(DriverInit.getInstance().findElement(verifyAddress).getText(), TestData.fullAddressUpdate);
    }

    public void clickDeleteAddress() {
        clickElement(deleteAddress);
        acceptAlert();
    }

    public void verifySuccessfullyDeleteAddress() {
        Assert.assertEquals(DriverInit.getInstance().findElement(alertNoAvailableAddress).getText(), "No addresses are available. Add a new address");
    }

    public void backToAccount() {
        clickElement(backButton);
    }

    public void viewWishLists() {
        clickElement(wishList);
    }

    public void insertWish() {
        setValue(newWishList, "test 1");
        clickElement(submitWishList);
    }

    public void insertWish2() {
        setValue(newWishList, "test 2");
        clickElement(submitWishList);
    }

    public void verifyWish() {
        Assert.assertEquals(DriverInit.getInstance().findElement(verifyWishNo1).getText(), "test 1");
        Assert.assertEquals(DriverInit.getInstance().findElement(verifyWishNo2).getText(), "test 2");
    }

    public void deleteWishFromList() {
        clickElement(deleteWish);
        acceptAlert();
        clickElement(deleteWish);
        acceptAlert();
    }

    public void backToMyStore() {
        clickElement(yourLogo);
    }
}