package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties = new Properties();

    public ConfigReader() throws IOException {
        File file = new File("/Users/admin/Developments/LocusApi/src/main/resources/config.Properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
    }

    public String getCreateRequestUrl(){
        return properties.getProperty("create_location");
    }
}
