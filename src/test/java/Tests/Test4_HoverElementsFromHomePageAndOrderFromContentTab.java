package Tests;

import org.testng.annotations.Test;

public class Test4_HoverElementsFromHomePageAndOrderFromContentTab extends SetUpTests {
    private String values = "10000";

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
        homePage.clickPrintedChiffonDress();

        //Step 7. View Larger Printed Chiffon Dress
        homePage.ViewLargerPrintedChiffonDress();

        //Step 8. Display next Dresses
        homePage.clickNextDress();

        //Step 9. Display previous Dresses
        homePage.clickPreviousDress();

        //Step 10. Highlight social icons
        homePage.hoverSocialIcons();

        //Step 11. Click icon send to a friend and verify if display
        homePage.clickAndVerifySendToAFriend();

        //Step 12. Insert recipient name and email address and click send to
        homePage.typeRecipient();

        //Step 13. Verify successfully of sending
        homePage.verifySending();

        //Step 14. Set quantity values
        homePage.putValuesIntoBoxProduct(values);

        //Step 15. Set dress color and it's size
        homePage.setDressSizeAndColor();

        //Step 16. Add product to shopping cart
        homePage.addProductToShoppingCart();

        //Step 17. Remove product from shopping cart
        homePage.removeProductFromShoppingCart();

        //Step 18. Return to base window
        homePage.goBackToBaseWindow();
    }
}