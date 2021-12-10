package utils;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import steps.microsoft.WindowsSteps;

public class Operations {

    @Steps
    WindowsSteps windowsSteps;

    public void iterarSearch() {
        for (Integer iterator = 1; iterator <= 3; iterator++) {
            windowsSteps.search("Visual Studio");
            String value = windowsSteps.getPricesListed(iterator.toString());
            if (iterator == 1) {
                Serenity.setSessionVariable(Variables.PRICE).to(value);
            }
        }
    }
}
