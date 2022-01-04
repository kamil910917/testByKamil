package Tests;

import org.testng.annotations.Test;

public class Test4_HoverElementsFromHomePageAndOrderFromContentTab extends SetUpTests {

    @Test
    public void HomePageHover() {

        //Step 1. hover women section
        homePage.hoverTheWomenPhrase();

        //Step 2. hover dress phrase
        homePage.hoverTheDressPhrase();

        //Step 3. Check advertisement
        homePage.checkAdvertisement();

        //Step 4. Hover the t-shirts
        homePage.hoverPopularCollection();

        //Step 5. Hover best sellers
        homePage.hoverBestSellers();

        //Step 6. Hover a pictures
        homePage.displayTshirts();

        //Step 7. View Larger Printed Chiffon Dress
        homePage.ViewLargerPrintedChiffonDress();

        //Step 8. Display next Dresses
        homePage.clickNextDress();

        //Step 9. Display previous Dresses
        homePage.clickPreviousDress();

        //Step 10. Check quantity
        homePage.checkRestFunctions();
    }
}
