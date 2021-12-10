package steps.microsoft;

import net.serenitybdd.core.Serenity;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import pages.CarPage;
import utils.Variables;

public class CarSteps {


    @Page
    CarPage carPage;

    public boolean comparePrices() {
        if (Serenity.sessionVariableCalled(Variables.PRICE) == carPage.getTotalPrice() && Serenity.
                sessionVariableCalled(Variables.PRICE) == carPage.getItemAddedPrice()) {
            return true;
        }
        return false;
    }

    public void verifyCarAddedPrices() {
        MatcherAssert.assertThat(
                "prices are not equal",
                comparePrices());
    }

    public boolean verifyPricesItemsAdded(String numberItem) {
        carPage.selectItem(numberItem);
        int totalPrice = Integer.parseInt(carPage.getTotalPrice());
        int multipliedPrice = (Integer.parseInt(Serenity.sessionVariableCalled(Variables.PRICE))) * 20;
        return multipliedPrice == totalPrice;
    }

    public void verifyTotalItems(String itemNumber) {
        MatcherAssert.assertThat(
                "prices are not correct",
                verifyPricesItemsAdded(itemNumber));
    }
}
