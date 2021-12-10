package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.WebDriver;


@DefaultUrl("https://www.microsoft.com/en-us/")
@NamedUrls({
        @NamedUrl(name = "pdn", url = "https://www.microsoft.com/en-us/"),
})

public class HomePage extends PageObject {

    @FindBy(xpath = "//a[@id='shellmenu_1']")
    private WebElementFacade lnkOffice;

    @FindBy(xpath = "//a[@id='shellmenu_2']")
    private WebElementFacade lnkWindows;

    @FindBy(xpath = "//a[@id='shellmenu_3']")
    private WebElementFacade lnkSurface;

    @FindBy(xpath = "//a[@id='shellmenu_4']")
    private WebElementFacade lnkXbox;

    @FindBy(xpath = "//a[@id='shellmenu_5']")
    private WebElementFacade lnkDeals;

    @FindBy(xpath = "//a[@id='l1_support']")
    private WebElementFacade lnkSupport;

    @FindBy(id = "uhfLogo")
    private WebElementFacade logo;

    public HomePage(WebDriver wdriver) {
        super(wdriver);
    }

    public boolean verifyOffice() {
        return lnkOffice.isPresent();
    }

    public boolean verifyWindows() {
        return lnkWindows.isPresent();
    }

    public boolean verifySurface() {
        return lnkSurface.isPresent();
    }

    public boolean verifyXbox() {
        return lnkXbox.isPresent();
    }

    public boolean verifyDeals() {
        return lnkDeals.isPresent();
    }

    public boolean verifySupport() {
        return lnkSupport.isPresent();
    }

    public void clickWindows() {
        lnkWindows.waitUntilVisible();
        lnkWindows.click();
    }

    public boolean verifyOpenedWebSite(){
        logo.waitUntilVisible();
      return logo.isPresent();
    }

}
