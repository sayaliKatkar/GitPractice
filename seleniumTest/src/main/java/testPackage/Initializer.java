package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Initializer {

    public static WebDriver getBrowser(String browserName) {

        WebDriver driver;

        if ("Mozilla".equals(browserName)) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Downloads\\GeckoDriver.exe");
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette", true);
            driver = new FirefoxDriver();
        } else {
            throw new IllegalStateException("Unexpected value: " + browserName);
        }
         

        return driver;


    }


}
