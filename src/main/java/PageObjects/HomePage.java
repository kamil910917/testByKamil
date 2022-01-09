package PageObjects;

import AutomationFramework.TestData;
import Driver.DriverInit;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends CommonPage {

    private By signInButtonPath = By.xpath("//a[@title='Log in to your customer account']");
    private By searchBox = By.xpath("//input[@id='search_query_top']");
    private By submitButton = By.xpath("//button[@type='submit']");
    private By womenPhrase = By.xpath("//a[@title='Women']");
    private By dressPhrase = By.xpath("//div[@id='block_top_menu']/ul/li[2]");
    private By advertisementOnMyStore = By.xpath("//a[@class='bx-next']");
    private By fadedShortSleeve = By.xpath("//img[@alt='Faded Short Sleeve T-shirts']");
    private By blouse = By.xpath("//img[@alt='Blouse']");
    private By printedDress = By.xpath("//ul[@id='homefeatured']//li[3]//a[@title='Printed Dress']//img");
    private By printedDressSecond = By.xpath("//ul[@id='homefeatured']//li[4]//a[@title='Printed Dress']//img");
    private By printedSummerDress = By.xpath("//ul[@id='homefeatured']//li[5]//a[@title='Printed Summer Dress']//img");
    private By printedSummerDressSecond = By.xpath("//ul[@id='homefeatured']//li[6]//a[@title='Printed Summer Dress']//img");
    private By printedChiffonDress = By.xpath("//ul[@id='homefeatured']//li[7]//a[@title='Printed Chiffon Dress']//img");
    private By printedChiffonDressViewLarger = By.xpath("//img[@id='bigpic']");
    private By clickNext = By.xpath("//a[@title='Next']");
    private By clickBack = By.xpath("//a[@title='Previous']");
    private By closeTab = By.xpath("//a[@title='Close']");
    private By tweetLogo = By.xpath("//p[@class='socialsharing_product list-inline no-print']/button[1]");
    private By facebookLogo = By.xpath("//p[@class='socialsharing_product list-inline no-print']/button[2]");
    private By googleLogo = By.xpath("//p[@class='socialsharing_product list-inline no-print']/button[3]");
    private By pinterestLogo = By.xpath("//p[@class='socialsharing_product list-inline no-print']/button[4]");
    private By sendToAFriendLogo = By.xpath("//a[@id='send_friend_button']");
    private By printLogo = By.xpath("//li[@class='print']");
    private By verifySendToAFriendLogo = By.xpath("//*[@id='send_friend_form']/h2");
    private By nameOfFriend = By.xpath("//input[@id='friend_name']");
    private By friendEmail = By.xpath("//input[@id='friend_email']");
    private By sendToFriend = By.xpath("//button[@id='sendEmail']");
    private By verifySending = By.xpath("//p[text()='Your e-mail has been sent successfully']");
    private By clickOk = By.xpath("//input[@type='button']");
    private By inputQuantity = By.xpath("//input[@id='quantity_wanted']");
    private By dressSize = By.xpath("//select[@id='group_1']");
    private By yellowDress = By.xpath("//a[@title='Yellow']");
    private By greenDress = By.xpath("//a[@title='Green']");
    private By addProductButton = By.xpath("//p[@id='add_to_cart']/button/span");
    private By closeWindow = By.xpath("//span[@title='Close window']");
    private By shopCart = By.xpath("//a[@title='View my shopping cart']");
    private By removeLink = By.xpath("//a[@class='ajax_cart_block_remove_link']");
    private By backToMyStore = By.xpath("//a[@title='My Store']");
    private By bestSellersPhrase = By.xpath("//a[@class='blockbestsellers']");
    private By popularPhrase = By.xpath("//a[@class='homefeatured']");
    private By customerServiceContact = By.xpath("//div[@id='contact-link']");

    public void searchPhrase(String phrase) {
        clickElement(searchBox);
        setValue(searchBox, phrase);
        clickElement(submitButton);
    }

    public void clickSignInButton() {
        highlightElement(signInButtonPath);
        clickElement(signInButtonPath);
    }

    public void hoverTheWomenPhrase() {
        hoverAnElement(womenPhrase);
    }

    public void hoverTheDressPhrase() {
        hoverAnElement(dressPhrase);
    }

    public void checkAdvertisement() {
        doubleClick(advertisementOnMyStore);
    }

    public void hoverPopularCollection() {
        scrollToElement(fadedShortSleeve);
        hoverAnElement(fadedShortSleeve);
        hoverAnElement(blouse);
        hoverAnElement(printedDress);
        hoverAnElement(printedDressSecond);
        hoverAnElement(printedSummerDress);
        hoverAnElement(printedSummerDressSecond);
        hoverAnElement(printedChiffonDress);
    }

    public void hoverBestSellers() {
        clickElement(bestSellersPhrase);
        for(int i = 1; i<=7; i++) {
            hoverAnElement(By.xpath("//ul[@id='blockbestsellers']/li[" + i + "]"));
        }
        clickElement(popularPhrase);
    }

    public void clickPrintedChiffonDress() {
        clickUsingJS(printedChiffonDress);
    }

    public void ViewLargerPrintedChiffonDress() {
        clickElement(printedChiffonDressViewLarger);
    }

    public void clickNextDress() {
        doubleClick(clickNext);
        clickElement(clickNext);
    }

    public void clickPreviousDress() {
        doubleClick(clickBack);
        clickElement(clickBack);
        clickElement(closeTab);
    }

    public void hoverSocialIcons() {
        hoverAnElement(tweetLogo);
        hoverAnElement(facebookLogo);
        hoverAnElement(googleLogo);
        hoverAnElement(pinterestLogo);
        hoverAnElement(sendToAFriendLogo);
        hoverAnElement(printLogo);
    }

    public void clickAndVerifySendToAFriend() {
        clickElement(sendToAFriendLogo);
        Assert.assertEquals(DriverInit.getInstance().findElement(verifySendToAFriendLogo).getText(), "SEND TO A FRIEND");
    }

    public void typeRecipient() {
        waitForElement(nameOfFriend, 3);
        setValue(nameOfFriend, TestData.firstName);
        setRandomValueWithEmail(friendEmail);
        clickElement(sendToFriend);
    }

    public void verifySending() {
        Assert.assertEquals(DriverInit.getInstance().findElement(verifySending).getText(), "Your e-mail has been sent successfully");
        clickElement(clickOk);
    }

    public void putValuesIntoBoxProduct(String value) {
        setValue(inputQuantity, value);
    }

    public void setDressSizeAndColor() {
        selectPicklistValue(dressSize, 1);
        selectPicklistValue(dressSize, 2);
        highlightElement(yellowDress);
        clickElement(yellowDress);
        highlightElement(greenDress);
        clickElement(greenDress);
    }

    public void addProductToShoppingCart() {
        clickElement(addProductButton);
        clickElement(closeWindow);
    }

    public void removeProductFromShoppingCart() {
        hoverAnElement(shopCart);
        clickElement(removeLink);
    }

    public void goBackToBaseWindow() {
        clickElement(backToMyStore);
    }

    public void contactWithCustomerService() {
        clickElement(customerServiceContact);
    }
}