package steps.microsoft;

import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import pages.HomePage;

public class HomeSteps {

    @Page
    HomePage homePage;

    public void verifyOfficePresence() {
        MatcherAssert.assertThat(
                "The element is not visible",
                homePage.verifyOffice());
    }

    public void verifyWindowsPresence() {
        MatcherAssert.assertThat(
                "The element is not visible",
                homePage.verifyWindows());
    }

    public void verifySurfacePresence() {
        MatcherAssert.assertThat(
                "The element is not visible",
                homePage.verifySurface());
    }

    public void verifyXboxPresence() {
        MatcherAssert.assertThat(
                "The element is not visible",
                homePage.verifyXbox());
    }

    public void verifyDealsPresence() {
        MatcherAssert.assertThat(
                "The element is not visible",
                homePage.verifyDeals());
    }

    public void verifySupportPresence() {
        MatcherAssert.assertThat(
                "The element is not visible",
                homePage.verifySupport());
    }

    public void goWindows() throws InterruptedException {
        homePage.wait(5);
        homePage.clickWindows();
    }

    public void goMicrosoftWebSite() {
        Assert.assertTrue(homePage.verifyOpenedWebSite());
    }

}

