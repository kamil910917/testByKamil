package PageObjects;

import AutomationFramework.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class RegistrationPage extends CommonPage {
    private By emailPath = By.xpath("//input[@id='email_create']");
    private By createAnAccountPath = By.xpath("//button[@id='SubmitCreate']");
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
    private By assignAnAdress = By.xpath("//input[@id='alias']");
    private By register = By.xpath("//button[@id='submitAccount']");
    private By logOut = By.xpath("//a[@title='Log me out']");
    private By order = By.xpath("//a[@title='Orders']");
    private By backToAccount = By.xpath("//*[@id='center_column']/ul/li[1]/a/span");
    private By myCreditSlips = By.xpath("//a[@title='Credit slips']");
    private By myAddress = By.xpath("//a[@title='Addresses']");
    private By verifyPersonalInformation = By.xpath("//*[@id='center_column']/div[1]/div/div/ul");
    private By wishList = By.xpath("//a[@title='My wishlists']");
    private By yourLogo = By.xpath("//a[@title='My Store']");
    private By updateButton = By.xpath("//a[@title='Update']/span");
    private By updateFirstname = By.xpath("//input[@id='firstname']");
    private By updateLastname = By.xpath("//input[@id='lastname']");
    private By updateAddress = By.xpath("//input[@id='address1']");
    private By updateCity = By.xpath("//input[@id='city']");
    private By updateState = By.xpath("//select[@id='id_state']");
    private By updateZipCode = By.xpath("//input[@id='postcode']");
    private By updateHomephone = By.xpath("//input[@id='phone']");
    private By updatePhone = By.xpath("//input[@id='phone_mobile']");
    private By additionalInformation = By.xpath("//textarea[@class='validate form-control']");
    private By updateAssignAddress = By.xpath("//input[@id='alias']");
    private By saveUpdate = By.xpath("//button[@id='submitAddress']");
    private By verifyAddress = By.xpath("//ul[@class='last_item item box']/li[1]");
    private By verifyFirstLastName = By.xpath("//ul[@class='last_item item box']/li[2]");
    private By verifyStreet = By.xpath("//ul[@class='last_item item box']/li[4]");
    private By verifyCityStateZipCode = By.xpath("//ul[@class='last_item item box']/li[5]");
    private By verifyCountry = By.xpath("//ul[@class='last_item item box']/li[6]");
    private By verifyHomeNumber = By.xpath("//ul[@class='last_item item box']/li[7]");
    private By verifyMobilePhone = By.xpath("//ul[@class='last_item item box']/li[8]");
    private By newWishList = By.xpath("//input[@id='name']");
    private By submitWishList = By.xpath("//button[@id='submitWishlist']");
    private By verifyWishNo1 = By.xpath("//div[@id='block-history']/table/tbody/tr[1]/td/a");
    private By verifyWishNo2 = By.xpath("//div[@id='block-history']/table/tbody/tr[2]/td/a");
    private By deleteAddress = By.xpath("//a[@title='Delete']");
    private By alertNoAddress = By.xpath("//p[@class='alert alert-warning']");
    private By backButton = By.xpath("//a[@class='btn btn-defaul button button-small']");
    private By deleteWish = By.xpath("//i[@class='icon-remove']");


    public void insertEmail() {
        highlightElement(emailPath);
        clickElement(emailPath);
        setRandomValueWithEmail(emailPath);
    }

    public void clickToCreateAnAccount() {
        highlightElement(createAnAccountPath);
        clickElement(createAnAccountPath);
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
        clickElement(assignAnAdress);
        setValue(assignAnAdress, TestData.fullAddress);
    }

    public void submitPersonalData() {
        highlightElement(register);
        clickElement(register);
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
    }

    public void verifyRegistrationProcess() {
        WebElement logOutButton = initElement(logOut);
        String text = logOutButton.getText();
        Assert.assertEquals(text, "Sign out");
    }

    public void viewOrderHistoryAndDetails() {
        highlightElement(order);
        clickElement(order);
        clickElement(backToAccount);
    }

    public void viewMyCreditSlips() {
        highlightElement(myCreditSlips);
        clickElement(myCreditSlips);
        clickElement(backToAccount);
    }

    public void viewMyAddress() {
        highlightElement(myAddress);
        clickElement(myAddress);
    }

    public void verifyMyAddress() {
        WebElement addressConfirm = initElement(verifyPersonalInformation);
        String text1 = addressConfirm.getText();
        Assert.assertEquals(text1, "TESTCITY, STREET 01\n" +
                "FirstName LastName\n" +
                "Street 01\n" +
                "TestCity, Alabama 00000\n" +
                "United States\n" +
                "111-222-3333\n" +
                "Update\n" +
                "Delete");
    }

    public void updatePersonalInformation() {
        clickElement(updateButton);
        clickElement(updateFirstname);
        setValue(updateFirstname, "test firstname");
        clickElement(updateLastname);
        setValue(updateLastname, "test lastname");
        clickElement(updateAddress);
        setValue(updateAddress, "Street 99");
        clickElement(updateCity);
        setValue(updateCity, "City");
        selectAnElement(updateState, 5);
        clickElement(updateZipCode);
        setValue(updateZipCode, "11111");
        clickElement(updateHomephone);
        setValue(updateHomephone, "1-650-513-0514");
        clickElement(updatePhone);
        setValue(updatePhone, "222-111-3333");
        clickElement(additionalInformation);
        setValue(additionalInformation, "test\n" +
                "test\n" +
                "test\n" +
                "test\n" +
                "test\n");
        clickElement(updateAssignAddress);
        setValue(updateAssignAddress, "City, Street 99");
        clickElement(saveUpdate);
    }

    public void verifyAddress() {
        WebElement address = initElement(verifyAddress);
        String text = address.getText();
        Assert.assertEquals(text, "CITY, STREET 99");
    }

    public void verifyFirstLastName() {
        WebElement firstLastName = initElement(verifyFirstLastName);
        String text = firstLastName.getText();
        Assert.assertEquals(text, "test firstname test lastname");
    }

    public void verifyStreet() {
        WebElement street = initElement(verifyStreet);
        String text = street.getText();
        Assert.assertEquals(text, "Street 99");
    }

    public void verifyCityStateZipCode() {
        WebElement cityStateZipCode = initElement(verifyCityStateZipCode);
        String text = cityStateZipCode.getText();
        Assert.assertEquals(text, "City, California 11111");
    }

    public void verifyCountry() {
        WebElement country = initElement(verifyCountry);
        String text = country.getText();
        Assert.assertEquals(text, "United States");
    }

    public void verifyHomeNumber() {
        WebElement homeNumber = initElement(verifyHomeNumber);
        String text = homeNumber.getText();
        Assert.assertEquals(text, "1-650-513-0514");
    }

    public void verifyMobilePhone() {
        WebElement mobilePhone = initElement(verifyMobilePhone);
        String text = mobilePhone.getText();
        Assert.assertEquals(text, "222-111-3333");
    }

    public void verifyPersonalInformationUpdate() {
        verifyAddress();
        verifyFirstLastName();
        verifyStreet();
        verifyCityStateZipCode();
        verifyCountry();
        verifyHomeNumber();
        verifyMobilePhone();
    }

    public void deleteAddress() {
        clickElement(deleteAddress);
        acceptAlert();

    }

    public void verifyDelete() {
        WebElement delete = initElement(alertNoAddress);
        String text = delete.getText();
        Assert.assertEquals(text, "No addresses are available. Add a new address");
    }

    public void backToAccount() {
        clickElement(backButton);
    }

    public void viewWishLists() {
        clickElement(wishList);
    }

    public void insertNewWish() {
        clickElement(newWishList);
        setValue(newWishList, "wish no. 1");
        clickElement(submitWishList);
    }

    public void insertSecondWish() {
        clickElement(newWishList);
        setValue(newWishList, "wish no. 2");
        clickElement(submitWishList);
    }

    public void saveNewWishList() {
        insertNewWish();
        insertSecondWish();
    }

    public void verifyWish1() {
        WebElement wish = initElement(verifyWishNo1);
        String text = wish.getText();
        Assert.assertEquals(text, "wish no. 1");
    }

    public void verifyWish2() {
        WebElement wish = initElement(verifyWishNo2);
        String text = wish.getText();
        Assert.assertEquals(text, "wish no. 2");

    }

    public void verifyWishList() {
        verifyWish1();
        verifyWish2();
    }

    public void deleteWishFromList() {
        clickElement(deleteWish);
        acceptAlert();
        clickElement(deleteWish);
        acceptAlert();
    }

    public void backToMyStore() {
        highlightElement(yourLogo);
        clickElement(yourLogo);
    }
}
