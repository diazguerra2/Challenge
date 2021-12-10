package definitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.microsoft.CarSteps;
import steps.microsoft.HomeSteps;
import steps.microsoft.WindowsSteps;
import utils.Operations;

import java.io.IOException;


public class MicrosoftDefinition {
    @Steps
    HomeSteps homeSteps;
    @Steps
    WindowsSteps windowsSteps;
    @Steps
    CarSteps carSteps;

    @Given("^that a user accesses the microsoft web site$")
    public void goMicrosoftWebSite() throws IOException {
        homeSteps.verifyOfficePresence();
        homeSteps.verifyWindowsPresence();
        homeSteps.verifySurfacePresence();
        homeSteps.verifyXboxPresence();
        homeSteps.verifyDealsPresence();
        homeSteps.verifySupportPresence();
    }

    @And("^navigates on the web site$")
    public void navigatesWebSite() throws InterruptedException {
        homeSteps.goWindows();
        windowsSteps.printElementsListed();
    }

    @When("^the user searches for visual studio$")
    public void searchVisualStudio() {
        Operations operation = new Operations();
        operation.iterarSearch();
        windowsSteps.search("Visual Studio");
    }

    @And("^compares its prices$")
    public void comparePrices() {
        windowsSteps.search("Visual Studio");
        windowsSteps.verifyPrices("1");
    }

    @Then("^verifies that the prices are as indicated and makes the purchase\\.$")
    public void verifyPrices() {
        windowsSteps.addToCar();
        carSteps.verifyCarAddedPrices();
        carSteps.verifyTotalItems("20");
    }
}


