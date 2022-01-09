package PageObjects;

import Driver.DriverInit;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ContactPage extends CommonPage {

    private By subjectHeading = By.xpath("//select[@id='id_contact']");
    private By email = By.xpath("//input[@id='email']");
    private By orderReference = By.xpath("//input[@id='id_order']");
    private By message = By.xpath("//textarea[@id='message']");
    private By submitButton = By.xpath("//button[@id='submitMessage']");
    private By alertSuccess = By.xpath("//p[@class='alert alert-success']");
    private By backButton = By.xpath("//i[@class='icon-chevron-left']");

    public void selectASubjectHeading() {
        selectPicklistValue(subjectHeading, 1);
    }

    public void insertEmail() {
        setRandomValueWithEmail(email);
    }

    public void insertOrderReference() {
        setRandomValue(orderReference);
    }

    public void exampleMessage() {
        setValue(message, "test");
    }

    public void submitMessage() {
        clickElement(submitButton);
    }

    public void verifyAMessageHasBeenSent() {
        Assert.assertEquals(DriverInit.getInstance().findElement(alertSuccess).getText(), "Your message has been successfully sent to our team.");
    }

    public void backToHomePage() {
        clickUsingJS(backButton);
    }
}