package PageObjects;

import Driver.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.util.TimeUtils;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeoutException;


public class PageStopper extends CommonPage {
    private By newsLetterPath = By.xpath("//input[@id='newsletter-input']");
    private By submitButton = By.xpath("//button[@name='submitNewsletter']");
    private By newsletterAlert = By.xpath("//div[@id='columns']/p");
    private By facebookReference = By.xpath("//*[@id='social_block']/ul/li/a");
    private By allowsCookiesYouTube = By.xpath("//span[text()='Zgadzam się']");
    private By youtubeSearch = By.xpath("//input[@id='search']");
    private By youtubeSearchButton = By.xpath("//button[@id='search-icon-legacy']");

    public void checkNewsLetter() {
        scrollToElement(newsLetterPath);
        waitForElement(newsLetterPath, 20);
        clickElement(newsLetterPath);
        initElement(newsLetterPath).clear();
        setRandomValueWithEmail(newsLetterPath);
        clickElement(submitButton);
        waitForElement(submitButton, 20);
    }

    public void verifySuccessfullySubscribedToNewsletter() {
        WebElement newsletter = initElement(newsletterAlert);
        String text = newsletter.getText();
        Assert.assertEquals(text, "Newsletter : You have successfully subscribed to this newsletter.");
    }

    public void clickReference(String referenceName) {
        clickElement(By.xpath("//*[@id='social_block']/ul/li[@class='" + referenceName + "']"));
    }

    public void verifyURL(String url) {
        System.out.println("URL obecnej strony to: " + DriverInit.getInstance().getCurrentUrl());
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
}