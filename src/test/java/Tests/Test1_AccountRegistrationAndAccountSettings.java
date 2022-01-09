package Tests;

import PageObjects.RegistrationPage;
import org.testng.annotations.Test;

public class Test1_AccountRegistrationAndAccountSettings extends SetUpTests {

    @Test
    public void myFirstTest() {

        //Step 1. Click sign in button
        homePage.clickSignInButton();

        //Step 2. Insert an email
        registrationPage.insertEmailToCreateAnAccount();

        //Step 3. Insertion all required values needed to create an account
        registrationPage.authenticationAndSignIn();

        //Step 4. Verify successfully open an account
        registrationPage.verifyRegistrationProcess();

        //Step 5. Check all available account bookmarks
        registrationPage.verifyDisplayOfAccountBookmarks("Orders", RegistrationPage.orderHistory);
        registrationPage.verifyDisplayOfAccountBookmarks("Credit slips", RegistrationPage.creditSlips);
        registrationPage.verifyDisplayOfAccountBookmarks("Addresses", RegistrationPage.myAddress);
        registrationPage.verifyDisplayOfAccountBookmarks("Information", RegistrationPage.yourPersonalInformation);
        registrationPage.verifyDisplayOfAccountBookmarks("My wishlists", RegistrationPage.myWishLists);

        //Step 6. Click to set new address
        registrationPage.addressUpdate();

        //Step 7. Verify new address
        registrationPage.verifySuccessfullyAddressUpdate();

        //Step 8. Delete address
        registrationPage.clickDeleteAddress();

        //Step 9. Verify it has been successfully delete
        registrationPage.verifySuccessfullyDeleteAddress();

        //Step 10. Go back to account
        registrationPage.backToAccount();

        //Step 11. Display view list
        registrationPage.viewWishLists();

        //Step 12. Insert new wish
        registrationPage.insertWish();
        registrationPage.insertWish2();

        //Step 13. Verify successfully added
        registrationPage.verifyWish();

        //Step 14. Delete wish from list
        registrationPage.deleteWishFromList();

        //Step 15. Return to base window
        registrationPage.backToMyStore();
    }
}