package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class WindowsPage extends PageObject {

    @FindBy(id = "c-shellmenu_56")
    private WebElementFacade windowsOSLink;

    @FindBy(xpath = "//header/div[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/ul[1]")
    private WebElementFacade windowsOSList;

    @FindBy(id = "search")
    private WebElementFacade searchBtn;

    @FindBy(id = "cli_shellHeaderSearchInput")
    private WebElementFacade searchTxt;

    @FindBy(id = "universal-header-search-auto-suggest-ul")
    private WebElementFacade resultSearchListed;

    @FindBy(xpath = "//div[@class='pb-4 pr-lg-4']//span[@class='font-weight-semibold']")
    private WebElementFacade prices;

    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    private WebElementFacade addCarBtn;


    public void clickWindowsOS() {
        windowsOSLink.waitUntilVisible();
        windowsOSLink.click();
    }

    public String getElementsWindowsOSList() {
        windowsOSList.waitUntilVisible();
        return windowsOSList.getText();
    }

    public void clickSearchBtn() {
        searchBtn.waitUntilVisible();
        searchBtn.click();
    }

    public void typeInSearch(String words) {
        searchTxt.waitUntilVisible();
        searchTxt.clear();
        searchTxt.type(words);
    }

    public void goElementResultSearched(String indicator) {
        resultSearchListed.waitUntilVisible();
        resultSearchListed.findElement(By.xpath(String.format(
                "//header/div[1]/div[1]/div[4]/form[1]/div[2]/ul[1]/li['%s']/a[1]", indicator))).click();
    }

    public String getPrice() {
        prices.waitUntilVisible();
        return prices.getText();
    }

    public void addCar(){
        addCarBtn.waitUntilVisible();
        addCarBtn.click();
    }
}
