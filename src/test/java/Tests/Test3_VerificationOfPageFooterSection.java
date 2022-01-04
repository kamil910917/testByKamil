package Tests;

import org.testng.annotations.Test;


public class Test3_VerificationOfPageFooterSection extends SetUpTests {
    private String facebookUrl = "facebook.com";
    private String twitterUrl = "https://twitter.com/seleniumfrmwrk";
    private String youtubeUrl = "https://consent.youtube.com/";
    private String googleUrl = "https://accounts.google.com/";

    @Test
    public void CheckPageStopper() {

        //Step 1. Test of subscribe to newsletter
        pageStopper.checkNewsLetter();

        //Step 2. Verify successfully subscribed
        pageStopper.verifySuccessfullySubscribedToNewsletter();

        //Step 3. Scroll to stopper and click the Facebook reference
        pageStopper.scrollToStopper();
        pageStopper.clickReference("facebook");
        pageStopper.switchWindow();

        //Step 4. Check the Facebook is displayed
        pageStopper.verifyURL(facebookUrl);

        //Step 5. Close window and switch to base Window
        pageStopper.closeWindow();
        pageStopper.switchToWindows(baseWindow);

        //Step 6. Click the Twitter reference
        pageStopper.clickReference("twitter");
        pageStopper.switchWindow();

        //Step 7. Check the Twitter is displayed
        pageStopper.verifyURL(twitterUrl);

        //Step 8. Close window and switch to base Window
        pageStopper.closeWindow();
        pageStopper.switchToWindows(baseWindow);

        //Step 9. Check the Youtube reference
        pageStopper.clickReference("youtube");
        pageStopper.switchWindow();

        //Step 10. Check Youtube is displayed
        pageStopper.verifyURL(youtubeUrl);

        //Step 11. Verify Youtube search box
        pageStopper.checkYoutubeSearch();

        //Step 12. Close window and switch to base Window
        pageStopper.closeWindow();
        pageStopper.switchToWindows(baseWindow);

        //Step 13. Click Google reference
        pageStopper.clickReference("google-plus");
        pageStopper.switchWindow();

        //Step 14. Verify Google is displayed
        pageStopper.verifyURL(googleUrl);
        pageStopper.closeWindow();
        pageStopper.switchToWindows(baseWindow);
    }
}