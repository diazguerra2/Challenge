package utils;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Environments {

    final Logger logger = LoggerFactory.getLogger(Environments.class);

    public String getEnvironment() {
        String envVariable = getEnv();
        logger.info("Environment in which the process runs. $ENV: " + envVariable);
        return validEnvironments(envVariable);
    }

    protected String getEnv() {
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
        return variables.getProperty("env");
    }

    public String validEnvironments(String environment) {
        List<String> validEnvironments =
                new ArrayList<String>(Arrays.asList("local", "test", "pdn"));
        if (validEnvironments.contains(environment)) {
            return environment;
        } else {
            return "local";
        }
    }

}
