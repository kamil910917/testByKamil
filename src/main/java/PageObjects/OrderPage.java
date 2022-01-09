package PageObjects;

import Driver.DriverInit;
import org.openqa.selenium.By;
import org.testng.Assert;


public class OrderPage extends CommonPage {

    private By printedSummerDress = By.xpath("//img[@title='Printed Summer Dress']");
    private By printedSummerDressSize = By.xpath("//select[@id='group_1']");
    private By printedSummerDressColor = By.xpath("//a[@id='color_14']");
    private By printedSummerDressAddToCart = By.xpath("//*[@id='add_to_cart']/button/span");
    private By proceedToCheckout = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");
    private By proceedNext = By.xpath("//*[@id='center_column']/p[2]/a[1]/span");
    private By processAddress = By.xpath("//button[@name='processAddress']");
    private By termsOfServiceCheckBox = By.xpath("//div[@class='checker']/span");
    private By orderConfirmation = By.xpath("//*[contains(text(),'I confirm my order')]");
    private By orderComment = By.xpath("//textarea[@class='form-control']");
    private By termsOfServiceReadBook = By.xpath("//a[text()='(Read the Terms of Service)']");
    private By closeTermsOfServiceReadBook = By.xpath("//a[@title='Close']");
    private By submitShipping = By.xpath("//button[@name='processCarrier']");
    private By paymentByBankWire = By.xpath("//a[@title='Pay by bank wire']");
    private By paymentByCheck = By.xpath("//a[@title='Pay by check.']");
    private By backToOrders = By.xpath("//a[@title='Back to orders']");
    private By reorderButton = By.xpath("//a[@title='Reorder']");
    private By MessageBox = By.xpath("//*[text()='Add a message']");
    private By selectProduct = By.xpath("//select[@name='id_product']");
    private By addAMessage = By.xpath("//textarea[@name='msgText']");
    private By sendAMessageClick = By.xpath("//button[@name='submitMessage']");
    private By backMyStore = By.xpath("//ul[@class='footer_links clearfix']/li[2]");
    private By registerButton = By.xpath("//button[@id='submitAccount']");
    private By orderReference = By.xpath("//tr[@class='first_item ']/td");
    private By checkAccountCreate = By.xpath("//li[@class='step_current third']");
    private By verifyAddressDisplay = By.xpath("//li[@class='step_current four']");
    private By verifyPaymentDisplay = By.xpath("//li[@id='step_end']");
    private By verifyPaymentSummary = By.xpath("//h3[@class='page-subheading']");
    private By verifyOrderHasBeenComplete = By.xpath("//*[contains(text(),'Your order on My Store is complete.')]");
    private By placedOrders = By.xpath("//div/h1[text()='Order history']");
    private By verifyReorderOption = By.xpath("//h1[@id='cart_title']");
    private By verifyMessageSent = By.xpath("//p[@class='alert alert-success']");

    public void verifySearchingBox(String phrase) {
        Assert.assertEquals(DriverInit.getInstance().findElement(By.xpath("//span[contains(text(),'" + phrase + "')]")).getText().toLowerCase(), "\"" + phrase + "\"");
    }

    public void addProductToCart() {
        clickElement(printedSummerDress);
        selectPicklistValue(printedSummerDressSize, 1);
        clickElement(printedSummerDressColor);
        waitForElement(printedSummerDressAddToCart, 30);
        clickElement(printedSummerDressAddToCart);
        waitForElement(proceedToCheckout, 10);
        clickElement(proceedToCheckout);
    }

    public void shoppingSummary() {
        clickElement(proceedNext);
    }

    public void insertAnEmailAddressToCreateAnAccount() {
        insertRandomEmailAndAcceptAccountCreate();
    }

    public void createAnAccount() {
        signIn();
        clickElement(registerButton);
    }

    public void verifyAccountCreate() {
        Assert.assertTrue(DriverInit.getInstance().findElement(checkAccountCreate).isDisplayed());
    }

    public void confirmDeliveryAddress() {
        setValue(orderComment, "test");
        clickElement(processAddress);
    }

    public void verifyAddress() {
        Assert.assertTrue(DriverInit.getInstance().findElement(verifyAddressDisplay).isDisplayed());
    }

    public void clickTermsOfService() {
        clickElement(termsOfServiceReadBook);
        clickElement(closeTermsOfServiceReadBook);
    }

    public void termsOfServiceAgreeAndShippingApprove() {
        scrollToElement(termsOfServiceCheckBox);
        clickElement(termsOfServiceCheckBox);
        clickElement(submitShipping);
    }

    public void verifyPaymentIsDisplayed() {
        Assert.assertTrue(DriverInit.getInstance().findElement(verifyPaymentDisplay).isDisplayed());
    }

    public void bankWirePayment() {
        clickElement(paymentByBankWire);
    }

    public void checkPayment() {
        clickElement(paymentByCheck);
    }

    public void choosePaymentMethod() {
        bankWirePayment();
        backCommand();
        checkPayment();
        backCommand();
        bankWirePayment();
    }

    public void verifyPaymentSummary() {
        Assert.assertTrue(DriverInit.getInstance().findElement(verifyPaymentSummary).isDisplayed());
    }

    public void confirmPayment() {
        clickElement(orderConfirmation);
    }

    public void verifyOrderConfirmation() {
        Assert.assertEquals(DriverInit.getInstance().findElement(verifyOrderHasBeenComplete).getText(), "Your order on My Store is complete.");
    }

    public void verifyDisplayOfPlacedOrder() {
        clickElement(backToOrders);
        Assert.assertTrue(DriverInit.getInstance().findElement(placedOrders).isDisplayed());
    }

    public void orderHistorySection() {
        verifyReorder();
        clickElement(orderReference);
        scrollToElement(MessageBox);
        selectPicklistValue(selectProduct, 1);
        setValue(addAMessage, "test text");
        clickElement(sendAMessageClick);
        verifyMessageSent();
    }

    public void verifyReorder() {
        clickElement(reorderButton);
        Assert.assertTrue(DriverInit.getInstance().findElement(verifyReorderOption).isDisplayed());
        backCommand();
    }

    public void verifyMessageSent() {
        Assert.assertEquals(DriverInit.getInstance().findElement(verifyMessageSent).getText(), "Message successfully sent");
    }

    public void goToBaseWindow() {
        clickElement(backMyStore);
    }
}