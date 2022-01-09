package Tests;

import PageObjects.PageFooter;
import org.testng.annotations.Test;


public class Test3_VerificationOfPageFooterSection extends SetUpTests {
    private String facebookUrl = "facebook.com";
    private String twitterUrl = "https://twitter.com/seleniumfrmwrk";
    private String youtubeUrl = "https://consent.youtube.com/";
    private String googleUrl = "https://accounts.google.com/";

    @Test
    public void CheckPageStopper() {

        //Step 1. Scroll to stopper and click the Facebook reference
        pageFooter.scrollToStopper();
        pageFooter.clickReference("facebook");
        pageFooter.switchWindow();

        //Step 2. Check the Facebook is displayed
        pageFooter.verifyURL(facebookUrl);

        //Step 3. Close window and switch to base Window
        pageFooter.closeWindow();
        pageFooter.switchToBaseWindow(baseWindow);

        //Step 4. Click the Twitter reference
        pageFooter.clickReference("twitter");
        pageFooter.switchWindow();

        //Step 5. Check the Twitter is displayed
        pageFooter.verifyURL(twitterUrl);

        //Step 6. Close window and switch to base Window
        pageFooter.closeWindow();
        pageFooter.switchToBaseWindow(baseWindow);

        //Step 7. Check the YouTube reference
        pageFooter.clickReference("youtube");
        pageFooter.switchWindow();

        //Step 8. Check YouTube is displayed
        pageFooter.verifyURL(youtubeUrl);

        //Step 9. Verify YouTube search box
        pageFooter.checkYoutubeSearch();

        //Step 10. Close window and switch to base Window
        pageFooter.closeWindow();
        pageFooter.switchToBaseWindow(baseWindow);

        //Step 11. Click Google reference
        pageFooter.clickReference("google-plus");
        pageFooter.switchWindow();

        //Step 12. Verify Google is displayed
        pageFooter.verifyURL(googleUrl);
        pageFooter.closeWindow();
        pageFooter.switchToBaseWindow(baseWindow);

        //Step 13. Verify categories reference
        pageFooter.scrollToStopper();
        pageFooter.verifyPageFooterCategoriesReference();

        //Step 14. Verify references to my account and information
        pageFooter.verifyReference("Specials", PageFooter.specialsDisplay);
        pageFooter.verifyReference("New products", PageFooter.newProductsDisplay);
        pageFooter.verifyReference("Best sellers", PageFooter.bestSellersDisplay);
        pageFooter.verifyReference("Our stores", PageFooter.ourStoresDisplay);
        pageFooter.verifyReference("Contact us", PageFooter.contactUsDisplay);
        pageFooter.verifyReference("Terms and conditions of use", PageFooter.termsAndConditionsOfUseDisplay);
        pageFooter.verifyReference("About us", PageFooter.aboutUsDisplay);
        pageFooter.verifyReference("Sitemap", PageFooter.siteMapDisplay);
        pageFooter.verifyReference("My orders", PageFooter.myAccountReferencesForNotLoggedUsers);
        pageFooter.verifyReference("My credit slips", PageFooter.myAccountReferencesForNotLoggedUsers);
        pageFooter.verifyReference("My addresses", PageFooter.myAccountReferencesForNotLoggedUsers);
        pageFooter.verifyReference("Manage my personal information", PageFooter.myAccountReferencesForNotLoggedUsers);

        //Step 15 Click Newsletter and insert an email
        pageFooter.newsletter();

        //Step 16. Verify successfully subscribe to Newsletter
        pageFooter.verifySuccessfullySubscribedToNewsletter();
    }
}