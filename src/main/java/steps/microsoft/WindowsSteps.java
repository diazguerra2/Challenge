package steps.microsoft;

import net.serenitybdd.core.Serenity;
import org.fluentlenium.core.annotation.Page;
import pages.WindowsPage;
import utils.Variables;

public class WindowsSteps {

    @Page
    WindowsPage windowsPage;

    public void printElementsListed(){
        windowsPage.clickWindowsOS();
        System.out.print(windowsPage.getElementsWindowsOSList());
    }

    public void search(String words){
        windowsPage.clickSearchBtn();
        windowsPage.typeInSearch(words);
    }

    public String getPricesListed(String indicator){
        windowsPage.goElementResultSearched(indicator);
        System.out.print(windowsPage.getPrice());
        return windowsPage.getPrice();
    }

    public boolean verifyPrices(String indicator) {
        windowsPage.goElementResultSearched(indicator);
        if (Serenity.sessionVariableCalled(Variables.PRICE) == windowsPage.getPrice()) {
            return true;
        }
        return false;
    }

    public void addToCar(){
        windowsPage.addCar();
    }

}
