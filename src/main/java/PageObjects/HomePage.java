package PageObjects;

import Driver.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
    private By printedDress = By.xpath("//img[@alt='Printed Dress']");
    private By printedDressSecond = By.xpath("//img[@src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']");
    private By printedSummerDress = By.xpath("//img[@src='http://automationpractice.com/img/p/1/2/12-home_default.jpg']");
    private By printedSummerDressSecond = By.xpath("//img[@src='http://automationpractice.com/img/p/1/6/16-home_default.jpg']");
    private By printedChiffonDress = By.xpath("//img[@src='http://automationpractice.com/img/p/2/0/20-home_default.jpg']");
    private By printedChiffonDressClick = By.xpath("//img[@src='http://automationpractice.com/img/p/2/0/20-home_default.jpg']");
    private By firstPhoto = By.xpath("//div[@id='views_block']/div/ul/li");
    private By secondPhoto = By.xpath("//div[@id='views_block']/div/ul/li[2]");
    private By thirdPhoto = By.xpath("//div[@id='views_block']/div/ul/li[3]");
    private By fourthPhoto = By.xpath("//div[@id='views_block']/div/ul/li[4]");
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
    private By verifySending = By.xpath("//div[@class='fancybox-skin']/div/div/p");
    private By confirmSending = By.xpath("//p[@class='submit']/input");
    private By inputQuantity = By.xpath("//input[@id='quantity_wanted']");
    private By quantityMinus = By.xpath("//a[@class='btn btn-default button-minus product_quantity_down']");
    private By quantityPlus = By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']");
    private By selectSize = By.xpath("//div[@class='selector']");
    private By dressSize = By.xpath("//select[@id='group_1']");
    private By yellowDress = By.xpath("//a[@title='Yellow']");
    private By greenDress = By.xpath("//a[@title='Green']");
    private By wishList = By.xpath("//a[@id='wishlist_button']");
    private By closeAlert = By.xpath("//a[@title='Close']");
    private By addProductButton = By.xpath("//p[@id='add_to_cart']/button/span");
    private By closeWindow = By.xpath("//span[@title='Close window']");
    private By shopCart = By.xpath("//a[@title='View my shopping cart']");
    private By removeLink = By.xpath("//a[@class='ajax_cart_block_remove_link']");
    private By backToMyStore = By.xpath("//a[@title='My Store']");
    private By bestSellersPhrase = By.xpath("//a[@class='blockbestsellers']");
    private By popularPhrase = By.xpath("//a[@class='homefeatured']");
    private By bestSellersNo1 = By.xpath("//ul[@id='blockbestsellers']/li[1]");
    private By bestSellersNo2 = By.xpath("//ul[@id='blockbestsellers']/li[2]");
    private By bestSellersNo3 = By.xpath("//ul[@id='blockbestsellers']/li[3]");
    private By bestSellersNo4 = By.xpath("//ul[@id='blockbestsellers']/li[4]");
    private By bestSellersNo5 = By.xpath("//ul[@id='blockbestsellers']/li[5]");
    private By bestSellersNo6 = By.xpath("//ul[@id='blockbestsellers']/li[6]");
    private By bestSellersNo7 = By.xpath("//ul[@id='blockbestsellers']/li[7]");
    private By customerServiceContact = By.xpath("//div[@id='contact-link']");

    public void searchPhrase(String phrase) {
        highlightElement(searchBox);
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
        clickElement(advertisementOnMyStore);
        clickElement(advertisementOnMyStore);
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
        hoverAnElement(bestSellersNo1);
        hoverAnElement(bestSellersNo2);
        hoverAnElement(bestSellersNo3);
        hoverAnElement(bestSellersNo4);
        hoverAnElement(bestSellersNo5);
        hoverAnElement(bestSellersNo6);
        hoverAnElement(bestSellersNo7);
        clickElement(popularPhrase);

    }

    public void displayTshirts() {
        clickUsingJS(printedChiffonDressClick);
        hoverAnElement(firstPhoto);
        hoverAnElement(secondPhoto);
        hoverAnElement(thirdPhoto);
        hoverAnElement(fourthPhoto);
        hoverAnElement(firstPhoto);
    }

    public void ViewLargerPrintedChiffonDress() {
        clickElement(printedChiffonDressViewLarger);
    }

    public void clickNextDress() {
        clickElement(clickNext);
        clickElement(clickNext);
        clickElement(clickNext);
    }

    public void clickPreviousDress() {
        clickElement(clickBack);
        clickElement(clickBack);
        clickElement(clickBack);
        clickElement(closeTab);
    }

    public void checkRestFunctions() {
        hoverAnElement(tweetLogo);
        hoverAnElement(facebookLogo);
        hoverAnElement(googleLogo);
        hoverAnElement(pinterestLogo);
        hoverAnElement(sendToAFriendLogo);
        hoverAnElement(printLogo);
        clickElement(sendToAFriendLogo);
        checkSendingToAFriend();
        waitForElement(nameOfFriend, 3);
        setValue(nameOfFriend, "testName");
        setRandomValueWithEmail(friendEmail);
        clickElement(sendToFriend);
        verifySendingToFriend();
        clickElement(confirmSending);
        hoverAnElement(quantityMinus);
        hoverAnElement(quantityPlus);
        clickElement(inputQuantity);
        setValue(inputQuantity, "10000");
        clickElement(quantityPlus);
        clickElement(quantityMinus);
        clickElement(selectSize);
        selectAnElement(dressSize, 1);
        selectAnElement(dressSize, 2);
        highlightElement(yellowDress);
        clickElement(yellowDress);
        highlightElement(greenDress);
        clickElement(greenDress);
        clickElement(wishList);
        clickUsingJS(closeAlert);
        clickElement(addProductButton);
        clickElement(closeWindow);
        hoverAnElement(shopCart);
        clickElement(removeLink);
        clickElement(backToMyStore);
    }

    public void checkSendingToAFriend() {
        WebElement sendDressToFriend = initElement(verifySendToAFriendLogo);
        String text = sendDressToFriend.getText();
        Assert.assertEquals(text, "SEND TO A FRIEND");
    }

    public void verifySendingToFriend() {
        WebElement sendAlert = initElement(verifySending);
        String text = sendAlert.getText();
        Assert.assertEquals(text, "Your e-mail has been sent successfully");
    }

    public void contactWithCustomerService() {
        clickElement(customerServiceContact);
    }

}