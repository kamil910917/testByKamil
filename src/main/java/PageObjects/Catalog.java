package PageObjects;

import Driver.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Catalog extends CommonPage {

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
    private By leftBlock = By.xpath("//ul[@class='product_list grid row']/li[1]");
    private By rightBlock = By.xpath("//ul[@class='product_list grid row']/li[2]");
    private By printedChiffonDressAddToCompare = By.xpath("//*[@id='center_column']/ul/li[1]/div/div[3]/div[2]/a");
    private By printedSummerDressAddToCompare = By.xpath("//*[@id='center_column']/ul/li[2]/div/div[3]/div[2]/a");
    private By compareButton = By.xpath("//button[@class='btn btn-default button button-medium bt_compare bt_compare']");
    private By productCompare = By.xpath("//h1[@class='page-heading']");
    private By leftBlockRemoveItem = By.xpath("//*[@id='product_comparison']/tbody/tr[1]/td[2]/div[1]/a");
    private By rightBlockRemoveItem = By.xpath("//*[@id='product_comparison']/tbody/tr[1]/td[2]/div[1]/a");
    private By backHomePage = By.xpath("//*[text()='Continue Shopping']");

    public void goInWomenSection() {
        highlightElement(womenSection);
        hoverAnElement(womenSection);
        clickElement(womenSection);
    }

    public void checkDropDownSectionTops() {
        clickElement(womenTops);
        clickElement(womenTops);
    }

    public void checkDropDownSectionDresses() {
        clickElement(womenDresses);
        clickElement(womenDresses);
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

    public void markDressProperties() {
        clickUsingJS(colorfulDress);
        clickUsingJS(maxiDress);
        clickUsingJS(midiDress);
        clickUsingJS(shortDress);
        clickUsingJS(shortSleeve);
    }

    public void checkAvailability() {
        clickUsingJS(inStock);
    }

    public void markManufacturer() {
        clickUsingJS(manufacturer);
    }

    public void dressCondition() {
        clickUsingJS(condition);
    }

    public void verifyInformationMenu() {
        clickElement(deliveryInformation);
        backCommand();
        clickElement(legalNotice);
        backCommand();
        clickElement(termsAndConditionsOfUse);
        backCommand();
        clickElement(aboutUs);
        backCommand();
        clickElement(securePayment);
        backCommand();
        clickElement(ourStores);
        backCommand();
    }

    public void checkPriceDrop() {
        selectAnElement(priceDrop, 1);
        selectAnElement(priceDrop, 2);
        selectAnElement(priceDrop, 3);
        selectAnElement(priceDrop, 4);
        selectAnElement(priceDrop, 5);
        selectAnElement(priceDrop, 6);
        selectAnElement(priceDrop, 7);
    }

    public void checkSpecials() {
        clickElement(menuWithSpecials);
        hoverAnElement(printedChiffonDress);
        hoverAnElement(printedSummerDress);
    }

    public void comparePCD() {
        scrollToElement(leftBlock);
        moveToElement(leftBlock);
        clickUsingJS(printedChiffonDressAddToCompare);
    }

    public void checkPriceSortOnSpecials() {
        selectAnElement(priceDrop, 1);
        selectAnElement(priceDrop, 2);
        selectAnElement(priceDrop, 3);
        selectAnElement(priceDrop, 4);
        selectAnElement(priceDrop, 5);
        selectAnElement(priceDrop, 6);
        selectAnElement(priceDrop, 7);
    }

    public void comparePSD() {
        moveToElement(rightBlock);
        clickUsingJS(printedSummerDressAddToCompare);
        clickElement(compareButton);
    }

    public void verifyProductComparison() {
        WebElement productComparisonHeading = initElement(productCompare);
        String text = productComparisonHeading.getText();
        Assert.assertEquals(text, "PRODUCT COMPARISON");
    }

    public void removeProductFromComparison() {
        clickElement(leftBlockRemoveItem);
        clickElement(rightBlockRemoveItem);
    }

    public void backToHomePage() {
        scrollToElement(backHomePage);
        clickUsingJS(backHomePage);
    }
}
