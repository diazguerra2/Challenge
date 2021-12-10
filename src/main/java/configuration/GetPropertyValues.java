package configuration;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertyValues {

    String url = "";
    InputStream inputStream;

    public String getUrl() throws IOException {

        try {
            Properties prop = new Properties();
            String propFileName = "configuration.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found");
            }
            String url = prop.getProperty("url");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return url;
    }

}
