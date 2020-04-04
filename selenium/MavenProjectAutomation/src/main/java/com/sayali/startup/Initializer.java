package com.sayali.startup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Initializer {

    public static WebDriver getBrowser(String browserName) {

        WebDriver driver;

        switch (browserName)
        {
            case "Mozilla":
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Downloads\\GeckoDriver.exe");
                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                capabilities.setCapability("marionette", true);
                driver = new FirefoxDriver();

                break;
            default:
                throw new IllegalStateException("Unexpected value: " + browserName);
        }
         

        return driver;


    }


}
