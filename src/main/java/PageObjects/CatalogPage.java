package PageObjects;

import Driver.DriverInit;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CatalogPage extends CommonPage {

    private By womenSection = By.xpath("//a[@title='Women']");
    private By womenTops = By.xpath("//ul[@class='tree dynamized']/li[1]/span");
    private By womenDresses = By.xpath("//ul[@class='tree dynamized']/li[2]/span");
    private By topsCheckBox = By.xpath("//input[@id='layered_category_4']");
    private By dressesCheckBox = By.xpath("//div[@id='uniform-layered_category_8']");
    private By sizeSCheckBox = By.xpath("//input[@id='layered_id_attribute_group_1']");
    private By sizeMCheckBox = By.xpath("//input[@id='layered_id_attribute_group_2']");
    private By sizeLCheckBox = By.xpath("//input[@id='layered_id_attribute_group_3']");
    private By cottonComposite = By.xpath("//input[@id='layered_id_feature_5']");
    private By polyesterComposite = By.xpath("//input[@id='layered_id_feature_1']");
    private By viscoseComposite = By.xpath("//input[@id='layered_id_feature_3']");
    private By casualStyle = By.xpath("//input[@id='layered_id_feature_11']");
    private By dressyStyle = By.xpath("//input[@id='layered_id_feature_16']");
    private By girlyStyle = By.xpath("//input[@id='layered_id_feature_13']");
    private By colorfulDress = By.xpath("//input[@id='layered_id_feature_18']");
    private By maxiDress = By.xpath("//input[@id='layered_id_feature_21']");
    private By midiDress = By.xpath("//input[@id='layered_id_feature_20']");
    private By shortDress = By.xpath("//input[@id='layered_id_feature_19']");
    private By shortSleeve = By.xpath("//input[@id='layered_id_feature_17']");
    private By inStock = By.xpath("//input[@id='layered_quantity_1']");
    private By manufacturer = By.xpath("//input[@id='layered_manufacturer_1']");
    private By condition = By.xpath("//input[@id='layered_condition_new']");
    private By deliveryInformation = By.xpath("//a[@title='Delivery']");
    private By legalNotice = By.xpath("//a[@title='Legal Notice']");
    private By termsAndConditionsOfUse = By.xpath("//a[@title='Terms and conditions of use']");
    private By aboutUs = By.xpath("//a[@title='About us']");
    private By securePayment = By.xpath("//a[@title='Secure payment']");
    private By ourStores = By.xpath("//a[@title='Our stores']");
    private By menuWithSpecials = By.xpath("//a[@title='Specials']");
    private By printedChiffonDress = By.xpath("//img[@title='Printed Chiffon Dress']");
    private By printedSummerDress = By.xpath("//img[@title='Printed Summer Dress']");
    private By priceDrop = By.xpath("//select[@id='selectProductSort']");
    private By productCompare = By.xpath("//h1[@class='page-heading']");
    private By backHomePage = By.xpath("//*[text()='Continue Shopping']");
    private By compareProducts = By.xpath("//div[@class='top-pagination-content clearfix']//*[text()='Compare (']");

    public void goInWomenSection() {
        highlightElement(womenSection);
        hoverAnElement(womenSection);
        clickElement(womenSection);
    }

    public void markDropDownSectionTops() {
        doubleClick(womenTops);
    }

    public void markDropDownSectionDresses() {
        doubleClick(womenDresses);
    }

    public void markCategories() {
        scrollToElement(topsCheckBox);
        highlightElement(topsCheckBox);
        clickUsingJS(topsCheckBox);
        highlightElement(dressesCheckBox);
        clickElement(dressesCheckBox);
    }

    public void markSizes() {
        highlightElement(sizeSCheckBox);
        clickUsingJS(sizeSCheckBox);
        highlightElement(sizeMCheckBox);
        clickUsingJS(sizeMCheckBox);
        highlightElement(sizeLCheckBox);
        clickUsingJS(sizeLCheckBox);
    }

    public void markCompositions() {
        highlightElement(cottonComposite);
        clickUsingJS(cottonComposite);
        highlightElement(polyesterComposite);
        clickUsingJS(polyesterComposite);
        highlightElement(viscoseComposite);
        clickUsingJS(viscoseComposite);
    }

    public void markDressStyles() {
        clickUsingJS(casualStyle);
        clickUsingJS(dressyStyle);
        clickUsingJS(girlyStyle);
    }

    public void markProperties() {
        clickUsingJS(colorfulDress);
        clickUsingJS(maxiDress);
        clickUsingJS(midiDress);
        clickUsingJS(shortDress);
        clickUsingJS(shortSleeve);
    }

    public void markAvailability() {
        clickUsingJS(inStock);
    }

    public void markManufacturer() {
        clickUsingJS(manufacturer);
    }

    public void markCondition() {
        clickUsingJS(condition);
    }

    public void verifyData(String information, By element) {
        clickElement(element);
        Assert.assertTrue(DriverInit.getInstance().findElement(By.xpath("//*[text()='" + information + "']")).isDisplayed());
        backCommand();
    }

    public void verifyDelivery(String information) {
        verifyData(information, deliveryInformation);
    }

    public void verifyLegalNotice(String information) {
        verifyData(information, legalNotice);

    }

    public void verifyTermsAndConditionsOfUse(String information) {
        verifyData(information, termsAndConditionsOfUse);

    }

    public void verifyAboutUs(String information) {
        verifyData(information, aboutUs);
    }

    public void verifySecurePayment(String information) {
        verifyData(information, securePayment);

    }

    public void verifyOurStores(String information) {
        verifyData(information, ourStores);
    }

    public void PriceDrop() {
        //Selecting sort by price: lowest first
        selectPicklistValue(priceDrop, 1);
        //Selecting sort by price: highest firsts
        selectPicklistValue(priceDrop, 2);
        //Selecting sort by product name: A to Z
        selectPicklistValue(priceDrop, 3);
        //Selecting sort by product name: Z to A
        selectPicklistValue(priceDrop, 4);
        //Selecting sort by: in stock
        selectPicklistValue(priceDrop, 5);
        //Selecting sort by reference: lowest first
        selectPicklistValue(priceDrop, 6);
        //Selecting sort by reference: highest first
        selectPicklistValue(priceDrop, 7);
    }

    public void clickSpecials() {
        clickElement(menuWithSpecials);
    }

    public void checkSpecials(String url) {
        Assert.assertTrue(DriverInit.getInstance().getCurrentUrl().contains(url));
    }

    public void hoverSpecials() {
        hoverAnElement(printedChiffonDress);
        hoverAnElement(printedSummerDress);
    }

    public void addToCompare(String dressName) {
        scrollToElement(By.xpath("//a[@title='" + dressName + "']/ancestor::div[@class='product-container']"));
        hoverAnElement(By.xpath("//a[@title='" + dressName + "']/ancestor::div[@class='product-container']"));
        clickElement(By.xpath("//a[@title='" + dressName + "']/ancestor::div[@class='product-container']//a[text()='Add to Compare']"));
    }

    public void productComparison() {
        scrollToElement(compareProducts);
        waitForElement(compareProducts, 5);
        clickElement(compareProducts);
    }

    public void checkPriceSortOnSpecials() {
        //Selecting sort by price: lowest first
        selectPicklistValue(priceDrop, 1);
        //Selecting sort by price: highest firsts
        selectPicklistValue(priceDrop, 2);
        //Selecting sort by product name: A to Z
        selectPicklistValue(priceDrop, 3);
        //Selecting sort by product name: Z to A
        selectPicklistValue(priceDrop, 4);
        //Selecting sort by: in stock
        selectPicklistValue(priceDrop, 5);
        //Selecting sort by reference: lowest first
        selectPicklistValue(priceDrop, 6);
        //Selecting sort by reference: highest first
        selectPicklistValue(priceDrop, 7);
    }

    public void verifyProductComparison() {
        Assert.assertEquals(initElement(productCompare).getText(), "PRODUCT COMPARISON");
    }

    public void backToHomePage() {
        scrollToElement(backHomePage);
        clickUsingJS(backHomePage);
    }
}