package Tests;

import org.testng.annotations.Test;

public class Test1_AccountRegistrationAndAccountSettings extends SetUpTests {

    @Test
    public void myFirstTest() {

        //Step 1. Click sign in button
        homePage.clickSignInButton();

        //Step 2. Insert an email
        registrationPage.insertEmail();

        //Step 3. Submit to create an account
        registrationPage.clickToCreateAnAccount();

        //Step 4. Set all requirement values needed to create an account
        registrationPage.setAccountRequiredValues();

        //Step 5. Set all requirement fields needed to shipment
        registrationPage.setPersonalData();

        //Step 6. Submit implemented data
        registrationPage.submitPersonalData();

        //Step 7. Verify create an account
        registrationPage.verifyRegistrationProcess();

        //Step 8. Display order history
        registrationPage.viewOrderHistoryAndDetails();

        //Step 9. Display my credits slips
        registrationPage.viewMyCreditSlips();

        //Step 10. Check the address accordance
        registrationPage.viewMyAddress();

        //Step 11. Verify address
        registrationPage.verifyMyAddress();

        //Step 12. Update personal information
        registrationPage.updatePersonalInformation();

        //Step 13. Verify changes
        registrationPage.verifyPersonalInformationUpdate();

        //Step 14. Delete address
        registrationPage.deleteAddress();

        //Step 15. Verify address delete
        registrationPage.verifyDelete();

        //Step 16. Back to account settings
        registrationPage.backToAccount();

        //Step 17. Display wish list
        registrationPage.viewWishLists();

        //Step 18. New wish list
        registrationPage.saveNewWishList();

        //Step 19. Verify wish list
        registrationPage.verifyWishList();

        //Step 20. Delete wish from list
        registrationPage.deleteWishFromList();

        //Step 21. Back to store
        registrationPage.backToMyStore();
    }
}