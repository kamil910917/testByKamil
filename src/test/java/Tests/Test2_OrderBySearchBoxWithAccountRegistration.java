package Tests;

import org.testng.annotations.Test;

public class Test2_OrderBySearchBoxWithAccountRegistration extends SetUpTests {

    private String product = "dress";

    @Test
    public void Order() {

        //Step 1. Find a dress using a searching box
        homePage.searchPhrase(product);

        //Step 2. Verify a search result
        orderPage.verifySearchingBox(product);

        //Step 3. Add dress to shopping cart
        orderPage.addProductToCart();

        //Step 4. Go to shopping summary
        orderPage.shoppingSummary();

        //Step 5. Insert email for account create
        orderPage.insertAnEmailAddressToCreateAnAccount();

        //Step 6. Fill and submit all information essential to create an account
        orderPage.createAnAccount();

        //Step 7. Check the account has been created
        orderPage.verifyAccountCreate();

        //Step 8. Display address tab
        orderPage.confirmDeliveryAddress();

        //Step 9. Check address confirm
        orderPage.verifyAddress();

        //Step 10. Display terms of service message read
        orderPage.clickTermsOfService();

        //Step 11. Click check box to agree the terms of service
        orderPage.termsOfServiceAgreeAndShippingApprove();

        //Step 12. Display payment methods
        orderPage.verifyPaymentIsDisplayed();

        //Step 13. Choose payment method
        orderPage.choosePaymentMethod();

        //Step 14. Display payment summary
        orderPage.verifyPaymentSummary();

        //Step 15. Confirmation order section
        orderPage.confirmPayment();

        //Step 16. Verify place an order successfully
        orderPage.verifyOrderConfirmation();

        //Step 17. Display order history
        orderPage.verifyDisplayOfPlacedOrder();

        //Step 18. Click order status and verify send message status
        orderPage.orderHistorySection();

        //Step 19. Return to my Store
        orderPage.goToBaseWindow();
    }
}