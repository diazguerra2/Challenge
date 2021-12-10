package definitions;

import cucumber.api.java.Before;
import net.thucydides.core.annotations.Steps;
import steps.microsoft.HomeSteps;
import utils.Environments;

public class Setup {

    @Steps
    HomeSteps homeSteps;

    Environments environments = new Environments();

    @Before("@microsoft")
    public void selectEnvironment() {
        if ("pdn".equals(environments.getEnvironment())) {
            homeSteps.goMicrosoftWebSite();
        } else if ("local".equals(environments.getEnvironment())) {
            homeSteps.goMicrosoftWebSite();
        }
    }

}
