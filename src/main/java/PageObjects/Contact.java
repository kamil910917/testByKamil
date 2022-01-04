package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Contact extends CommonPage {

    private By subjectHeading = By.xpath("//select[@id='id_contact']");
    private By email = By.xpath("//input[@id='email']");
    private By orderReference = By.xpath("//input[@id='id_order']");
    private By message = By.xpath("//textarea[@id='message']");
    private By submitButton = By.xpath("//button[@id='submitMessage']");
    private By alertSuccess = By.xpath("//p[@class='alert alert-success']");
    private By backButton = By.xpath("//i[@class='icon-chevron-left']");


    public void selectASubjectHeading() {
        selectAnElement(subjectHeading, 1);
    }

    public void insertEmail() {
        setRandomValueWithEmail(email);
    }

    public void insertOrderReference() {
        setRandomValue(orderReference);
    }

    public void exampleMessage() {
        setValue(message, "test!@#$%^&*(())" +
                "31234513123123\n" +
                "qwertyuiopplkjhgfdsazxcvbnm"
        );
    }

    public void submitMessage() {
        clickElement(submitButton);
    }

    public void verifyAMessageHasBeenSent() {
        WebElement message = initElement(alertSuccess);
        String text = message.getText();
        Assert.assertEquals(text, "Your message has been successfully sent to our team.");
    }

    public void backToHomePage() {
        clickUsingJS(backButton);
    }
}
