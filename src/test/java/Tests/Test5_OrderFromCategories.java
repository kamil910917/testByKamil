package Tests;

import org.testng.annotations.Test;

public class Test5_OrderFromCategories extends SetUpTests {

    @Test
    public void testCatalogSite() throws InterruptedException {

        //Step 1. Check the women catalogue
        catalog.goInWomenSection();

        //Step 2. Check properly working drop-down section
        catalog.checkDropDownSectionDresses();
        catalog.checkDropDownSectionTops();

        //Step 3. Mark all dress categories
        catalog.markCategories();
        catalog.markSizes();
        catalog.markCompositions();
        catalog.markDressStyles();
        catalog.markDressProperties();
        catalog.checkAvailability();
        catalog.markManufacturer();
        catalog.dressCondition();

        //Step 4. Check information section
        catalog.verifyInformationMenu();

        //Step 5. Verify price sorting on catalog page
        catalog.checkPriceDrop();

        //Step 6. Check women specials
        catalog.checkSpecials();
        catalog.comparePCD();
        catalog.checkPriceSortOnSpecials();   // <<----- tutaj pomiędzy comparePCD i comparePSD wrzuciłem check price sort bo nie działa prawidłowo(do porownania nie dodaje rownolegle dwóćh sukienek...) w innym przypadku musiałbym użyć Thread.sleep.
        catalog.comparePSD();

        //Step 7. Verify comparison successfully
        catalog.verifyProductComparison();

        //Step 8. Remove products from comparison
        catalog.removeProductFromComparison();

        //Step 9. Back to home page
        catalog.backToHomePage();
    }
}
