package Tests;

import org.testng.annotations.Test;

public class Test5_OrderFromCategories extends SetUpTests {
    private String specialsPage = "http://automationpractice.com/index.php?controller=prices-drop";

    @Test
    public void testCatalogSite() {

        //Step 1. Check the women catalogue
        catalogPage.goInWomenSection();

        //Step 2. Check properly working drop-down section
        catalogPage.markDropDownSectionDresses();
        catalogPage.markDropDownSectionTops();

        //Step 3. Mark all dress categories
        catalogPage.markCategories();
        catalogPage.markSizes();
        catalogPage.markCompositions();
        catalogPage.markDressStyles();
        catalogPage.markProperties();
        catalogPage.markAvailability();
        catalogPage.markManufacturer();
        catalogPage.markCondition();

        //Step 4. Click price sort
        catalogPage.PriceDrop();

        //Step 5. Verify information tab
        catalogPage.verifyDelivery("Shipments and returns");
        catalogPage.verifyLegalNotice("Legal");
        catalogPage.verifyTermsAndConditionsOfUse("Terms and conditions of use");
        catalogPage.verifyAboutUs("About us");
        catalogPage.verifySecurePayment("Secure payment");
        catalogPage.verifyOurStores("Our store(s)!");

        //Step 6. Click Specials
        catalogPage.clickSpecials();

        //Step 7. Check specials is displayed
        catalogPage.checkSpecials(specialsPage);

        //Step 8. Hover specials
        catalogPage.hoverSpecials();

        //Step 9. View price sort on specials
        catalogPage.checkPriceSortOnSpecials();

        //Step 10. Compare two items
        catalogPage.addToCompare("Printed Chiffon Dress");
        catalogPage.addToCompare("Printed Summer Dress");
        catalogPage.productComparison();

        //Step 11. Verify comparison successfully
        catalogPage.verifyProductComparison();

        //Step 12. Back to home page
        catalogPage.backToHomePage();
    }
}