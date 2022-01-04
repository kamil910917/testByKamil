package Tests;

import org.testng.annotations.Test;

public class Test5_OrderFromCategories extends SetUpTests {

    @Test
    public void testCatalogSite() throws InterruptedException {

        //Step 1. Check the women catalogue
        catalogPage.goInWomenSection();

        //Step 2. Check properly working drop-down section
        catalogPage.checkDropDownSectionDresses();
        catalogPage.checkDropDownSectionTops();

        //Step 3. Mark all dress categories
        catalogPage.markCategories();
        catalogPage.markSizes();
        catalogPage.markCompositions();
        catalogPage.markDressStyles();
        catalogPage.markDressProperties();
        catalogPage.checkAvailability();
        catalogPage.markManufacturer();
        catalogPage.dressCondition();

        //Step 4. Check information section
        catalogPage.verifyInformationMenu();

        //Step 5. Verify price sorting on catalog page
        catalogPage.checkPriceDrop();

        //Step 6. Check women specials
        catalogPage.checkSpecials();
        catalogPage.comparePCD();
        catalogPage.checkPriceSortOnSpecials();   // <<----- tutaj pomiędzy comparePCD i comparePSD wrzuciłem check price sort bo nie działa prawidłowo(do porownania nie dodaje rownolegle dwóćh sukienek...) w innym przypadku musiałbym użyć Thread.sleep.
        catalogPage.comparePSD();

        //Step 7. Verify comparison successfully
        catalogPage.verifyProductComparison();

        //Step 8. Remove products from comparison
        catalogPage.removeProductFromComparison();

        //Step 9. Back to home page
        catalogPage.backToHomePage();
    }
}
