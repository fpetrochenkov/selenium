package by.softclub.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ConfigUtil {
	
	private static final Logger LOG = Logger.getLogger(ConfigUtil.class);
	
    private static Properties properties;
    private static final String PROPERTIES_FILE = "config.properties";
    
    static{
        properties = new Properties();
        InputStream inputStream = ConfigUtil.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE);
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
            	LOG.error(e);
                throw new RuntimeException(e);
            }
        }
    }
    
    public static String getProperty(String key) {
        String property = (System.getProperty(key) != null) ? System.getProperty(key) : properties.getProperty(key);
        if(property == null) {
            LOG.error("Property " + key + " not found neither in the System Properties nor " +
                    "in project configuration file");
            throw new RuntimeException("Property " + key + " not found neither in the System Properties nor " +
                    "in project configuration file");
        }
        return property;
    }
	


}
