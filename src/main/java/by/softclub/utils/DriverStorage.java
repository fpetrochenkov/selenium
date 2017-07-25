package by.softclub.utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.openqa.selenium.WebDriver;

public class DriverStorage {
	
	private static Map<Long, WebDriver> driverMap = new ConcurrentHashMap();

    public static void putWebDriver(Long id, WebDriver driver){
        driverMap.put(id, driver);
    }

    public static WebDriver getWebDriver(Long id){
        return driverMap.get(id);
    }

}
