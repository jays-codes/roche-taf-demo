package jayslabs.roche.tafdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
    private static Properties prop;
    
    static {
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream(
                System.getProperty("user.dir") 
                + "/src/main/resources/GlobalData.properties");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
} 