package Tests;

import org.testng.annotations.Test;

public class Test2_OrderBySearchBoxWithAccountRegistration extends SetUpTests {

    private String product = "dress";

    @Test
    public void Order() {

        //Step 1. Find a dress using a searching box
        homePage.searchPhrase(product);

        //Step 2. Add dress to shopping cart
        orderPage.addToCart();

        //Step 3. Account create needed to taking order
        orderPage.insertAnEmail();

        //Step 4. Set personal data to delivery
        orderPage.setAccountRequiredValues();

        //Step 5. Confirm account registration process
        orderPage.registrationAnAccount();

        //Step 6. Confirm place an order
        orderPage.confirmMyOrder();

        //Step 7. Check the payment successfully
        orderPage.verifyPayment();

        //Step 8. Display an orders
        orderPage.backToOrders();

        //Step 9. Return to homepage
        orderPage.backToHomePage();
    }
}