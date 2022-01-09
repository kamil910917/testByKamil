package PageObjects;

import Driver.DriverInit;
import org.openqa.selenium.By;
import org.testng.Assert;

public class PageFooter extends CommonPage {

    private By newsletterBox = By.xpath("//input[@id='newsletter-input']");
    private By submitNewsletter = By.xpath("//button[@name='submitNewsletter']");
    private By newsletterAlert = By.xpath("//div[@id='columns']/p");
    private By facebookReference = By.xpath("//*[@id='social_block']/ul/li/a");
    private By allowsCookiesYouTube = By.xpath("//span[text()='Zgadzam się']");
    private By youtubeSearch = By.xpath("//input[@id='search']");
    private By youtubeSearchButton = By.xpath("//button[@id='search-icon-legacy']");
    private By womenCategoriesReference = By.xpath("//div[@class='category_footer toggle-footer']//a[contains(text(),'Women')]");
    private By womenFrame = By.xpath("//span[@class='cat-name']");
    public static By specialsDisplay = By.xpath("//h1[text()='Price drop']");
    public static By newProductsDisplay = By.xpath("//h1[text()='New products']");
    public static By bestSellersDisplay = By.xpath("//h1[text()='Best sellers']");
    public static By ourStoresDisplay = By.xpath("//h1[contains(text(),'Our store(s)')]");
    public static By contactUsDisplay = By.xpath("//h1[contains(text(),'Customer service')]");
    public static By termsAndConditionsOfUseDisplay = By.xpath("//h1[contains(text(),'Terms and conditions')]");
    public static By aboutUsDisplay = By.xpath("//h1[contains(text(),'About us')]");
    public static By siteMapDisplay = By.xpath("//h1[contains(text(),'Sitemap')]");
    public static By myAccountReferencesForNotLoggedUsers = By.xpath("//h1[contains(text(),'Authentication')]");

    public void newsletter() {
        scrollToElement(newsletterBox);
        setRandomValueWithEmail(newsletterBox);
        clickElement(submitNewsletter);
    }

    public void verifySuccessfullySubscribedToNewsletter() {
        Assert.assertEquals(DriverInit.getInstance().findElement(newsletterAlert).getText(), "Newsletter : You have successfully subscribed to this newsletter.");
    }

    public void clickReference(String referenceName) {
        clickElement(By.xpath("//*[@id='social_block']/ul/li[@class='" + referenceName + "']"));
    }

    public void verifyURL(String url) {
        System.out.println("Current URL: " + DriverInit.getInstance().getCurrentUrl());
        Assert.assertTrue(DriverInit.getInstance().getCurrentUrl().contains(url));
    }

    public void checkYoutubeSearch() {
        clickElement(allowsCookiesYouTube);
        clickElement(youtubeSearch);
        setValue(youtubeSearch, "Selenium Webdriver");
        clickElement(youtubeSearchButton);
    }

    public void scrollToStopper() {
        scrollToElement(facebookReference);
        waitForElement(facebookReference, 3);
    }

    public void verifyReference(String referenceName, By element) {
        clickElement(By.xpath("//a[@title='" + referenceName + "']"));
        Assert.assertTrue(DriverInit.getInstance().findElement(element).isDisplayed());
        backCommand();
    }

    public void verifyPageFooterCategoriesReference() {
        clickElement(womenCategoriesReference);
        Assert.assertTrue(DriverInit.getInstance().findElement(womenFrame).isDisplayed());
        backCommand();
    }
}