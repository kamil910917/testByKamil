package Tests;

import org.testng.annotations.Test;

public class Test6_VerificationOfContactWithCustomerService extends SetUpTests {

    @Test
    public void requestToCustomerService() {

        //Step 1. Click button "Contact us"
        homePage.contactWithCustomerService();

        //Step 2. Type a subject heading
        contact.selectASubjectHeading();

        //Step 3. Insert an email
        contact.insertEmail();

        //Step 4. Insert order reference
        contact.insertOrderReference();

        //Step 5. Write a message and send to customer service team
        contact.exampleMessage();

        //Step 6. Send message to customer service
        contact.submitMessage();

        //Step 7. Verify sending successfully
        contact.verifyAMessageHasBeenSent();

        //Step 8. back to home page
        contact.backToHomePage();
    }
}
